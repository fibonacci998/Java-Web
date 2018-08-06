/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.context.DBContext;
import entity.Jobs;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tuans
 */
public class JobsDAO {
    public ArrayList<Jobs> selectAll() throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.Jobs";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Jobs>list=new ArrayList<>();
        while (rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            Double salary=rs.getDouble(3);
            Date date=rs.getDate(4);
            int active=rs.getInt(5);
            list.add(new Jobs(id, name, salary, date, active));
        }
        return list;
    }
    public void addJob(String name,Double salary,Date date,int actived) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="INSERT INTO dbo.Jobs\n" +
        "(\n" +
        "    Name,\n" +
        "    Salary,\n" +
        "    Datecreated,\n" +
        "    Activated\n" +
        ")\n" +
        "VALUES\n" +
        "(   '"+name+"',        -- Name - varchar(50)\n" +
        "    "+salary+",      -- Salary - money\n" +
        "    GETDATE(), -- Datecreated - date\n" +
        "    "+actived+"       -- Activated - bit\n" +
        ")";
        conn.prepareStatement(query).executeUpdate();
        conn.close();
    }
    public Integer selectIdByName(String name) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT ID FROM dbo.Jobs WHERE Name='"+name+"'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            Integer id=rs.getInt(1);
            return id;
        }
        return null;
    }
}
