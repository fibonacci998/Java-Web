/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.Author;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author tuans
 */
public class AuthorDAO {
    public Author getAuthorByID(int id) throws Exception{
        Connection conn;
        conn = new DBContext().getConnection();
        String query="SELECT * FROM dbo.Authors WHERE AuthorID="+id;
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        Author au=null;
        while (rs.next()){
            
            String name=rs.getString(2);
            String org=rs.getString(3);
            au=new Author(id, name, org);
        }
        rs.close();
        conn.close();
        return au;
    }
    public ArrayList<Author> selectAllAuthor() throws Exception{
        Connection conn;
        conn = new DBContext().getConnection();
        String query="SELECT * FROM dbo.Authors";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Author> list=new ArrayList<>();
        while (rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            String org=rs.getString(3);
            list.add(new Author(id, name, org));
        }
        rs.close();
        conn.close();
        return list;
    }
    String query="SELECT * FROM dbo.Authors \n" +
    "JOIN dbo.Article_Author ON Article_Author.AuthorID = Authors.AuthorID \n" +
    "WHERE ArticleID=1";
}
