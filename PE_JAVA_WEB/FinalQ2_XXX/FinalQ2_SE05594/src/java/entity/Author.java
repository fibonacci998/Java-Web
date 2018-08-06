/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.context.DBContext;
import dal.AuthorDAO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author tuans
 */
public class Author implements Serializable{
    private int authorID;
    private String authorName;
    private String authorAddress;

    public Author getAuthorByID(int id) throws Exception{
        AuthorDAO dao=new AuthorDAO();
        return dao.getAuthorByID(id);
    }
    
    public Author() {
    }

    public Author(int authorID, String authorName, String authorAddress) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.authorAddress = authorAddress;
    }

    public String getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
}
