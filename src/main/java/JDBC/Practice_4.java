package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Practice_4 {
    public static void main(String[] args) throws SQLException {
        String username="hr";
        String password="hr";
        String url="jdbc:oracle:thin:@3.87.141.2:1521:xe";

        Connection connection= DriverManager.getConnection(url,username,password);

        Statement statement=connection.createStatement();

        ResultSet result=statement.executeQuery("select*from employees");

        List<String> info=new ArrayList<>();

        while(result.next()) {

            String firstname=result.getString("first_name");
            String lastname=result.getString(3);
            String fullname=firstname+"|"+lastname;
            info.add(fullname);

        }
        System.out.println(info);
        System.out.println(info.isEmpty());//false
        System.out.println(info.size());//107
        System.out.println(info.contains("Alana|Walsh"));//true
        System.out.println(info.lastIndexOf(info));

    }
}
