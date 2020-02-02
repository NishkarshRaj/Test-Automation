package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Search 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement element; 
		element = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input"));
		element.sendKeys("Lenovo legion y540");
		element.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().window().maximize();
		String str = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).getText();
		//Assert.assertFalse(str.contains("Lenovo Legion Y540")); If false, do not proceed forward in code
		Assert.assertTrue(str.contains("Lenovo Legion Y540"));
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		
		/* The following lines are causing error because we are shifting web pages in a new tab rather than opening them in the same tab
		str = driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
		System.out.println(str);
		*/
		
		//Checking which page the driver is at!!!
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl); //path of original page! So when a new tab is opened, the driver is still in the previous tab :(
		
		/*
		//Trying to Switch Tabs
		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.CONTROL, Keys.PAGE_DOWN);
		*/
		
		//Trying to Switch Tabs
		
		//Check if Tab changes?
		currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//Closing the Google Chrome browser
		//driver.quit();
	}
}
