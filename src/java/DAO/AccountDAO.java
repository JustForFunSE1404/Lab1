/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.ConnectDB;
import Model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author phuch_cqzh776
 */
public class AccountDAO {
    public boolean getAccount(String username, String pass){
        try {
            String sql = "SELECT * FROM account WHERE username = ? AND password = ?";
            Connection conn = ConnectDB.getConnect();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
              return true;
            }else{
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
        
        
    }
}
