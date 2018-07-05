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
public class Request {
    private int resquestID;
    private int employeeID;
    private int typeID;
    private Date dateFrom;
    private Date dateTo;
    private String reason;
    private String status;

    public Request() {
    }

    public Request(int resquestID, int employeeID, int typeID, Date dateFrom, Date dateTo, String reason, String status) {
        this.resquestID = resquestID;
        this.employeeID = employeeID;
        this.typeID = typeID;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.reason = reason;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getResquestID() {
        return resquestID;
    }

    public void setResquestID(int resquestID) {
        this.resquestID = resquestID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
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
    
}
