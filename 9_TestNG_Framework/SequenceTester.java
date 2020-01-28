// Class Annotation belongs to Junit
import org.junit.AfterClass;
import org.junit.BeforeClass;
// Suite Level -> Suite and Test Annotation belong to testng.annotations
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
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
}
