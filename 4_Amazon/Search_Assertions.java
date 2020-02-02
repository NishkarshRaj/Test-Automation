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

		//Shortcut to get the job done!! -> Switching Tabs because rest of work of assertions is very easy!!
		driver.get("https://www.amazon.in/Lenovo-Legion-Graphics-Windows-81SY00CKIN/dp/B07W6H9YM9/ref=sr_1_1_sspa?keywords=Lenovo+legion+y540&qid=1580636280&smid=A14CZOWI0VEHLG&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzSUpCUzVXM1dHOFdHJmVuY3J5cHRlZElkPUEwOTkxNDQxM0NINzFZRExQWUpQTCZlbmNyeXB0ZWRBZElkPUEwMDM5Njc0MVpJRkUwOERWSTNXSSZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
		
		//Assertions!
		str = driver.findElement(By.id("productTitle")).getText();
		Assert.assertTrue(str.contains("Lenovo Legion Y540"));

		// Check if all tests are passed by printing HelloWorld at last
		System.out.println("Hello, World!");
		
		// Close the driver
		driver.quit();
		
		/*
		//Click on item to open it in new tab 
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		 
		// The following lines are causing error because we are shifting web pages in a new tab rather than opening them in the same tab
		//str = driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
		//System.out.println(str);
		
		
		//Checking which page the driver is at!!!
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl); //path of original page! So when a new tab is opened, the driver is still in the previous tab :(
		
		
		//Trying to Switch Tabs
		//driver.findElement(By.xpath("/html/body")).sendKeys(Keys.CONTROL, Keys.PAGE_DOWN);
		
		
		//Trying to Switch Tabs
		String str1 = driver.getWindowHandle();
		driver.switchTo().window(str1);
		
		//Check if Tab changes?
		currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//Closing the Google Chrome browser
		//driver.quit();
		 */
	}
}
