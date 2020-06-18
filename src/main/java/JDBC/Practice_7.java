package JDBC;

import java.sql.*;

public class Practice_7 {
    public static void main(String[] args) throws SQLException {


        String username=ConfigurationReader.getProperty("JDBC_UserName");
        String password=ConfigurationReader.getProperty("JDBC_PassWord");
        String url=ConfigurationReader.getProperty("JDBC_URL");

        Connection connection= DriverManager.getConnection(url,username,password);

        Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet result=statement.executeQuery("select * from departments");

        result.beforeFirst();//move the cursor to the default position(before first row)

        while(result.next()) {
            int id=result.getInt(1);
            String name=result.getString("department_name");
            System.out.println("department_id is :"+id+" department_name is :"+name);
        }
    }
}
