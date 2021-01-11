/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author phuch_cqzh776
 */
public class ConnectDB {

    public static Connection getConnect() {
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=SE1404_DE140006";
        String userDB = "sa";
        String passDB = "123123";

        Connection conn = null;
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(dbURL, userDB, passDB);
            System.out.println("Connect successful!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
