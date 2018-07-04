/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dal.TitleAuthorDAO;
import entity.TitleAuthorJoinBook;
import java.util.List;

/**
 *
 * @author tuans
 */
public class TitleAuthorBean {
    private String auID;

    public TitleAuthorBean() {
    }
    public String getAuID() {
        return auID;
    }

    public void setAuID(String auID) {
        this.auID = auID;
    }
    public List<TitleAuthorJoinBook> selectByID() throws Exception{
        if (auID==null) return null;
        TitleAuthorDAO dao=new TitleAuthorDAO();
        return dao.selectByID(auID);
    }
}
