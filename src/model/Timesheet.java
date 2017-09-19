package model;

import java.util.Date;

public class Timesheet {
    private String name;
    private String datum;
    private String projectName;
    private String contractName;
    private String customerName;
    private String assignment;
    private String businessClass;
    private String jobType;
    private String duration;
    private String calculation;
    private String extra;
    private String comments;

    public Timesheet(String name, String datum, String projectName,
                     String contractName, String customerName,
                     String assignment, String businessClass,
                     String jobType, String duration, String calculation,
                     String extra, String comments) {
        this.name = name;
        this.datum = datum;
        this.projectName = projectName;
        this.contractName = contractName;
        this.customerName = customerName;
        this.assignment = assignment;
        this.businessClass = businessClass;
        this.jobType = jobType;
        this.duration = duration;
        this.calculation = calculation;
        this.extra = extra;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public String getDatum() {
        return datum;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getContractName() {
        return contractName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAssignment() {
        return assignment;
    }

    public String getBusinessClass() {
        return businessClass;
    }

    public String getJobType() {
        return jobType;
    }

    public String getDuration() {
        return duration;
    }

    public String isCalculation() {
        return calculation;
    }

    public String isExtra() {
        return extra;
    }

    public String getComments() {
        return comments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public void setBusinessClass(String businessClass) {
        this.businessClass = businessClass;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
