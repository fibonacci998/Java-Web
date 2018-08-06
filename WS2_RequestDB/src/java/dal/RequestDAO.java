/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.Request;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author tuans
 */
public class RequestDAO {
    public ArrayList<Request> selectAll() throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.Requests";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Request> list=new ArrayList<>();
        while (rs.next()){
            int requestID=rs.getInt(1);
            int empID=rs.getInt(2);
            int typeID=rs.getInt(3);
            Date dateFrom=rs.getDate(4);
            Date dateTo=rs.getDate(5);
            String resson=rs.getString(6);
            String status=rs.getString(7);
            list.add(new Request(requestID, empID, typeID, dateTo, dateTo, resson, status));
        }
        return list;
    }
    public ArrayList<Request> selectByEmpID(int empID) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.Requests WHERE EmployeeID="+empID;
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Request> list=new ArrayList<>();
        while (rs.next()){
            int requestID=rs.getInt(1);
            int typeID=rs.getInt(3);
            Date dateFrom=rs.getDate(4);
            Date dateTo=rs.getDate(5);
            String resson=rs.getString(6);
            String status=rs.getString(7);
            list.add(new Request(requestID, empID, typeID, dateTo, dateTo, resson, status));
        }
        return list;
    }
    public void setStatus(String status, int id) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="UPDATE dbo.Requests SET Status='"+status+"' WHERE RequestID="+id;
        conn.prepareStatement(query).executeUpdate();
    }
}
