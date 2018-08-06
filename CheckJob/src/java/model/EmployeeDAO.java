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
public class EmployeeDAO {
    public ArrayList<String> selectAllName() throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT FullName FROM dbo.Employee";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<String>list=new ArrayList<>();
        while (rs.next()){
            String name=rs.getString(1);
            list.add(name);
        }
        return list;
    }
    public ArrayList<String> selectAllID() throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT id FROM dbo.Employee";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<String>list=new ArrayList<>();
        while (rs.next()){
            String name=rs.getString(1);
            list.add(name);
        }
        return list;
    }
    public ArrayList<String> selectListByJobID(int jobid) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT FullName FROM dbo.Employee \n" +
                    " JOIN dbo.JobEmployee ON JobEmployee.Empid = Employee.ID\n" +
                    " JOIN dbo.Jobs ON Jobs.ID = JobEmployee.Jobid \n" +
                    " WHERE Jobs.ID = "+jobid;
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<String>list=new ArrayList<>();
        while (rs.next()){
            String name=rs.getString(1);
            list.add(name);
        }
        return list;
    }
    public String selectIdByName(String name) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT ID FROM dbo.Employee WHERE FullName='"+name+"'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            String id=rs.getString(1);
            return id;
        }
        return null;
    }
    public void addNewJob(String idEmp,Integer idJob) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="INSERT INTO dbo.JobEmployee\n" +
        "(\n" +
        "    Empid,\n" +
        "    Jobid\n" +
        ")\n" +
        "VALUES\n" +
        "(   '"+idEmp+"', -- Empid - char(9)\n" +
        "    "+idJob+"   -- Jobid - smallint\n" +
        ")";
        conn.prepareStatement(query).executeUpdate();
        conn.close();
    }
    public Boolean checkEmpHasJob(String idEmp,Integer idJob) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.JobEmployee WHERE Empid='"+idEmp+"' AND Jobid="+idJob+" ";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            return true;
        }
        conn.close();
        return false;
    }
}
