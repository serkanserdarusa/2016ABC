package Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P29_Excell1 {
    public static void main(String[] args) throws IOException {
        //first step access the excel file
        FileInputStream fis=new FileInputStream("C:/Users/serka/OneDrive/Desktop/practice.xlsx");
       //FileInputStream fis=new FileInputStream("C:/Users/serka/eclipse-workspace/Batch15/practice.xlsx");

        //if you are using xlsx ==>XSSF
        //if you are using xls==>HSSF

        //create object for XSSFWorkbook class
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        System.out.println(workbook.getNumberOfSheets());

        //get the specific sheet and read data
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        //XSSFSheet sheet1=workbook.getSheetAt(0);

        System.out.println(sheet.getLastRowNum());
        System.out.println(sheet.getSheetName());
        System.out.println(sheet.getRow(0).getFirstCellNum());//cell=column
        System.out.println(sheet.getRow(0).getLastCellNum());

        String data=sheet.getRow(0).getCell(0).getStringCellValue();
        String data1=sheet.getRow(1).getCell(0).getStringCellValue();
        String data2=sheet.getRow(2).getCell(0).getStringCellValue();
        String data3=sheet.getRow(3).getCell(0).getStringCellValue();
        String data4=sheet.getRow(4).getCell(0).getStringCellValue();
        String data5=sheet.getRow(5).getCell(0).getStringCellValue();
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
        System.out.println(data5);

        System.out.println("====================================");

        double data7=sheet.getRow(1).getCell(7).getNumericCellValue();
        double data8=sheet.getRow(2).getCell(7).getNumericCellValue();
        double data9=sheet.getRow(3).getCell(7).getNumericCellValue();
        double data10=sheet.getRow(4).getCell(7).getNumericCellValue();
        double data11=sheet.getRow(5).getCell(7).getNumericCellValue();
        System.out.println(data7);
        System.out.println(data8);
        System.out.println(data9);
        System.out.println(data10);
        System.out.println(data11);
    }

}
