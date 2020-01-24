package amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "<<Absolute path>>\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element; 
		driver.findElement(By.id("nav-signin-tooltip")).click();
		element = driver.findElement(By.id("ap_email"));
		element.sendKeys("<Registered Mobile number or email>");
		driver.findElement(By.id("continue")).click();
		element = driver.findElement(By.id("ap_password"));
		element.sendKeys("<Password>");
		driver.findElement(By.id("signInSubmit")).click();
	}
}
