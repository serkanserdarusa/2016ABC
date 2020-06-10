package Utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelUtil {


  private  XSSFWorkbook workbook;

  private XSSFSheet sheet;


  public ExcelUtil(String excelpath){

    try {
      FileInputStream  fis = new FileInputStream(excelpath);
      try {
        workbook= new XSSFWorkbook(fis);
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public String getData(int sheetnum,int rownum,int columnnum) {

      sheet = workbook.getSheetAt(0);//or put sheetnum

      String data = sheet.getRow(rownum).getCell(columnnum).getStringCellValue();

      return data;
    }


  public int NumberOfRow(String row){

    int nor=workbook.getSheetIndex(row);


    return nor;

  }
    }


