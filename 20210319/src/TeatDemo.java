import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

/**
 * User:DELL
 * Date:2021-03-19
 * Time:10:08
 */
public class TeatDemo {
    public static void main1(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/testjava18?useUnicode=true&characterEncoding=UTF-8";
        String user="root";
        String password="111111";
        Connection connection= DriverManager.getConnection(url,user,password);
        String sql="select * from test0319";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));

        }
    }

    public static void main2(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/testjava18";
        String user="root";
        String password="111111";
        Connection connection= DriverManager.getConnection(url,user,password);
        String sql="select * from test0319";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()){
            User user1 = new User();
            user1.setId(resultSet.getInt(1));
            user1.setUser(resultSet.getString(2));
            user1.setPassword(resultSet.getString(3));
            System.out.println(user1);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/testjava18";
        String user="root";
        String password="111111";
        //Connection connection= DriverManager.getConnection(url,user,password);
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(user);
        ((MysqlDataSource)dataSource).setPassword(password);
        Connection connection=dataSource.getConnection();

        //预防sql注入
        int id = 2;
        String uname="huhu";
        String upass="123";
        String sql="insert into test0319 values (?,?,?)";
        //Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,uname);
        preparedStatement.setString(3,upass);
        System.out.println(preparedStatement.toString());
        int ret = preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();

    }
}
