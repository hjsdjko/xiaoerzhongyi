package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoertuinaEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 中医小儿推拿 服务类
 */
public interface XiaoertuinaService extends IService<XiaoertuinaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}