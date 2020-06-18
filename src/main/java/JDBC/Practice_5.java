package JDBC;

import java.sql.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice_5 {
    public static void main(String[] args) throws SQLException {


            String username = "hr";
            String password = "hr";
            String url = "jdbc:oracle:thin:@3.87.141.2:1521:xe";

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("select*from employees");


            Map<String, Integer> info = new LinkedHashMap<>();


            while (result.next()) {

                String firstname = result.getString("first_name");
                String lastname = result.getString("last_name");
                String fullname = firstname + "-" + lastname;
                int salary = result.getInt(8);
                info.put(fullname, salary);

                if (salary == 17000) {

                    System.out.println(firstname);
                }
            }

            System.out.println(info);

            result.close();
            statement.close();
            connection.close();

        }
    }

