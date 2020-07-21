package Selenium;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class P31_Excell3 {
    public static void main(String[] args) throws IOException {


        //first step access the excel file
        FileInputStream fis = new FileInputStream("C:/Users/serka/OneDrive/Desktop/practice.xlsx");
        //FileInputStream fis=new FileInputStream("C:/Users/serka/eclipse-workspace/Batch15/practice.xlsx");

        //if you are using xlsx ==>XSSF
        //if you are using xls==>HSSF

        //create object for XSSFWorkbook class
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        System.out.println(workbook.getNumberOfSheets());

        //get the specific sheet and read data
        XSSFSheet sheet = workbook.getSheet("info");
        //XSSFSheet sheet1=workbook.getSheetAt(0);


        Iterator<Row>it=sheet.iterator();
        while(it.hasNext()){
            //System.out.println(it.next().getCell(0));
            System.out.println(it.next().getCell(1));
        }
    }
}
