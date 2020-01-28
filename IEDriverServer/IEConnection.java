package internetExplorer;
public class IEConnection 
{
	public static void main(String[] args) 
	{
		 String exePath = "D:\\UPES DevOps\\DevOps Sem 6\\Test Automation\\Softwares\\InternetExplorer\\IEDriverServer.exe";
		 InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
		 serviceBuilder.usingPort(1080); // This specifies that sever should start at this port
		 serviceBuilder.usingDriverExecutable(new File(exePath)); //Tell it where you server exe is
		 serviceBuilder.withHost("2.45.0.0");
		 InternetExplorerDriverService service = serviceBuilder.build(); //Create a driver service and pass it to Internet explorer driver instance
		 InternetExplorerDriver driver = new InternetExplorerDriver(service);
		 driver.get("http://toolsqa.com");
	}
}
