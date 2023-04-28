package generics;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel 
{
@Test
public void readData() throws IOException 
{
FileInputStream fis =new FileInputStream("./Testdata/ActitimeData.xlsx");
XSSFWorkbook wb= new XSSFWorkbook(fis);
Sheet s=wb.getSheet("loginData");
Row r= s.getRow(1);
Cell c=r.getCell(1);
System.out.println(c.getStringCellValue());
}













}
