package JDBC;

import java.sql.*;

public class Practice_2 {
    public static void main(String[] args) throws SQLException {

        String username="hr";
        String password="hr";
        String url="jdbc:oracle:thin:@3.87.141.2:1521:xe";

        Connection connection= DriverManager.getConnection(url,username,password);

        Statement statement=connection.createStatement();

        ResultSet result=statement.executeQuery("select*from regions");

        result.next();
        System.out.println(result.getInt("region_id"));
        System.out.println(result.getString("region_name"));//getObject also work

        result.next();
        System.out.println(result.getInt("region_id"));
        System.out.println(result.getString("region_name"));

        result.next();
        System.out.println(result.getInt("region_id"));
        System.out.println(result.getString("region_name"));

        result.next();
        System.out.println(result.getInt(1));
        System.out.println(result.getString(2));


    }

}
