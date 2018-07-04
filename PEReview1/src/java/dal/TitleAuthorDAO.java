/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import entity.TitleAuthorJoinBook;
import com.context.DBContext;
import entity.TitleAuthor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuans
 */
public class TitleAuthorDAO {

    public TitleAuthorDAO() {
    }


    public List<TitleAuthorJoinBook> selectByID(String auID) throws Exception{
        if (auID==null) return null;
        Connection conn=new DBContext().getConnection();
        String query="SELECT Books.title_id,title,pub_id,notes,username FROM dbo.TitleAuthor \n" +
        "LEFT JOIN dbo.Books ON Books.title_id = TitleAuthor.title_id\n" +
        "WHERE au_id LIKE '"+auID+"'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        List<TitleAuthorJoinBook> list=new ArrayList<>();
        while (rs.next()){
            String titleID=rs.getString(1);
            String title=rs.getString(2);
            String pubID=rs.getString(3);
            String notes=rs.getString(4);
            String username=rs.getString(5);
            list.add(new TitleAuthorJoinBook(titleID, title, pubID, notes, username));
        }
        return list;
    }
}
