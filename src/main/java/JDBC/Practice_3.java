package JDBC;

import java.sql.*;

public class Practice_3 {
    public static void main(String[] args) throws SQLException {
        String username="hr";
        String password="hr";
        String url="jdbc:oracle:thin:@3.87.141.2:1521:xe";

        Connection connection= DriverManager.getConnection(url,username,password);

        Statement statement=connection.createStatement();

        ResultSet result=statement.executeQuery("select*from employees");

        while(result.next()) {
            String firstname=result.getString("first_name");
            String lastname=result.getString(3);//index no
            int salary=result.getInt("salary");
            System.out.println(firstname+" "+lastname+" "+salary);

            if(firstname.equalsIgnoreCase("David")) {
                System.out.println(firstname+" "+lastname);
            }

        }



    }

}
