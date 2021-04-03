package com.gussie;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App
{
    public static void main( String[] args ) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/test0328?charactionEncoding=utf8");
        dataSource.setUser("root");
        dataSource.setPassword("111111");

        Connection connection = dataSource.getConnection();
        String sql = "select * from student where id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,2);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}
