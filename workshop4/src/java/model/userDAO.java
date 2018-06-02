/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import ConnectDatabase.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author tuans
 */
public class userDAO {
    public String getPasswordByUsername(String username) throws Exception{
        String query="select * from account where username='"+username+"'";
        Connection conn=new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        String password="";
        while (rs.next()){
            password=rs.getString(3);
            break;
        }
        conn.close();
        return password;
    }
}
