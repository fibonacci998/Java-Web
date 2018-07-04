/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import com.context.DBContext;
import entity.Product;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuans
 */
public class ProductBean implements Serializable{

    private int page,pageSize;
    public ProductBean() {
        page=1;
        pageSize=5;
    }
    public int getPages() throws Exception{
        int rows=getRowCount();
        return rows / (pageSize)+1;
    }
    public int getRowCount() throws Exception{
        String select="select count(*) from producttbl";
        Connection conn=new DBContext().getConnection();
        ResultSet rs=conn.prepareStatement(select).executeQuery();
        int p=0;
        if (rs.next()) p=rs.getInt(1);
        rs.close();
        conn.close();
        return p;
    }
    public List<Product> getProduct() throws Exception{
        //calculate from or begin
        int from=(page-1)*(pageSize)+1;
        int to=(page*pageSize);
       // int rows=getRowCount();
        String query="{call GetProducts(?,?)}";
        Connection conn=new DBContext().getConnection();
        
        CallableStatement cs=conn.prepareCall(query);
        cs.setInt(1, from);cs.setInt(2, to);
        ResultSet rs=cs.executeQuery();

        List<Product> p=new ArrayList<>();
        while(rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            double price=rs.getDouble(3);
            p.add(new Product(id, name, price));
        }
        conn.close();
        return p;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        int i=1;
        this.pageSize = pageSize;
    }
}
