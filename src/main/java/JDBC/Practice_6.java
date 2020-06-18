package JDBC;

import java.sql.*;

public class Practice_6 {
    public static void main(String[] args) throws SQLException {


        String username=ConfigurationReader.getProperty("JDBC_UserName");
        String password=ConfigurationReader.getProperty("JDBC_PassWord");
        String url=ConfigurationReader.getProperty("JDBC_URL");

        Connection connection= DriverManager.getConnection(url,username,password);

        Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

        ResultSet result=statement.executeQuery("select*from departments");

//		 result.beforeFirst();//move the cursor to the default position(before first row)
//	     int numberofrow7=result.getRow();//read the number of row
//	     System.out.println(numberofrow7);
//	     System.out.println("go to previous row :"+result.getString("department_name"));

        result.first();//moves the cursor to the first row(scrollable)
        int numberofrow=result.getRow();//read the number of row
        System.out.println(numberofrow);
        System.out.println(result.getString("department_name"));



        result.last();//moves the cursor to the first row(scrollable)
        int numberofrow1=result.getRow();//read the number of row
        System.out.println(numberofrow1);
        System.out.println(result.getString("department_name"));


        result.absolute(12);//moves the cursor to the specified(desired) row
        int numberofrow2=result.getRow();//read the number of row
        System.out.println(numberofrow2);
        System.out.println("go to 12 row :"+result.getString(2));


        result.relative(7);//move to cursor the given number of rows forward or backward,from where it is currently pointing
        int numberofrow3=result.getRow();//read the number of row
        System.out.println(numberofrow3);
        System.out.println("go to +7 row :"+result.getString("department_name"));

        result.relative(-4);//move to cursor the given number of rows forward or backward,from where it is currently pointing
        int numberofrow4=result.getRow();//read the number of row
        System.out.println(numberofrow4);
        System.out.println("go to -4 row :"+result.getString("department_name"));

        result.previous();//move to cursor  to the previous  row
        int numberofrow5=result.getRow();//read the number of row
        System.out.println(numberofrow5);
        System.out.println("go to previous row :"+result.getString("department_name"));



    }

}
