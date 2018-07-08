/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import java.sql.Connection;

/**
 *
 * @author tuans
 */
public class StatusDAO {
    public void approveRequest(String id) throws Exception{
        String query="UPDATE dbo.Requests SET [Status]='Approved' WHERE RequestID="+id;
        Connection conn= new DBContext().getConnection();
        conn.prepareStatement(query).executeUpdate();
        conn.close();
    }
    public void rejectRequest(String id) throws Exception{
        String query="UPDATE dbo.Requests SET [Status]='Rejected' WHERE RequestID="+id;
        Connection conn= new DBContext().getConnection();
        conn.prepareStatement(query).executeUpdate();
        conn.close();
    }
}
