package Selenium;

import Utils.ExcellUtils;

import java.io.IOException;

public class P33_Excell5 {
    public static void main(String[] args) throws IOException {

        ExcellUtils ex=new ExcellUtils("C:/Users/serka/OneDrive/Desktop/practice.xlsx");

        System.out.println(ex.getdata(0, 1));
        System.out.println(ex.getdata(1, 1));
        System.out.println(ex.getdata(2, 1));
        System.out.println(ex.getdata(3, 5));
        System.out.println(ex.indexofsheet("Sheet4"));


    }


}
