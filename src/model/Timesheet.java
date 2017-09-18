package model;

import java.util.Date;
import java.util.List;

public class Timesheet {
    private String name;
    private Date datum;
    private String projectName;
    private String contractName;
    private String customerName;
    private String order;
    private List<String> activityClass;
    private List<String> activity;
    private double duration;
    private boolean toGetInBill;
    private boolean moreCost;
    private String comments;

    public Timesheet(String name,
                     Date datum,
                     String projectName,
                     String contractName,
                     String customerName,
                     String order,
                     List<String> activityClass,
                     List<String> activity,
                     double duration,
                     boolean toGetInBill,
                     boolean moreCost,
                     String comments) {
        this.name = name;
        this.datum = datum;
        this.projectName = projectName;
        this.contractName = contractName;
        this.customerName = customerName;
        this.order = order;
        this.activityClass = activityClass;
        this.activity = activity;
        this.duration = duration;
        this.toGetInBill = toGetInBill;
        this.moreCost = moreCost;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public List<String> getActivityClass() {
        return activityClass;
    }

    public void setActivityClass(List<String> activityClass) {
        this.activityClass = activityClass;
    }

    public List<String> getActivity() {
        return activity;
    }

    public void setActivity(List<String> activity) {
        this.activity = activity;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isToGetInBill() {
        return toGetInBill;
    }

    public void setToGetInBill(boolean toGetInBill) {
        this.toGetInBill = toGetInBill;
    }

    public boolean isMoreCost() {
        return moreCost;
    }

    public void setMoreCost(boolean moreCost) {
        this.moreCost = moreCost;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
