/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.Article;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tuans
 */
public class JoinDAO {
    public ArrayList<Article> selectArtByIDYear(int id,int year) throws Exception{
        Connection conn;
        conn = new DBContext().getConnection();
        String query="SELECT * FROM dbo.Articles WHERE ArticleID="+id+" AND Year="+year;
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Article> list=new ArrayList<>();
        while (rs.next()){

            String title=rs.getString(2);

            String publisher=rs.getString(4);
            String articleAbstract=rs.getString(5);
            list.add(new Article(id, title, year, publisher, articleAbstract));
        }     
        rs.close();
        conn.close();
        return list;
    }
}
