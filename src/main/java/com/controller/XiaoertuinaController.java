
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 中医小儿推拿
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xiaoertuina")
public class XiaoertuinaController {
    private static final Logger logger = LoggerFactory.getLogger(XiaoertuinaController.class);

    @Autowired
    private XiaoertuinaService xiaoertuinaService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("xiaoertuinaDeleteStart",1);params.put("xiaoertuinaDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = xiaoertuinaService.queryPage(params);

        //字典表数据转换
        List<XiaoertuinaView> list =(List<XiaoertuinaView>)page.getList();
        for(XiaoertuinaView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiaoertuinaEntity xiaoertuina = xiaoertuinaService.selectById(id);
        if(xiaoertuina !=null){
            //entity转view
            XiaoertuinaView view = new XiaoertuinaView();
            BeanUtils.copyProperties( xiaoertuina , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XiaoertuinaEntity xiaoertuina, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xiaoertuina:{}",this.getClass().getName(),xiaoertuina.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<XiaoertuinaEntity> queryWrapper = new EntityWrapper<XiaoertuinaEntity>()
            .eq("xiaoertuina_name", xiaoertuina.getXiaoertuinaName())
            .eq("xiaoertuina_types", xiaoertuina.getXiaoertuinaTypes())
            .eq("xiaoertuina_video", xiaoertuina.getXiaoertuinaVideo())
            .eq("xiaoertuina_delete", xiaoertuina.getXiaoertuinaDelete())
            .eq("xiaoertuina_clicknum", xiaoertuina.getXiaoertuinaClicknum())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiaoertuinaEntity xiaoertuinaEntity = xiaoertuinaService.selectOne(queryWrapper);
        if(xiaoertuinaEntity==null){
            xiaoertuina.setXiaoertuinaDelete(1);
            xiaoertuina.setXiaoertuinaClicknum(1);
            xiaoertuina.setInsertTime(new Date());
            xiaoertuina.setCreateTime(new Date());
            xiaoertuinaService.insert(xiaoertuina);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XiaoertuinaEntity xiaoertuina, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xiaoertuina:{}",this.getClass().getName(),xiaoertuina.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<XiaoertuinaEntity> queryWrapper = new EntityWrapper<XiaoertuinaEntity>()
            .notIn("id",xiaoertuina.getId())
            .andNew()
            .eq("xiaoertuina_name", xiaoertuina.getXiaoertuinaName())
            .eq("xiaoertuina_types", xiaoertuina.getXiaoertuinaTypes())
            .eq("xiaoertuina_video", xiaoertuina.getXiaoertuinaVideo())
            .eq("xiaoertuina_delete", xiaoertuina.getXiaoertuinaDelete())
            .eq("xiaoertuina_clicknum", xiaoertuina.getXiaoertuinaClicknum())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiaoertuinaEntity xiaoertuinaEntity = xiaoertuinaService.selectOne(queryWrapper);
        if("".equals(xiaoertuina.getXiaoertuinaPhoto()) || "null".equals(xiaoertuina.getXiaoertuinaPhoto())){
                xiaoertuina.setXiaoertuinaPhoto(null);
        }
        if("".equals(xiaoertuina.getXiaoertuinaVideo()) || "null".equals(xiaoertuina.getXiaoertuinaVideo())){
                xiaoertuina.setXiaoertuinaVideo(null);
        }
        if(xiaoertuinaEntity==null){
            xiaoertuinaService.updateById(xiaoertuina);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<XiaoertuinaEntity> list = new ArrayList<>();
        for(Integer id:ids){
            XiaoertuinaEntity xiaoertuinaEntity = new XiaoertuinaEntity();
            xiaoertuinaEntity.setId(id);
            xiaoertuinaEntity.setXiaoertuinaDelete(2);
            list.add(xiaoertuinaEntity);
        }
        if(list != null && list.size() >0){
            xiaoertuinaService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<XiaoertuinaEntity> xiaoertuinaList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XiaoertuinaEntity xiaoertuinaEntity = new XiaoertuinaEntity();
//                            xiaoertuinaEntity.setXiaoertuinaName(data.get(0));                    //推拿名称 要改的
//                            xiaoertuinaEntity.setXiaoertuinaPhoto("");//照片
//                            xiaoertuinaEntity.setXiaoertuinaTypes(Integer.valueOf(data.get(0)));   //推拿类型 要改的
//                            xiaoertuinaEntity.setXiaoertuinaVideo(data.get(0));                    //教学视频 要改的
//                            xiaoertuinaEntity.setXiaoertuinaContent("");//照片
//                            xiaoertuinaEntity.setXiaoertuinaDelete(1);//逻辑删除字段
//                            xiaoertuinaEntity.setXiaoertuinaClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            xiaoertuinaEntity.setInsertTime(date);//时间
//                            xiaoertuinaEntity.setCreateTime(date);//时间
                            xiaoertuinaList.add(xiaoertuinaEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xiaoertuinaService.insertBatch(xiaoertuinaList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = xiaoertuinaService.queryPage(params);

        //字典表数据转换
        List<XiaoertuinaView> list =(List<XiaoertuinaView>)page.getList();
        for(XiaoertuinaView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiaoertuinaEntity xiaoertuina = xiaoertuinaService.selectById(id);
            if(xiaoertuina !=null){

                //点击数量加1
                xiaoertuina.setXiaoertuinaClicknum(xiaoertuina.getXiaoertuinaClicknum()+1);
                xiaoertuinaService.updateById(xiaoertuina);

                //entity转view
                XiaoertuinaView view = new XiaoertuinaView();
                BeanUtils.copyProperties( xiaoertuina , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody XiaoertuinaEntity xiaoertuina, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xiaoertuina:{}",this.getClass().getName(),xiaoertuina.toString());
        Wrapper<XiaoertuinaEntity> queryWrapper = new EntityWrapper<XiaoertuinaEntity>()
            .eq("xiaoertuina_name", xiaoertuina.getXiaoertuinaName())
            .eq("xiaoertuina_types", xiaoertuina.getXiaoertuinaTypes())
            .eq("xiaoertuina_video", xiaoertuina.getXiaoertuinaVideo())
            .eq("xiaoertuina_delete", xiaoertuina.getXiaoertuinaDelete())
            .eq("xiaoertuina_clicknum", xiaoertuina.getXiaoertuinaClicknum())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiaoertuinaEntity xiaoertuinaEntity = xiaoertuinaService.selectOne(queryWrapper);
        if(xiaoertuinaEntity==null){
            xiaoertuina.setXiaoertuinaDelete(1);
            xiaoertuina.setInsertTime(new Date());
            xiaoertuina.setCreateTime(new Date());
        xiaoertuinaService.insert(xiaoertuina);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
