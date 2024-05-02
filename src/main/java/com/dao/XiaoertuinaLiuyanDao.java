package com.dao;

import com.entity.XiaoertuinaLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoertuinaLiuyanView;

/**
 * 中医小儿推拿留言 Dao 接口
 *
 * @author 
 */
public interface XiaoertuinaLiuyanDao extends BaseMapper<XiaoertuinaLiuyanEntity> {

   List<XiaoertuinaLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
