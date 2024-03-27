package edu.danilotc.javaoneforall.javacore.Kenum.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company");

    private int dbValue;
    private String reportValue;

    CustomerType(int dbValue, String reportValue) {
        this.dbValue = dbValue;
        this.reportValue = reportValue;
    }

    public int getDbValue() {
        return dbValue;
    }

    public String getReportValue() {
        return reportValue;
    }
}
