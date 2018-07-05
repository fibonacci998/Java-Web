/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.Employee;
import entity.Request;
import entity.RequestMerge;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author tuans
 */
public class RequestDAO {
    public List<RequestMerge> selectAll() throws Exception{
        List<RequestMerge> list=new Vector<>();
        String query="SELECT RequestID, EmployeeName, TypeName,[From],[To],Reason,Status FROM dbo.Requests \n" +
        "JOIN dbo.Employees ON Employees.EmployeeID = Requests.EmployeeID\n" +
        "JOIN dbo.RequestTypes ON RequestTypes.TypeID = Requests.TypeID";
        Connection conn= new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            int resID=rs.getInt(1);
            String empName=rs.getString(2);
            String typeName=rs.getString(3);
            Date dateFrom = rs.getDate(4);
            Date dateTo=rs.getDate(5);
            String reason=rs.getString(6);
            String status=rs.getString(7);
            list.add(new RequestMerge(resID, empName, typeName, dateFrom, dateTo, reason, status));
        }
        conn.close();
        return list;
    }
    public List<RequestMerge> selectByID(String id) throws Exception{
        List<RequestMerge> list=new Vector<>();
        String query="SELECT RequestID, EmployeeName, TypeName,[From],[To],Reason,Status FROM dbo.Requests \n" +
        "JOIN dbo.Employees ON Employees.EmployeeID = Requests.EmployeeID\n" +
        "JOIN dbo.RequestTypes ON RequestTypes.TypeID = Requests.TypeID\n" +
        "WHERE  Employees.EmployeeID=1 "+id;
        Connection conn= new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            int resID=rs.getInt(1);
            String empName=rs.getString(2);
            String typeName=rs.getString(3);
            Date dateFrom = rs.getDate(4);
            Date dateTo=rs.getDate(5);
            String reason=rs.getString(6);
            String status=rs.getString(7);
            list.add(new RequestMerge(resID, empName, typeName, dateFrom, dateTo, reason, status));
        }
        conn.close();
        return list;
    }
}
