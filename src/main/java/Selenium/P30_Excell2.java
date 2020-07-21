package Selenium;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class P30_Excell2 {
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
        int rownum=sheet.getLastRowNum();


        for(int i=1;i<rownum;i++){

            XSSFCell cell=sheet.getRow(i).getCell(8);
            String text="";

            if (cell.getCellType()== CellType.STRING){
                text=cell.getStringCellValue();

            }else if(cell.getCellType()== CellType.NUMERIC){
                text=String.valueOf(cell.getNumericCellValue());
            }else if(cell.getCellType()==CellType.BLANK){
                text="";
            }
            System.out.println(text);
        }




    }
}
