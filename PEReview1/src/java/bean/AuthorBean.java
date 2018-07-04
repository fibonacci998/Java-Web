/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dal.AuthorDAO;
import entity.Author;
import java.util.List;

/**
 *
 * @author tuans
 */
public class AuthorBean {
    private String titleID;
    private String inputName;
    public AuthorBean() {
    }
    
    public String getTitleID() {
        return titleID;
    }
    
    public void setTitleID(String titleID) {
        this.titleID = titleID;
    }
    public String getName() throws Exception{
        String name="";
        AuthorDAO dao=new AuthorDAO();
        name=dao.getName(titleID);
        return name;
    }
    public List<Author> selectByTitleID() throws Exception{
        AuthorDAO dao=new AuthorDAO();
        return dao.selectByTitleID(titleID);
    }
    public List<Author> selectAll() throws Exception{
        AuthorDAO dao=new AuthorDAO();
        return dao.selectAll();
    }

    
    public List<Author> selectByInputName() throws Exception{
        AuthorDAO dao=new AuthorDAO();
        return dao.selectByNameAuthor(inputName);
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }
}
