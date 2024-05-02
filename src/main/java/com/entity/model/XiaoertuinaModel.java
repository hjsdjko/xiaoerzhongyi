package com.entity.model;

import com.entity.XiaoertuinaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 中医小儿推拿
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaoertuinaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：推拿名称
	 */
    public String getXiaoertuinaName() {
        return xiaoertuinaName;
    }


    /**
	 * 设置：推拿名称
	 */
    public void setXiaoertuinaName(String xiaoertuinaName) {
        this.xiaoertuinaName = xiaoertuinaName;
    }
    /**
	 * 获取：推拿照片
	 */
    public String getXiaoertuinaPhoto() {
        return xiaoertuinaPhoto;
    }


    /**
	 * 设置：推拿照片
	 */
    public void setXiaoertuinaPhoto(String xiaoertuinaPhoto) {
        this.xiaoertuinaPhoto = xiaoertuinaPhoto;
    }
    /**
	 * 获取：推拿类型
	 */
    public Integer getXiaoertuinaTypes() {
        return xiaoertuinaTypes;
    }


    /**
	 * 设置：推拿类型
	 */
    public void setXiaoertuinaTypes(Integer xiaoertuinaTypes) {
        this.xiaoertuinaTypes = xiaoertuinaTypes;
    }
    /**
	 * 获取：教学视频
	 */
    public String getXiaoertuinaVideo() {
        return xiaoertuinaVideo;
    }


    /**
	 * 设置：教学视频
	 */
    public void setXiaoertuinaVideo(String xiaoertuinaVideo) {
        this.xiaoertuinaVideo = xiaoertuinaVideo;
    }
    /**
	 * 获取：中医小儿推拿详细介绍
	 */
    public String getXiaoertuinaContent() {
        return xiaoertuinaContent;
    }


    /**
	 * 设置：中医小儿推拿详细介绍
	 */
    public void setXiaoertuinaContent(String xiaoertuinaContent) {
        this.xiaoertuinaContent = xiaoertuinaContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXiaoertuinaDelete() {
        return xiaoertuinaDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setXiaoertuinaDelete(Integer xiaoertuinaDelete) {
        this.xiaoertuinaDelete = xiaoertuinaDelete;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getXiaoertuinaClicknum() {
        return xiaoertuinaClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setXiaoertuinaClicknum(Integer xiaoertuinaClicknum) {
        this.xiaoertuinaClicknum = xiaoertuinaClicknum;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
