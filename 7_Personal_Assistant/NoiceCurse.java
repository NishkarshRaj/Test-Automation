package personal_assistant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class NoiceCurse 
{
	public static void profilevisitor(int ch)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.github.com/NishkarshRaj");
		driver.manage().window().maximize();
	}
	public static void optionmenu()
	{
		System.out.println("Following options are available: ");
		System.out.println("1) GitHub");
		System.out.println("2) LinkedIn");
		System.out.println("3) Twitter");
		System.out.println("4) Instagram");
	}
	public static void main(String [] args)
	{
		// Declarations
		Scanner reader = new Scanner(System.in);
		int choice1, choice2;
		String website;
		
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
			break;
		default: System.out.println("Wrong Choice! Good Bye Master");
		}
		
	}
}
