/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author tuans
 */
public class CustomerDAO {
    public void insert(String custID, String custName) throws Exception{
        String sql="INSERT INTO dbo.CustomerTBL\n" +
        "(\n" +
        "    CustomerID,\n" +
        "    CustomerName\n" +
        ")\n" +
        "VALUES\n" +
        "(   N'"+custID+"', -- CustomerID - nchar(5)\n" +
        "    N'"+custName+"'  -- CustomerName - nvarchar(30)\n" +
        ")";
        Connection conn=new DBContext().getConnection();
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.executeUpdate();
        conn.close();
    }
}
