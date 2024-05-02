package com.dao;

import com.entity.XiaoerjibingLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoerjibingLiuyanView;

/**
 * 小儿常见疾病留言 Dao 接口
 *
 * @author 
 */
public interface XiaoerjibingLiuyanDao extends BaseMapper<XiaoerjibingLiuyanEntity> {

   List<XiaoerjibingLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
