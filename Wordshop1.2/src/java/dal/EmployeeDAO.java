/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Employee;

/**
 *
 * @author tuans
 */
public class EmployeeDAO {
    //return list of all employee
    public List<Employee> selectAll()throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="select * from Employees";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        List<Employee> list=new ArrayList<>();
        while (rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            Date dob=rs.getDate(3);
            int gender=rs.getInt(4);
            String address=rs.getString(5);
            list.add(new Employee(id, name, dob, gender, address));
        }
        conn.close();
        return list;
    }
}
