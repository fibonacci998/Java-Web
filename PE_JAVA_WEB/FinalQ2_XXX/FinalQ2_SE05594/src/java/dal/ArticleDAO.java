/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.Article;
import entity.Author;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author tuans
 */
public class ArticleDAO {
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
    public ArrayList<Article> selectArtByYear(int year) throws Exception{
        Connection conn;
        conn = new DBContext().getConnection();
        String query="SELECT * FROM dbo.Articles WHERE Year="+year;
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Article> list=new ArrayList<>();
        while (rs.next()){
            int id=rs.getInt(1);
            String title=rs.getString(2);

            String publisher=rs.getString(4);
            String articleAbstract=rs.getString(5);
            list.add(new Article(id, title, year, publisher, articleAbstract));
        }     
        rs.close();
        conn.close();
        return list;
    }
    public ArrayList<Integer> selectAllYear() throws Exception{
        Connection conn;
        conn = new DBContext().getConnection();
        String query="SELECT Year FROM dbo.Articles  ";
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> hashmap=new HashMap();
        while (rs.next()){
            Integer year=rs.getInt(1);
            if (hashmap.get(year)!=null){
                
            }else{
                hashmap.put(year, 1);
                list.add(year);
            }
            
        }
        Collections.sort(list);       
        rs.close();
        conn.close();
        return list;
    }
}
