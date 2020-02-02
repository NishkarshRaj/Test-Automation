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
		element.sendKeys("<<email>>");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
	
		//Check the URL!!! Is on login page or password page???
		System.out.println(driver.getCurrentUrl()); //Yes, it is stuck on the login page not on the password page because the web page does not change, it is forwarded!!
		
		/*
		//Cannot access Password by id, name or even by the xpath :(
		//element = driver.findElement(By.name("password"));
		
		element = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		element.sendKeys("<<password>>");
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		
		element = driver.findElement(By.id("ap_password"));
		element.sendKeys("<<password>>");
		driver.findElement(By.id("signInSubmit")).click();
		*/
	}
}
