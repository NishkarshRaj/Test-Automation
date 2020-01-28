package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailBot 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signin");
		driver.manage().window().maximize();
		WebElement element; 
		
		//Login
		element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
		element.sendKeys("<<Email>>");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		element = driver.findElement(By.name("password")); //Cannot access exact HTML path by Xpath, name or even class
		element.sendKeys("<<password>>");
	}
}
