/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.ConnectDB;
import Model.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuch_cqzh776
 */
public class ProductDAO {
    
    public List<Product> getAllProduct(){
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Contacts";
            Connection conn = ConnectDB.getConnect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String des = rs.getString(3);
                double price = rs.getDouble(4);
                String image = rs.getString(5);
                list.add(new Product(id, name, des, price, image));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
        
        
    }
    
    
}
