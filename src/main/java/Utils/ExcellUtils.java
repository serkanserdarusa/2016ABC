package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcellUtils {


    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    public ExcellUtils(String excelpath) throws IOException {

        FileInputStream fis=new FileInputStream(excelpath);

        workbook=new XSSFWorkbook(fis);


    }
    public String getdata(int rownum,int column){
        sheet=workbook.getSheetAt(0);
        //sheet=workbook.getSheet("Sheet1");
        String data=sheet.getRow(rownum).getCell(column).getStringCellValue();
        return data;

    }

    public int indexofsheet(String index){

        int ios=workbook.getSheetIndex(index);
        return ios;

    }
}
