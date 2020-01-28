package internetExplorer;
public class IEConnection 
{
	public static void main(String[] args) 
	{
		 String exePath = "<<path to executable>>\\IEDriverServer.exe";
		 InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
		 serviceBuilder.usingPort(<<Port_Number>>); 
		 serviceBuilder.usingDriverExecutable(new File(exePath)); 
		 serviceBuilder.withHost("2.45.0.0");
		 InternetExplorerDriverService service = serviceBuilder.build();
		 InternetExplorerDriver driver = new InternetExplorerDriver(service);
		 driver.get("https://www.github.com/NishkarshRaj");
	}
}
