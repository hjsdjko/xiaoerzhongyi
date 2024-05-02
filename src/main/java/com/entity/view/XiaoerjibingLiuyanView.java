package com.entity.view;

import com.entity.XiaoerjibingLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 小儿常见疾病留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiaoerjibing_liuyan")
public class XiaoerjibingLiuyanView extends XiaoerjibingLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xiaoerjibing
			/**
			* 疾病名称
			*/
			private String xiaoerjibingName;
			/**
			* 疾病照片
			*/
			private String xiaoerjibingPhoto;
			/**
			* 疾病类型
			*/
			private Integer xiaoerjibingTypes;
				/**
				* 疾病类型的值
				*/
				private String xiaoerjibingValue;
			/**
			* 常见症状
			*/
			private String xiaoerjibingZhengzhuang;
			/**
			* 点击次数
			*/
			private Integer xiaoerjibingClicknum;
			/**
			* 小儿常见疾病详细介绍
			*/
			private String xiaoerjibingContent;
			/**
			* 护理方法
			*/
			private String xiaoerjibingHulifangfaContent;
			/**
			* 逻辑删除
			*/
			private Integer xiaoerjibingDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public XiaoerjibingLiuyanView() {

	}

	public XiaoerjibingLiuyanView(XiaoerjibingLiuyanEntity xiaoerjibingLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xiaoerjibingLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set xiaoerjibing
					/**
					* 获取： 疾病名称
					*/
					public String getXiaoerjibingName() {
						return xiaoerjibingName;
					}
					/**
					* 设置： 疾病名称
					*/
					public void setXiaoerjibingName(String xiaoerjibingName) {
						this.xiaoerjibingName = xiaoerjibingName;
					}
					/**
					* 获取： 疾病照片
					*/
					public String getXiaoerjibingPhoto() {
						return xiaoerjibingPhoto;
					}
					/**
					* 设置： 疾病照片
					*/
					public void setXiaoerjibingPhoto(String xiaoerjibingPhoto) {
						this.xiaoerjibingPhoto = xiaoerjibingPhoto;
					}
					/**
					* 获取： 疾病类型
					*/
					public Integer getXiaoerjibingTypes() {
						return xiaoerjibingTypes;
					}
					/**
					* 设置： 疾病类型
					*/
					public void setXiaoerjibingTypes(Integer xiaoerjibingTypes) {
						this.xiaoerjibingTypes = xiaoerjibingTypes;
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
					/**
					* 获取： 常见症状
					*/
					public String getXiaoerjibingZhengzhuang() {
						return xiaoerjibingZhengzhuang;
					}
					/**
					* 设置： 常见症状
					*/
					public void setXiaoerjibingZhengzhuang(String xiaoerjibingZhengzhuang) {
						this.xiaoerjibingZhengzhuang = xiaoerjibingZhengzhuang;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getXiaoerjibingClicknum() {
						return xiaoerjibingClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setXiaoerjibingClicknum(Integer xiaoerjibingClicknum) {
						this.xiaoerjibingClicknum = xiaoerjibingClicknum;
					}
					/**
					* 获取： 小儿常见疾病详细介绍
					*/
					public String getXiaoerjibingContent() {
						return xiaoerjibingContent;
					}
					/**
					* 设置： 小儿常见疾病详细介绍
					*/
					public void setXiaoerjibingContent(String xiaoerjibingContent) {
						this.xiaoerjibingContent = xiaoerjibingContent;
					}
					/**
					* 获取： 护理方法
					*/
					public String getXiaoerjibingHulifangfaContent() {
						return xiaoerjibingHulifangfaContent;
					}
					/**
					* 设置： 护理方法
					*/
					public void setXiaoerjibingHulifangfaContent(String xiaoerjibingHulifangfaContent) {
						this.xiaoerjibingHulifangfaContent = xiaoerjibingHulifangfaContent;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getXiaoerjibingDelete() {
						return xiaoerjibingDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setXiaoerjibingDelete(Integer xiaoerjibingDelete) {
						this.xiaoerjibingDelete = xiaoerjibingDelete;
					}



















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}






}
