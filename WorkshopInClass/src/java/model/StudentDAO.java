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
public class StudentDAO {
    public List<Student> selectByClass(int number) throws Exception{
        List<Student> list=new ArrayList<>();
        String query="SELECT * FROM Student WHERE ClassID="+number;
        Connection conn=new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(query).executeQuery();
        while(rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            int idClass=rs.getInt(3);
            Boolean gender=rs.getInt(4)==1?true:false;
            Date dob=rs.getDate(5);
            list.add(new Student(id, name, gender, dob));
            
        }
        conn.close();
        return list;
    }
}
