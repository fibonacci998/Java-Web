/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Account;
/**
 *
 * @author tuans
 */
public class AccountDAO {
    private int employeeID;

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public AccountDAO() {
        employeeID=1;
    }
    
    public List<Account> selectByEmployeeID() throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="select * from Account where employeeID=?";
        PreparedStatement ps=conn.prepareStatement(query);
        ps.setInt(1, employeeID);
        ResultSet rs=ps.executeQuery();
        List<Account> list=new ArrayList<>();
        while (rs.next()){
            String userID=rs.getString(1);
            String displayName=rs.getString(2);
            Date joinedDate=rs.getDate(3);
            int active=rs.getInt(4);
            list.add(new Account(userID, displayName, joinedDate, active, employeeID));
        }
        rs.close();
        return list;
    }
    //return list of account by id
    public List<Account> selectByEmployeeID(int employeeID) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="select * from Account where employeeID=?";
        PreparedStatement ps=conn.prepareStatement(query);
        ps.setInt(1, employeeID);
        ResultSet rs=ps.executeQuery();
        List<Account> list=new ArrayList<>();
        while (rs.next()){
            String userID=rs.getString(1);
            String displayName=rs.getString(2);
            Date joinedDate=rs.getDate(3);
            int active=rs.getInt(4);
            list.add(new Account(userID, displayName, joinedDate, active, employeeID));
        }
        rs.close();
        return list;
    }
}
