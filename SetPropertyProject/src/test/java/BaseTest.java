import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
    static FirefoxDriver dr= new FirefoxDriver();
	//static String x= System.getProperty("key");
	 static Logger lg= Logger.getLogger(BaseTest.class);
	 static DOMConfigurator ng= new DOMConfigurator();
	 static Properties mp= new Properties();
	 //ng.configure("log4j.properties");
		//FileInputStream st= new FileInputStream("config.properties");
		//mp.load(st);

	
	@BeforeClass
	public static void start() throws IOException
	{
		ng.configure("log4j.properties");
		FileInputStream st= new FileInputStream("config.properties");
		mp.load(st);
		lg.info("============= visiting url ==============");
		dr.get(mp.getProperty("url"));
		
		
	}
	@AfterClass
	public static void end() throws Throwable
	{
		Thread.sleep(5000);
		dr.close();
		
	}
	
	
}
