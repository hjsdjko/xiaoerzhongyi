package com.entity.vo;

import com.entity.XiaoerjibingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 小儿常见疾病
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiaoerjibing")
public class XiaoerjibingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 疾病名称
     */

    @TableField(value = "xiaoerjibing_name")
    private String xiaoerjibingName;


    /**
     * 疾病照片
     */

    @TableField(value = "xiaoerjibing_photo")
    private String xiaoerjibingPhoto;


    /**
     * 疾病类型
     */

    @TableField(value = "xiaoerjibing_types")
    private Integer xiaoerjibingTypes;


    /**
     * 常见症状
     */

    @TableField(value = "xiaoerjibing_zhengzhuang")
    private String xiaoerjibingZhengzhuang;


    /**
     * 点击次数
     */

    @TableField(value = "xiaoerjibing_clicknum")
    private Integer xiaoerjibingClicknum;


    /**
     * 小儿常见疾病详细介绍
     */

    @TableField(value = "xiaoerjibing_content")
    private String xiaoerjibingContent;


    /**
     * 护理方法
     */

    @TableField(value = "xiaoerjibing_hulifangfa_content")
    private String xiaoerjibingHulifangfaContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "xiaoerjibing_delete")
    private Integer xiaoerjibingDelete;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：疾病名称
	 */
    public String getXiaoerjibingName() {
        return xiaoerjibingName;
    }


    /**
	 * 获取：疾病名称
	 */

    public void setXiaoerjibingName(String xiaoerjibingName) {
        this.xiaoerjibingName = xiaoerjibingName;
    }
    /**
	 * 设置：疾病照片
	 */
    public String getXiaoerjibingPhoto() {
        return xiaoerjibingPhoto;
    }


    /**
	 * 获取：疾病照片
	 */

    public void setXiaoerjibingPhoto(String xiaoerjibingPhoto) {
        this.xiaoerjibingPhoto = xiaoerjibingPhoto;
    }
    /**
	 * 设置：疾病类型
	 */
    public Integer getXiaoerjibingTypes() {
        return xiaoerjibingTypes;
    }


    /**
	 * 获取：疾病类型
	 */

    public void setXiaoerjibingTypes(Integer xiaoerjibingTypes) {
        this.xiaoerjibingTypes = xiaoerjibingTypes;
    }
    /**
	 * 设置：常见症状
	 */
    public String getXiaoerjibingZhengzhuang() {
        return xiaoerjibingZhengzhuang;
    }


    /**
	 * 获取：常见症状
	 */

    public void setXiaoerjibingZhengzhuang(String xiaoerjibingZhengzhuang) {
        this.xiaoerjibingZhengzhuang = xiaoerjibingZhengzhuang;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getXiaoerjibingClicknum() {
        return xiaoerjibingClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setXiaoerjibingClicknum(Integer xiaoerjibingClicknum) {
        this.xiaoerjibingClicknum = xiaoerjibingClicknum;
    }
    /**
	 * 设置：小儿常见疾病详细介绍
	 */
    public String getXiaoerjibingContent() {
        return xiaoerjibingContent;
    }


    /**
	 * 获取：小儿常见疾病详细介绍
	 */

    public void setXiaoerjibingContent(String xiaoerjibingContent) {
        this.xiaoerjibingContent = xiaoerjibingContent;
    }
    /**
	 * 设置：护理方法
	 */
    public String getXiaoerjibingHulifangfaContent() {
        return xiaoerjibingHulifangfaContent;
    }


    /**
	 * 获取：护理方法
	 */

    public void setXiaoerjibingHulifangfaContent(String xiaoerjibingHulifangfaContent) {
        this.xiaoerjibingHulifangfaContent = xiaoerjibingHulifangfaContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXiaoerjibingDelete() {
        return xiaoerjibingDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setXiaoerjibingDelete(Integer xiaoerjibingDelete) {
        this.xiaoerjibingDelete = xiaoerjibingDelete;
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
