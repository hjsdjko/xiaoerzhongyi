package com.dao;

import com.entity.XiaoertuinaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoertuinaView;

/**
 * 中医小儿推拿 Dao 接口
 *
 * @author 
 */
public interface XiaoertuinaDao extends BaseMapper<XiaoertuinaEntity> {

   List<XiaoertuinaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
