/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author tuans
 */
public class ActionHello extends ActionSupport {
    private String username;
    
    public ActionHello() {
    }
    
    public String execute() throws Exception {
        username=username.toUpperCase();
        if (username.isEmpty()) return INPUT;
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
