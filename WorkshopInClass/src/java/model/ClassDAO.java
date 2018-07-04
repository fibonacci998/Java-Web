/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import ConnectDatabase.DBContext;
import entity.Group;
import entity.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tuans
 */
public class ClassDAO {
    public List<Group> selectNumber(int number) throws Exception{
        List<Group> list=new ArrayList<>();
        String query="SELECT TOP "+number+" * FROM Groups";
        Connection conn=new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while(rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            Date date=rs.getDate(3);
            int activated=rs.getInt(4);
            list.add(new Group(id, name, date, activated));
        }
        conn.close();
        return list;
    }
}
