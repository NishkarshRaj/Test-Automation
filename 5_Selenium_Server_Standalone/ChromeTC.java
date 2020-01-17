package StandAloneChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeTC {
	public static void main(String [] args)
	{
		//Add drivers -> Interface between Java program and Web Browser
		System.setProperty("webdriver.chrome.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\chromedriver.exe");
		//declaration and installation of objects and variables
		WebDriver driver=new ChromeDriver(); //WebDriver is an interface that is superclass of ChromeDriver
		//ChromeDriver object is created
		//Web Driver is the super class whose functions are INDEPENDENT OF WEB BROWSER
		
		//Launch Website
		driver.navigate().to("https://www.google.com");
		
		
		//WebElement is a variable of WebDriver
		//driver object already created above of type WebDriver initiated with constructor of ChromeDriver 
		//findElement() is a function to get particular element of the webpage
		//By => Selenium Class
		//name is a function of Selenium
		//Significance of Q -> Inspect Magification Glass //Unique Name of the CSS Property is called using this
		//Try searching followers tab!!
		//We can access element by name, class and title etc.
		WebElement element = driver.findElement(By.name("q"));
		
		//We have got access to required element
		//Click on search text box and send value
		//Enter input to the element
		element.sendKeys("https://www.github.com/NishkarshRaj");
		
		//Press Return Carriage (Submit)
		element.submit();
		//BCD!!! Dont use enter, Access Google Search and press that button
	}
}
