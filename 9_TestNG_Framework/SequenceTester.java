// Class Annotation belongs to Junit
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
// Suite Level -> Suite and Test Annotation belong to testng.annotations!! Method also is testng part
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceTester 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
  @Test
  public void test() 
  {
	  System.out.println("Test Case Execution");
  }
  @AfterTest
	public void aftertest()
	{
		System.out.println("After Test");
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
