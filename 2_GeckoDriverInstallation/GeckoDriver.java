package FirefoxInstallation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GeckoDriver {
 
 public static void main(String[] args) throws InterruptedException {
 
 System.setProperty("webdriver.gecko.driver", "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\geckodriver.exe");
 WebDriver driver = new FirefoxDriver();
 driver.get("http://www.github.com/NishkarshRaj");
 
 Thread.sleep(5000);
 driver.quit();
 }
}
