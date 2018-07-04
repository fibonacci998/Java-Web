/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.AccountDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tuans
 */
public class Employee implements Serializable{
    private int id;
    private String name;
    private Date dob;
    private int gender;
    private String address;

    public List<Account> getAccounts()throws Exception{
        return new AccountDAO().selectByEmployeeID(id);
    }
    
    public Employee() {
    }

    public Employee(int id, String name, Date dob, int gender, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    
}
