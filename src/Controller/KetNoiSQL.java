/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;

/**
 *
 * @author Admin
 */
public class KetNoiSQL {

    public static Connection getConnection() {
        Connection connection = null;
        String databaseUrl = "jdbc:sqlserver://;databaseName=HDTQLSV";
        String username = "sa";
        String password = "123";
        String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try {
            Class.forName(driverClass);
            connection = DriverManager.getConnection(databaseUrl, username, password);
            System.out.println("Connect database successfull !!!");
        } catch (Exception e) {
            System.out.println("Connect database has failed !!!");
        }
        return connection;
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        KetNoiSQL.getConnection();
    }
}
