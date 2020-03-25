package Selenium;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Login_Github_excel_file {
	
	public static String str;
	public static WebDriver driver;
	public static WebElement element;
	
	@BeforeSuite
	public void Setup_Drivers()
	{
		System.out.println("1");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Drivers\\geckodriver.exe");		
		System.out.println("beforesuite");
	}
	
	
	@BeforeMethod
	public void Visit_GitHub()
	{
		System.out.println("2");
		driver = new FirefoxDriver();
		driver.navigate().to("https://github.com/login");
		driver.manage().window().maximize();
	}

	
	@Test(dataProvider = "getData")
	public void Login(String username, String password) 
	{
		//Assertions
		//str = driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[1]/h1")).getText();
		//Assert.assertTrue(str.contains("Sign"));
		//str = driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/label[1]")).getText();
		//Assert.assertTrue(str.contains("Username"));
		//str = driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/label[2]")).getText();
		//Assert.assertTrue(str.contains("Password"));
		//Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[9]")).isEnabled());
				//Image check	/html/body/div[1]/div[2]/div/a/svg
		
		element = driver.findElement(By.name("login"));
		element.sendKeys(username);
		element = driver.findElement(By.name("password"));
		element.sendKeys(password);
		driver.findElement(By.name("commit")).click();
	}
	
	
    public String[][] readExcel() throws IOException{

    //Create an object of File class to open xlsx file
    System.out.println("readExcel");
    String fileName="D:\\Test_Automation\\src\\Selenium\\username_password.xlsx";
    String sheetName="Sheet1";
    File file =    new File(fileName);

    
    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook LoginWorkbook = null;

    //Find the file extension by splitting file name in substring  and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    LoginWorkbook = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of HSSFWorkbook class

        LoginWorkbook = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name

    Sheet LoginSheet = LoginWorkbook.getSheet(sheetName);

    //Find number of rows in excel file
    int totalrows=LoginSheet.getLastRowNum();
    int totalcolumns=LoginSheet.getFirstRowNum();

    int rowCount = totalrows-totalcolumns;

    String dataArray[][] =null;
    dataArray= new String[totalrows][totalcolumns];
    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = LoginSheet.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {
        	
        	System.out.print("Hello");
            //Print Excel data in console
        	dataArray[i][j]=row.getCell(j).getStringCellValue();
        	System.out.print(dataArray[i][j]+"|| ");

        }

        System.out.println();
    } 
return dataArray;
    }  
    
    
    
    @DataProvider
	public Object[][] getData() throws Exception{
	Object[][] obj = readExcel();
	return obj;
	}

    @AfterMethod
     public void afterMethod() 
    {
  	    driver.close();
 
    }
    //Main function is calling readExcel function to read data from excel file

   public static void main(String...strings) throws IOException
    
    {

    //Create an object of ReadGuru99ExcelFile class

    Login_Github_excel_file objExcelFile = new Login_Github_excel_file();

    //Prepare the path of excel file

    //Call read file method of the class to read data

    objExcelFile.readExcel();

    }

}
