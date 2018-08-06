/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import dal.EmployeeDAO;
import dal.RequestTypeDAO;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author tuans
 */
public class Request implements Serializable{
    private int requestId;
    private int employeeId;
    private int typeId;
    private Date fromDate;
    private Date toDate;
    private String reason;
    private String status;
    
    public RequestType getRequestType() throws Exception{
        RequestTypeDAO dao=new RequestTypeDAO();
        return dao.getTypeByID(typeId);
    }
    public Employee getEmployee() throws Exception{
        EmployeeDAO dao=new EmployeeDAO();
        return dao.getEmployeeById(employeeId);
    }
    public Request() {
    }

    public Request(int requestId, int employeeId, int typeId, Date fromDate, Date toDate, String reason, String status) {
        this.requestId = requestId;
        this.employeeId = employeeId;
        this.typeId = typeId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.reason = reason;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
}
