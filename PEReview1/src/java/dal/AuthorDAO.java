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
import java.util.List;

/**
 *
 * @author tuans
 */
public class AuthorDAO {
    public List<Author> selectAll() throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="select * from authors";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        List<Author> list=new ArrayList<>();
        while (rs.next()){
            String id=rs.getString(1);
            String name=rs.getString(2);
            String address=rs.getString(3);
            list.add(new Author(id, name, address));
        }
        return list;
    }
    public String getName(String titleID) throws Exception{
        String name="";
        String query="SELECT title FROM dbo.Books WHERE title_id LIKE '"+titleID+"'";
        Connection conn=new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while (rs.next()){
            name=rs.getString(1);
            break;
        }
        return name;
    }
    public List<Author> selectByTitleID(String titleID) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT Authors.au_id, au_name,au_address FROM dbo.TitleAuthor \n" +
            "LEFT JOIN dbo.Books ON Books.title_id = TitleAuthor.title_id\n" +
            "LEFT JOIN dbo.Authors ON Authors.au_id = TitleAuthor.au_id\n" +
            "WHERE Books.title_id LIKE '"+titleID+"'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        List<Author> list=new ArrayList<>();
        while (rs.next()){
            String id=rs.getString(1);
            String name=rs.getString(2);
            String address=rs.getString(3);
            list.add(new Author(id, name, address));
        }
        return list;
    }
    public List<Author> selectByNameAuthor(String name) throws Exception{
        Connection conn=new DBContext().getConnection();
        String query="SELECT * FROM dbo.Authors WHERE au_name LIKE '%"+name+"%'";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        List<Author> list=new ArrayList<>();
        while (rs.next()){
            String id=rs.getString(1);
            String xname=rs.getString(2);
            String address=rs.getString(3);
            list.add(new Author(id, xname, address));
        }
        return list;
    }
}
