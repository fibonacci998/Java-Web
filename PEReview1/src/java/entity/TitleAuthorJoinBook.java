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
public class TitleAuthorJoinBook implements Serializable{
    private String titleID;
    private String title;
    private String pubID;
    private String notes;
    private String username;

    public TitleAuthorJoinBook() {
    }

    public TitleAuthorJoinBook(String titleID, String title, String pubID, String notes, String username) {
        this.titleID = titleID;
        this.title = title;
        this.pubID = pubID;
        this.notes = notes;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitleID() {
        return titleID;
    }

    public void setTitleID(String titleID) {
        this.titleID = titleID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubID() {
        return pubID;
    }

    public void setPubID(String pubID) {
        this.pubID = pubID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
}
