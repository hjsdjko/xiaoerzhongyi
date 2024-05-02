package com.entity.model;

import com.entity.XiaoerjibingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 小儿常见疾病
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaoerjibingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
	 * 获取：疾病名称
	 */
    public String getXiaoerjibingName() {
        return xiaoerjibingName;
    }


    /**
	 * 设置：疾病名称
	 */
    public void setXiaoerjibingName(String xiaoerjibingName) {
        this.xiaoerjibingName = xiaoerjibingName;
    }
    /**
	 * 获取：疾病照片
	 */
    public String getXiaoerjibingPhoto() {
        return xiaoerjibingPhoto;
    }


    /**
	 * 设置：疾病照片
	 */
    public void setXiaoerjibingPhoto(String xiaoerjibingPhoto) {
        this.xiaoerjibingPhoto = xiaoerjibingPhoto;
    }
    /**
	 * 获取：疾病类型
	 */
    public Integer getXiaoerjibingTypes() {
        return xiaoerjibingTypes;
    }


    /**
	 * 设置：疾病类型
	 */
    public void setXiaoerjibingTypes(Integer xiaoerjibingTypes) {
        this.xiaoerjibingTypes = xiaoerjibingTypes;
    }
    /**
	 * 获取：常见症状
	 */
    public String getXiaoerjibingZhengzhuang() {
        return xiaoerjibingZhengzhuang;
    }


    /**
	 * 设置：常见症状
	 */
    public void setXiaoerjibingZhengzhuang(String xiaoerjibingZhengzhuang) {
        this.xiaoerjibingZhengzhuang = xiaoerjibingZhengzhuang;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getXiaoerjibingClicknum() {
        return xiaoerjibingClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setXiaoerjibingClicknum(Integer xiaoerjibingClicknum) {
        this.xiaoerjibingClicknum = xiaoerjibingClicknum;
    }
    /**
	 * 获取：小儿常见疾病详细介绍
	 */
    public String getXiaoerjibingContent() {
        return xiaoerjibingContent;
    }


    /**
	 * 设置：小儿常见疾病详细介绍
	 */
    public void setXiaoerjibingContent(String xiaoerjibingContent) {
        this.xiaoerjibingContent = xiaoerjibingContent;
    }
    /**
	 * 获取：护理方法
	 */
    public String getXiaoerjibingHulifangfaContent() {
        return xiaoerjibingHulifangfaContent;
    }


    /**
	 * 设置：护理方法
	 */
    public void setXiaoerjibingHulifangfaContent(String xiaoerjibingHulifangfaContent) {
        this.xiaoerjibingHulifangfaContent = xiaoerjibingHulifangfaContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXiaoerjibingDelete() {
        return xiaoerjibingDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setXiaoerjibingDelete(Integer xiaoerjibingDelete) {
        this.xiaoerjibingDelete = xiaoerjibingDelete;
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
