package com.cninfo.designpattern.structural.flyweight;

public class Manager implements Employee {
    private String department;
    private String reportContent;
    private String title = "部门经理";

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
