package com.bjike.goddess.capability.to;

import com.bjike.goddess.common.api.to.BaseTO;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 个人能力展示
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-23 04:22 ]
 * @Description: [ 个人能力展示 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class SelfCapabilitySocialTO extends BaseTO {

    public interface TestAdd {
    }

    /**
     * 个人社交资源姓名
     */
    @NotBlank(groups = {SelfCapabilitySocialTO.TestAdd.class}, message = "个人社交资源姓名不能为空")
    private String contactName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 联系方式
     */
    private String contactWay;

    /**
     * 邮箱
     */
    private String emailName;

    /**
     * QQ/微信
     */
    private String qqOrWechat;

    /**
     * 籍贯
     */
    private String natives;

    /**
     * 爱好
     */
    private String hobby;

    /**
     * 性格评价
     */
    private String charact;

    /**
     * 家庭成员
     */
    private String family;

    /**
     * 家庭成员与本人关系
     */
    private String familyRelation;

    /**
     * 求学和培训经历
     */
    private String studyExperience;

    /**
     * 接触经历
     */
    private String connectExperience;

    /**
     * 以往工作地区
     */
    private String oldWorkPlace;

    /**
     * 生活地区
     */
    private String livePlace;

    /**
     * 成长地区
     */
    private String growthPlace;
    /**
     * 个人能力id
     */
    @NotBlank(groups = {SelfCapabilitySocialTO.TestAdd.class} ,message = "个人能力id不能为空")
    private String selfCapabilityId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;


    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getQqOrWechat() {
        return qqOrWechat;
    }

    public void setQqOrWechat(String qqOrWechat) {
        this.qqOrWechat = qqOrWechat;
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getCharact() {
        return charact;
    }

    public void setCharact(String charact) {
        this.charact = charact;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamilyRelation() {
        return familyRelation;
    }

    public void setFamilyRelation(String familyRelation) {
        this.familyRelation = familyRelation;
    }

    public String getStudyExperience() {
        return studyExperience;
    }

    public void setStudyExperience(String studyExperience) {
        this.studyExperience = studyExperience;
    }

    public String getConnectExperience() {
        return connectExperience;
    }

    public void setConnectExperience(String connectExperience) {
        this.connectExperience = connectExperience;
    }

    public String getOldWorkPlace() {
        return oldWorkPlace;
    }

    public void setOldWorkPlace(String oldWorkPlace) {
        this.oldWorkPlace = oldWorkPlace;
    }

    public String getLivePlace() {
        return livePlace;
    }

    public void setLivePlace(String livePlace) {
        this.livePlace = livePlace;
    }

    public String getGrowthPlace() {
        return growthPlace;
    }

    public void setGrowthPlace(String growthPlace) {
        this.growthPlace = growthPlace;
    }

    public String getSelfCapabilityId() {
        return selfCapabilityId;
    }

    public void setSelfCapabilityId(String selfCapabilityId) {
        this.selfCapabilityId = selfCapabilityId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}