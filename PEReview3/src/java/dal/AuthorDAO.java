/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.Author;
import entity.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuans
 */
public class AuthorDAO {
    public ArrayList<Author> selectByBookId(String id) throws Exception{
        Connection conn;
        conn = new DBContext().getConnection();
        String query="SELECT Authors.au_id,au_name,au_address FROM dbo.Authors \n" +
        "LEFT JOIN dbo.TitleAuthor ON TitleAuthor.au_id = Authors.au_id\n" +
        "WHERE title_id='"+id+"'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Author> list=new ArrayList<>();
        while (rs.next()){
            String authorId=rs.getString(1);
            String authorName=rs.getString(2);
            String authorAddress=rs.getString(3);
            list.add(new Author(authorId, authorName, authorAddress));
        }
        rs.close();
        conn.close();
        return list;
    }
}
