import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
    static FirefoxDriver dr= new FirefoxDriver();
	static String x= System.getProperty("key");
	 static Logger lg= Logger.getLogger(BaseTest.class);
	 static DOMConfigurator ng= new DOMConfigurator();

	
	@BeforeClass
	public static void start()
	{
		
		
	}
	@AfterClass
	public static void end() throws Throwable
	{
		Thread.sleep(5000);
		dr.close();
		
	}
	
	
}
