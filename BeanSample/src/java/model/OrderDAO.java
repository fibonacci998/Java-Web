/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import com.context.DBContext;
import java.sql.PreparedStatement;
/**
 *
 * @author tuans
 */
public class OrderDAO {
    public void insert(String custID, String payment) throws Exception{
        String query="INSERT INTO dbo.OrderTBL\n" +
        "(\n" +
        "    OrderDate,\n" +
        "    CustomerID,\n" +
        "    payment\n" +
        ")\n" +
        "VALUES\n" +
        "(   GETDATE(), -- OrderDate - datetime\n" +
        "    N'"+custID+"',       -- CustomerID - nchar(5)\n" +
        "    N'"+payment+"'        -- payment - nvarchar(150)\n" +
        ")";
        Connection conn=new DBContext().getConnection();
        PreparedStatement ps=conn.prepareStatement(query);
        ps.executeUpdate();
        conn.close();
    }
}
