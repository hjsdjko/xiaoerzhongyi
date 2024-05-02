package com.entity.view;

import com.entity.XiaoerjibingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 小儿常见疾病
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiaoerjibing")
public class XiaoerjibingView extends XiaoerjibingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 疾病类型的值
		*/
		private String xiaoerjibingValue;



	public XiaoerjibingView() {

	}

	public XiaoerjibingView(XiaoerjibingEntity xiaoerjibingEntity) {
		try {
			BeanUtils.copyProperties(this, xiaoerjibingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 疾病类型的值
			*/
			public String getXiaoerjibingValue() {
				return xiaoerjibingValue;
			}
			/**
			* 设置： 疾病类型的值
			*/
			public void setXiaoerjibingValue(String xiaoerjibingValue) {
				this.xiaoerjibingValue = xiaoerjibingValue;
			}













}
