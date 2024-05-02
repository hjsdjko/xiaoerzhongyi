package com.entity.view;

import com.entity.XiaoertuinaCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 中医小儿推拿收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiaoertuina_collection")
public class XiaoertuinaCollectionView extends XiaoertuinaCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String xiaoertuinaCollectionValue;



		//级联表 xiaoertuina
			/**
			* 推拿名称
			*/
			private String xiaoertuinaName;
			/**
			* 推拿照片
			*/
			private String xiaoertuinaPhoto;
			/**
			* 推拿类型
			*/
			private Integer xiaoertuinaTypes;
				/**
				* 推拿类型的值
				*/
				private String xiaoertuinaValue;
			/**
			* 教学视频
			*/
			private String xiaoertuinaVideo;
			/**
			* 中医小儿推拿详细介绍
			*/
			private String xiaoertuinaContent;
			/**
			* 逻辑删除
			*/
			private Integer xiaoertuinaDelete;
			/**
			* 点击次数
			*/
			private Integer xiaoertuinaClicknum;

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

	public XiaoertuinaCollectionView() {

	}

	public XiaoertuinaCollectionView(XiaoertuinaCollectionEntity xiaoertuinaCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, xiaoertuinaCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getXiaoertuinaCollectionValue() {
				return xiaoertuinaCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setXiaoertuinaCollectionValue(String xiaoertuinaCollectionValue) {
				this.xiaoertuinaCollectionValue = xiaoertuinaCollectionValue;
			}



















				//级联表的get和set xiaoertuina
					/**
					* 获取： 推拿名称
					*/
					public String getXiaoertuinaName() {
						return xiaoertuinaName;
					}
					/**
					* 设置： 推拿名称
					*/
					public void setXiaoertuinaName(String xiaoertuinaName) {
						this.xiaoertuinaName = xiaoertuinaName;
					}
					/**
					* 获取： 推拿照片
					*/
					public String getXiaoertuinaPhoto() {
						return xiaoertuinaPhoto;
					}
					/**
					* 设置： 推拿照片
					*/
					public void setXiaoertuinaPhoto(String xiaoertuinaPhoto) {
						this.xiaoertuinaPhoto = xiaoertuinaPhoto;
					}
					/**
					* 获取： 推拿类型
					*/
					public Integer getXiaoertuinaTypes() {
						return xiaoertuinaTypes;
					}
					/**
					* 设置： 推拿类型
					*/
					public void setXiaoertuinaTypes(Integer xiaoertuinaTypes) {
						this.xiaoertuinaTypes = xiaoertuinaTypes;
					}


						/**
						* 获取： 推拿类型的值
						*/
						public String getXiaoertuinaValue() {
							return xiaoertuinaValue;
						}
						/**
						* 设置： 推拿类型的值
						*/
						public void setXiaoertuinaValue(String xiaoertuinaValue) {
							this.xiaoertuinaValue = xiaoertuinaValue;
						}
					/**
					* 获取： 教学视频
					*/
					public String getXiaoertuinaVideo() {
						return xiaoertuinaVideo;
					}
					/**
					* 设置： 教学视频
					*/
					public void setXiaoertuinaVideo(String xiaoertuinaVideo) {
						this.xiaoertuinaVideo = xiaoertuinaVideo;
					}
					/**
					* 获取： 中医小儿推拿详细介绍
					*/
					public String getXiaoertuinaContent() {
						return xiaoertuinaContent;
					}
					/**
					* 设置： 中医小儿推拿详细介绍
					*/
					public void setXiaoertuinaContent(String xiaoertuinaContent) {
						this.xiaoertuinaContent = xiaoertuinaContent;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getXiaoertuinaDelete() {
						return xiaoertuinaDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setXiaoertuinaDelete(Integer xiaoertuinaDelete) {
						this.xiaoertuinaDelete = xiaoertuinaDelete;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getXiaoertuinaClicknum() {
						return xiaoertuinaClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setXiaoertuinaClicknum(Integer xiaoertuinaClicknum) {
						this.xiaoertuinaClicknum = xiaoertuinaClicknum;
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
