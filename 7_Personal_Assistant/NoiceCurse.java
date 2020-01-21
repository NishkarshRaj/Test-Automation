package personal_assistant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class NoiceCurse 
{
	//Function for Profile Visitor
	public static void profilevisitor(int ch)
	{
		String website="https://www.google.com";
		System.setProperty("webdriver.chrome.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		switch(ch)
		{
		case 1: website = "https://github.com/NishkarshRaj";
			break;
		case 2: website = "https://www.linkedin.com/in/nishkarshraj/";
			break;
		case 3: website = "https://twitter.com/NishkarshRaj1";
			break;
		case 4: website = "https://www.instagram.com/nishkarshraj_/";
			break;
		default: System.out.println("Master! I assume you entered an invalid input! So I am taking you to Google! Learn how to read from there!!");
		}
		driver.navigate().to(website);
		driver.manage().window().maximize();
	}
	
	//Function for Login Helper
	public static void loginhelper(int ch)
	{
		String website="https://www.google.com";
		System.setProperty("webdriver.chrome.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebElement element; 
		switch(ch)
		{
		case 1: website = "https://github.com/login";
		element = driver.findElement(By.name("login"));
		element.sendKeys("NishkarshRaj");
		element = driver.findElement(By.name("password"));
		element.sendKeys("Ni$hkar$h3");
		driver.findElement(By.name("commit")).click();
			break;
		case 2: website = "https://www.linkedin.com";
			break;
		case 3: website = "https://twitter.com";
			break;
		case 4: website = "https://www.instagram.com";
			break;
		default: System.out.println("Master! I assume you entered an invalid input! So I am taking you to Google! Learn how to read from there!!");
		}
		driver.navigate().to(website);
		driver.manage().window().maximize();
	}
	
	//Function for Option Menu
	public static void optionmenu()
	{
		System.out.println("Following options are available: ");
		System.out.println("1) GitHub");
		System.out.println("2) LinkedIn");
		System.out.println("3) Twitter");
		System.out.println("4) Instagram");
	}
	
	//Driver Code
	public static void main(String [] args)
	{
		// Declarations
		Scanner reader = new Scanner(System.in);
		int choice1, choice2;
		
		// Bot NoiceCurse introduction
		System.out.println("Hi there! My name is NoiceCurse. I am your personal Assistant!");
		System.out.println("What can I do for you?");
		System.out.println("Press 1) Profile Visitor");
		System.out.println("Press 2) Login Helper");
		choice1 = reader.nextInt();
		//Switch Function
		switch(choice1)
		{
		case 1: System.out.println("Great! Lets see the options of profile I can help you visit");
		optionmenu();
		System.out.println("Enter your choice: ");
		choice2 = reader.nextInt();
		profilevisitor(choice2);
			break;
		case 2: System.out.println("Login requires critical information! Always try to keep this away from me in an encrypted file but to train me to decrypt it :)");
		optionmenu();
		choice2 = reader.nextInt();
		loginhelper(choice2);
			break;
		default: System.out.println("Wrong Choice! Good Bye Master");
		}
	}
}
