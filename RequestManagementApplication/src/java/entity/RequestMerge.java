/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author tuans
 */
public class RequestMerge {
    private int resquestID;
    private String employeeName;
    private String typeName;
    private Date dateFrom;
    private Date dateTo;
    private String reason;
    private String status;

    public RequestMerge() {
    }

    public RequestMerge(int resquestID, String employeeName, String typeName, Date dateFrom, Date dateTo, String reason, String status) {
        this.resquestID = resquestID;
        this.employeeName = employeeName;
        this.typeName = typeName;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.reason = reason;
        this.status = status;
    }

    public int getResquestID() {
        return resquestID;
    }

    public void setResquestID(int resquestID) {
        this.resquestID = resquestID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
