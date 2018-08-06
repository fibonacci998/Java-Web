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

/**
 *
 * @author tuans
 */
public class EmployeeDAO {
    public Employee getEmployeeById(int id) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.Employees WHERE EmployeeID="+id;
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        Employee emp=null;
        while (rs.next()){
            int empId=rs.getInt(1);
            String name=rs.getString(2);
            emp=new Employee(empId, name);
        }
        return emp;
    }
    public ArrayList<Employee> selectAll() throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.Employees";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Employee> list=new ArrayList<>();
        while (rs.next()){
            int empId=rs.getInt(1);
            String name=rs.getString(2);
            list.add(new Employee(empId, name));
        }
        return list;
    }
}
