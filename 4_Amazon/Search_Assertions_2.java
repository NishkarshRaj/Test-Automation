package amazon;
import java.util.*;
import org.openqa.selenium.By;
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

     	//Thread.sleep(10000);
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    
	    //Check if tabs got changed
	    str = driver.getCurrentUrl();
	    System.out.println(str);
	    
	    
	    //Assertions!
		str = driver.findElement(By.id("productTitle")).getText();
		Assert.assertTrue(str.contains("Lenovo Legion Y540"));
		/*
		str = driver.findElement(By.id("priceblock_dealprice_lbl")).getText();
		Assert.assertTrue(str.contains("Price"));
		str = driver.findElement(By.xpath("//*[@id=\"ddmDeliveryMessage\"]")).getText();
		Assert.assertTrue(str.contains("Delivery"));
		//str = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).getText(); //Button elements cannot check content. Check if enabled
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).isEnabled());
		*/
	    
		// Check if all tests are passed by printing HelloWorld at last
		System.out.println("Hello, World!");
		
		// Close the driver
		driver.quit();
	}
}
