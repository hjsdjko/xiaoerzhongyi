package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 中医小儿推拿
 *
 * @author 
 * @email
 */
@TableName("xiaoertuina")
public class XiaoertuinaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaoertuinaEntity() {

	}

	public XiaoertuinaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 推拿名称
     */
    @TableField(value = "xiaoertuina_name")

    private String xiaoertuinaName;


    /**
     * 推拿照片
     */
    @TableField(value = "xiaoertuina_photo")

    private String xiaoertuinaPhoto;


    /**
     * 推拿类型
     */
    @TableField(value = "xiaoertuina_types")

    private Integer xiaoertuinaTypes;


    /**
     * 教学视频
     */
    @TableField(value = "xiaoertuina_video")

    private String xiaoertuinaVideo;


    /**
     * 中医小儿推拿详细介绍
     */
    @TableField(value = "xiaoertuina_content")

    private String xiaoertuinaContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "xiaoertuina_delete")

    private Integer xiaoertuinaDelete;


    /**
     * 点击次数
     */
    @TableField(value = "xiaoertuina_clicknum")

    private Integer xiaoertuinaClicknum;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：推拿名称
	 */
    public String getXiaoertuinaName() {
        return xiaoertuinaName;
    }


    /**
	 * 获取：推拿名称
	 */

    public void setXiaoertuinaName(String xiaoertuinaName) {
        this.xiaoertuinaName = xiaoertuinaName;
    }
    /**
	 * 设置：推拿照片
	 */
    public String getXiaoertuinaPhoto() {
        return xiaoertuinaPhoto;
    }


    /**
	 * 获取：推拿照片
	 */

    public void setXiaoertuinaPhoto(String xiaoertuinaPhoto) {
        this.xiaoertuinaPhoto = xiaoertuinaPhoto;
    }
    /**
	 * 设置：推拿类型
	 */
    public Integer getXiaoertuinaTypes() {
        return xiaoertuinaTypes;
    }


    /**
	 * 获取：推拿类型
	 */

    public void setXiaoertuinaTypes(Integer xiaoertuinaTypes) {
        this.xiaoertuinaTypes = xiaoertuinaTypes;
    }
    /**
	 * 设置：教学视频
	 */
    public String getXiaoertuinaVideo() {
        return xiaoertuinaVideo;
    }


    /**
	 * 获取：教学视频
	 */

    public void setXiaoertuinaVideo(String xiaoertuinaVideo) {
        this.xiaoertuinaVideo = xiaoertuinaVideo;
    }
    /**
	 * 设置：中医小儿推拿详细介绍
	 */
    public String getXiaoertuinaContent() {
        return xiaoertuinaContent;
    }


    /**
	 * 获取：中医小儿推拿详细介绍
	 */

    public void setXiaoertuinaContent(String xiaoertuinaContent) {
        this.xiaoertuinaContent = xiaoertuinaContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXiaoertuinaDelete() {
        return xiaoertuinaDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setXiaoertuinaDelete(Integer xiaoertuinaDelete) {
        this.xiaoertuinaDelete = xiaoertuinaDelete;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getXiaoertuinaClicknum() {
        return xiaoertuinaClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setXiaoertuinaClicknum(Integer xiaoertuinaClicknum) {
        this.xiaoertuinaClicknum = xiaoertuinaClicknum;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiaoertuina{" +
            "id=" + id +
            ", xiaoertuinaName=" + xiaoertuinaName +
            ", xiaoertuinaPhoto=" + xiaoertuinaPhoto +
            ", xiaoertuinaTypes=" + xiaoertuinaTypes +
            ", xiaoertuinaVideo=" + xiaoertuinaVideo +
            ", xiaoertuinaContent=" + xiaoertuinaContent +
            ", xiaoertuinaDelete=" + xiaoertuinaDelete +
            ", xiaoertuinaClicknum=" + xiaoertuinaClicknum +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
