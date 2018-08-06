/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.RequestType;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author tuans
 */
public class RequestTypeDAO {
    public RequestType getTypeByID(int id) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.RequestTypes WHERE TypeID="+id;
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        RequestType rt=null;
        while (rs.next()){
            int typeId=rs.getInt(1);
            String typeName=rs.getString(2);
            rt=new RequestType(typeId, typeName);
        }
        return rt;
    }
}
