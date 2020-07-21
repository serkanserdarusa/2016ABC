package Selenium;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P32_Excell4 {

    public static void main(String[] args) throws IOException {


        P32_Excell4 obj=new P32_Excell4();
        obj.readdata(0);
    }


    public void readdata(int column) throws IOException {

        //first step access the excel file
        FileInputStream fis = new FileInputStream("C:/Users/serka/OneDrive/Desktop/practice.xlsx");

        //create object for XSSFWorkbook class
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //get the specific sheet and read data
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        //XSSFSheet sheet1=workbook.getSheetAt(0);

        Iterator<Row> it=sheet.iterator();
        List<String> list=new ArrayList<>();
        while(it.hasNext()){
             list.add(it.next().getCell(column).getStringCellValue());
        }
        System.out.println(list);
    }
}
