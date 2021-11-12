package com.rng.demo.Util;

import java.sql.*;
import java.util.List;

public class JDBCUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/web_log_view";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER="com.mysql.jdbc.Driver";

    /**
     * 获取Connection
     * @return
     */
    public static Connection getConnetion()  {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
