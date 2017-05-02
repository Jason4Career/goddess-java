package com.bjike.goddess.projectissuehandle.vo;

import com.bjike.goddess.projectissuehandle.enums.*;

import java.time.LocalDate;

/**
 * 项目执行中的问题受理表现层对象
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-23 04:16 ]
 * @Description: [ 项目执行中的问题受理表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ProblemAcceptVO {

    /**
     * id
     */
    private String id;
    /**
     * 年份
     */
    private String year;

    /**
     * 地区
     */
    private String area;

    /**
     * 合同外部编号
     */
    private String externalContractNum;

    /**
     * 合同外部项目名称
     */
    private String externalContractProjectName;

    /**
     * 内部项目名称
     */
    private String internalProjectName;

    /**
     * 内部项目编号
     */
    private String internalNum;

    /**
     * 工程类型
     */
    private String projectType;

    /**
     * 通知方式
     */
    private NoticeWay noticeWay;

    /**
     * 问题具体内容
     */
    private String problemSpecificContent;

    /**
     * 问题类型
     */
    private ProblemTypes problemTypes;

    /**
     * 解决方式
     */
    private String solution;

    /**
     * 问题紧急程度
     */
    private ProblemEmergencyDegree problemEmergencyDegree;

    /**
     * 问题处理时间
     */
    private ProblemProcessingTime problemProcessingTime;

    /**
     * 受影响部门
     */
    private AffectedDepartment affectedDepartment;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExternalContractNum() {
        return externalContractNum;
    }

    public void setExternalContractNum(String externalContractNum) {
        this.externalContractNum = externalContractNum;
    }

    public String getExternalContractProjectName() {
        return externalContractProjectName;
    }

    public void setExternalContractProjectName(String externalContractProjectName) {
        this.externalContractProjectName = externalContractProjectName;
    }

    public String getInternalProjectName() {
        return internalProjectName;
    }

    public void setInternalProjectName(String internalProjectName) {
        this.internalProjectName = internalProjectName;
    }

    public String getInternalNum() {
        return internalNum;
    }

    public void setInternalNum(String internalNum) {
        this.internalNum = internalNum;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public NoticeWay getNoticeWay() {
        return noticeWay;
    }

    public void setNoticeWay(NoticeWay noticeWay) {
        this.noticeWay = noticeWay;
    }

    public String getProblemSpecificContent() {
        return problemSpecificContent;
    }

    public void setProblemSpecificContent(String problemSpecificContent) {
        this.problemSpecificContent = problemSpecificContent;
    }

    public ProblemTypes getProblemTypes() {
        return problemTypes;
    }

    public void setProblemTypes(ProblemTypes problemTypes) {
        this.problemTypes = problemTypes;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public ProblemEmergencyDegree getProblemEmergencyDegree() {
        return problemEmergencyDegree;
    }

    public void setProblemEmergencyDegree(ProblemEmergencyDegree problemEmergencyDegree) {
        this.problemEmergencyDegree = problemEmergencyDegree;
    }

    public ProblemProcessingTime getProblemProcessingTime() {
        return problemProcessingTime;
    }

    public void setProblemProcessingTime(ProblemProcessingTime problemProcessingTime) {
        this.problemProcessingTime = problemProcessingTime;
    }

    public AffectedDepartment getAffectedDepartment() {
        return affectedDepartment;
    }

    public void setAffectedDepartment(AffectedDepartment affectedDepartment) {
        this.affectedDepartment = affectedDepartment;
    }
}