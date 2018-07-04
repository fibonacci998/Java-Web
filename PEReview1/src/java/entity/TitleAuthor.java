/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author tuans
 */
public class TitleAuthor implements Serializable{
    private String auID,titleID;
    private String order;

    public TitleAuthor() {
    }

    public TitleAuthor(String auID, String titleID, String order) {
        this.auID = auID;
        this.titleID = titleID;
        this.order = order;
    }

    public String getAuID() {
        return auID;
    }

    public void setAuID(String auID) {
        this.auID = auID;
    }

    public String getTitleID() {
        return titleID;
    }

    public void setTitleID(String titleID) {
        this.titleID = titleID;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    
}
