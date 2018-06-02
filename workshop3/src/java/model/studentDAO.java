/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connectDatabase.DBContext;
import entity.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tuans
 */
public class studentDAO {
    public List<Student> selectAll() throws Exception{
        List<Student> list=new ArrayList<>();
        String query="SELECT * FROM dbo.Student";
        Connection conn=new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while(rs.next()){
            int idd=rs.getInt(1);
            String name=rs.getString(2);
            Boolean gender=rs.getBoolean(3);
            Date date=rs.getDate(4);
            list.add(new Student(idd, name, gender, date));
        }
        conn.close();
        return list;
    }
    public List<Student> selectfirst(int number) throws Exception{
        List<Student> list=new ArrayList<>();
        String query="SELECT TOP "+number+" * FROM dbo.Student";
        Connection conn=new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while(rs.next()){
            int idd=rs.getInt(1);
            String name=rs.getString(2);
            Boolean gender=rs.getBoolean(3);
            Date date=rs.getDate(4);
            list.add(new Student(idd, name, gender, date));
        }
        conn.close();
        return list;
    }
    public void add(String name, int gender, String dob) throws Exception{
        String query="INSERT INTO dbo.Student\n" +
        "(\n" +
        "    Name,\n" +
        "    Gender,\n" +
        "    DOB\n" +
        ")\n" +
        "VALUES\n" +
        "(   N'"+name+"',      -- Name - nvarchar(50)\n" +
        "    "+gender+",     -- Gender - bit\n" +
        "    '"+dob+"' -- DOB - date\n" +
        ")";
        Connection conn=new DBContext().getConnection();
        conn.prepareStatement(query).executeUpdate();
        conn.close();
    }
    public void update(int id, String name, int gender, String dob) throws Exception{
        String query="UPDATE dbo.Student SET Name=N'"+name+"',Gender="+gender+",DOB='"+dob+"' WHERE ID="+id;
        Connection conn=new DBContext().getConnection();
        conn.prepareStatement(query).executeUpdate();
        conn.close();
    }
    public void delete(int id) throws Exception{
        String query="DELETE FROM dbo.Student WHERE id="+id;
        Connection conn=new DBContext().getConnection();
        conn.prepareStatement(query).executeUpdate();
        conn.close();
    }
}
