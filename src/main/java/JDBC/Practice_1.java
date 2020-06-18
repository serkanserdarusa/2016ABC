package JDBC;

import java.sql.*;

public class Practice_1 {
    public static void main(String[] args) throws SQLException {
//JDBC is java database connectivity
//it used for connect between java application and database
//it help us access and manipulate database

        String username="hr";
        String password="hr";
        String url="jdbc:oracle:thin:@3.87.141.2:1521:xe";

        Connection connection= DriverManager.getConnection(url,username,password);
        System.out.println("connected");
        //it help usto connect database
        Statement statement=connection.createStatement();
        System.out.println("statement");
        //it help us to write and execute query
        ResultSet result=statement.executeQuery("select*from employees");
        System.out.println("result");
        //A datastructure where we can store the data came from database
        //Connection,Statement and Resultset are interface

//		String sql="update AB2 set firstname='Mike' where A_id=2";
//		statement.executeUpdate(sql);
//		System.out.println(sql);

//		String sql1="alter table  AB2 rename column firstname to name";
//		statement.executeUpdate(sql1);
//		System.out.println(sql1);

//		String sql2="Alter table  AB2 add salary int";
//		statement.executeUpdate(sql2);
//		System.out.println(sql2);

//		String sql3="delete AB2 where name='Deniz'";
//		statement.executeUpdate(sql3);
//		System.out.println(sql3);

//		String sql4="delete from AB2";
//		statement.executeUpdate(sql4);
//		System.out.println(sql4);

//		String sql4="truncate table AB3";
//		statement.executeUpdate(sql4);
//		System.out.println(sql4);

        String sql5="drop table AB2";
        statement.executeUpdate(sql5);
        System.out.println(sql5);

    }

}


