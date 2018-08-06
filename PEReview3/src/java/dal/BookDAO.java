/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tuans
 */
public class BookDAO {
    public ArrayList<Book> selectAll() throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="select * from Books";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Book> list=new ArrayList<>();
        while (rs.next()){
            String titleID=rs.getString(1);
            String title=rs.getString(2);
            String pubid=rs.getString(3);
            String note=rs.getString(4);
            String username=rs.getString(5);
            list.add(new Book(titleID, title, pubid, note, username));
        }
        rs.close();
        conn.close();
        return list;
    }
    public Book selectByBookId(String id) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.Books WHERE title_id = '"+id+"'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        Book book=null;
        while (rs.next()){
            String titleID=rs.getString(1);
            String title=rs.getString(2);
            String pubid=rs.getString(3);
            String note=rs.getString(4);
            String username=rs.getString(5);
            book=new Book(titleID, title, pubid, note, username);
        }
        rs.close();
        conn.close();
        return book;
    }
}
