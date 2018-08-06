/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import dal.AuthorDAO;
import dal.BookDAO;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tuans
 */
public class Book implements Serializable{
    private String titleId;
    private String title;
    private String pubId;
    private String note;
    private String username;
    
    public ArrayList<Author> getAuthors() throws Exception{
        ArrayList<Author>temp=new ArrayList<>();
        temp.add(new Author("1", "tuan", "teo"));
        temp.add(new Author("2", "tu", "teo"));
        AuthorDAO dao=new AuthorDAO();
        return dao.selectByBookId(titleId);
    }

    public Book() {
    }

    public Book(String titleId, String title, String pubId, String note, String username) {
        this.titleId = titleId;
        this.title = title;
        this.pubId = pubId;
        this.note = note;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    
    
}
