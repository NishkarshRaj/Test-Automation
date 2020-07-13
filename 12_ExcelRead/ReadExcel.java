//https://www.javatpoint.com/how-to-read-excel-file-in-java

package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
  @Test
  public void read_excel() 
  {
	  try
	  {
	  FileInputStream f = new FileInputStream("D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Lab\\8_ReadExcel\\Workbook.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(f);
	  XSSFSheet sheet = wb.getSheet("Login");
	  int count;
	  String username, password;
	  //Start count from 1 because 0th row has headings only
	  for(count = 1; count<=sheet.getLastRowNum(); count++)
	  	{
		  //Capture entire row
	  XSSFRow row = sheet.getRow(count);
	  username = row.getCell(0).getStringCellValue();
	  password = row.getCell(1).getStringCellValue();
	  System.out.println("Username: " + username);
	  System.out.println("Password: " + password);
	  	}
	  System.out.println("\n\n");
	  f.close();
	  wb.close();
	  } 
	  catch(IOException e)
	  {
	  System.out.println("Exception encountered! Exiting Code!!!");
	  }
  }
}
