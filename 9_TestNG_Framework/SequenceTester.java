import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceTester 
{
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
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
}
