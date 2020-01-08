package ChromeInstallation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTC {
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "<Path to>\\chromedriver.exe");
		//declaration and installation of objects and variables
		WebDriver driver=new ChromeDriver();
		//Launch Website
		driver.navigate().to("http://www.google.com/");
		WebElement element=driver.findElement(By.name("q"));
		//Click on search text box and send value
		element.sendKeys("<Keywords to search>");
		element.submit();
	}

}
