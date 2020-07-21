package Selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P39_DataProviderEx {
    //it help us to write data driven test which same method will be run multiple times with different set of data


    /*
    Data driven test with JUnit
    1-Scenario outline
    2-Excel Sheet(Apache POI)
    3-From data base(like Oracle)

    Data driven test with TestNg
    1-Excel Sheet(Apache POI)
    2-DataProvider
    3-Parameters

     */

    @Test(dataProvider = "getData")
    public void setData(String username,String password){
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][]  getData(){

        Object[][]data=new Object[3][2];


        //first row

        data[0][0]="user1";
        data[0][1]="user123";

        //second row

        data[1][0]="user2";
        data[1][1]="user1234";


        //third row

        data[2][0]="user3";
        data[2][1]="user12345";

   return data;
    }

}
