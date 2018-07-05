/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author tuans
 */
public class EmployeeDAO {
    public List<Employee> selectAll() throws Exception{
        List<Employee> list=new Vector<>();
        String query="select * from Employees";
        Connection conn= new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            int empID=rs.getInt(1);
            String empName=rs.getString(2);
            list.add(new Employee(empID, empName));
        }
        conn.close();
        return list;
    }
    public Vector<Employee> selectByName(String name) throws Exception{
        Vector<Employee> list=new Vector<>();
        String query="SELECT * FROM Employees WHERE EmployeeName LIKE '%"+name+"%'";
        Connection conn= new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            int empID=rs.getInt(1);
            String empName=rs.getString(2);
            list.add(new Employee(empID, empName));
        }
        conn.close();
        return list;
    }
}
