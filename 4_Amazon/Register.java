package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register 
{
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	// Open Registration Page of Amazon
	
	// Way 1: Directly open the link
	//driver.navigate().to("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
	
	// Way 2: Open the Homepage and access element
	//driver.get("https://amazon.in");
	//driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/div/a")).click();
	// Problem here is that the Sign Up button is a <a> element not a HTML Tag that can be accessed by Xpath, so lets use the most generic method
	
	// Way 3: Open Homepage -> Access Sidebar -> Create Account
	driver.get("https://amazon.in");
	driver.findElement(By.id("nav-hamburger-menu")).click();
	driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[18]/li[26]/a")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/span/span/a")).click();
	
	WebElement element; 
	
	//Filling information
	element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[1]/input"));
	element.sendKeys("<<Username>>");
	element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[2]/div/div/div/div[2]/input"));
	element.sendKeys("<<Mobile Number>>");
	element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div/input"));
	element.sendKeys("<<Email>>");
	element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[4]/div/input"));
	element.sendKeys("<<Password>>");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[6]/span/span/input")).click();
	driver.manage().window().maximize();
	}
}
