import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SequenceTester 
{
	public static String str;
	public static WebDriver driver;
	public static WebElement element;
	
	@BeforeSuite
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\chromedriver.exe");		
		driver = new ChromeDriver();
	}
	@BeforeClass
	public void register()
	{
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[18]/li[26]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/span/span/a")).click();
		 
		
		//Assertions
		str = driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/h1")).getText();
		Assert.assertTrue(str.contains("Create"));
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"continue\"]")).isEnabled());
		str = driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/div[2]/div/label")).getText();
		Assert.assertTrue(str.contains("Mobile"));
		str = driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/div[3]/div/label")).getText();
		Assert.assertTrue(str.contains("Email"));
		str = driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/div[4]/div/label")).getText();
		Assert.assertTrue(str.contains("Password"));
		
		//Register
		element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[1]/input"));
		element.sendKeys("Raj Khare");
		element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[2]/div/div/div/div[2]/input"));
		element.sendKeys("7302200208");
		element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div/input"));
		element.sendKeys("500060720@stu.upes.ac.in");
		element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[4]/div/input"));
		element.sendKeys("nish123!@#");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[6]/span/span/input")).click();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void Login()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-signin-tooltip")).click();
		element = driver.findElement(By.id("ap_email"));
		element.sendKeys("9005445752");
		driver.findElement(By.id("continue")).click();
		element = driver.findElement(By.id("ap_password"));
		element.sendKeys("Ni$hkar$h1");
		driver.findElement(By.id("signInSubmit")).click();
	}
  @Test
  public static void search() 
  {
	  	driver.get("https://www.amazon.in/");
		element = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input"));
		element.sendKeys("Lenovo legion y540");
		element.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().window().maximize();
		str = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).getText();
		Assert.assertTrue(str.contains("Lenovo Legion Y540"));
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    str = driver.getCurrentUrl();
	    System.out.println(str);
	    str = driver.findElement(By.id("productTitle")).getText();
		Assert.assertTrue(str.contains("Lenovo Legion Y540"));
		str = driver.findElement(By.xpath("//*[@id=\"ddmDeliveryMessage\"]")).getText();
		Assert.assertTrue(str.contains("Delivery"));
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).isEnabled());
  }
  @AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite");
	}
  @AfterClass
 	public void afterclass()
 	{
 		System.out.println("After Class");
 	}
  @AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}
}
