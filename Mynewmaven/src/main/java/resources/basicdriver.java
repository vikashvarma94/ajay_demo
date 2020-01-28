package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public  class basicdriver {

	public static WebDriver driver;
	public static Properties prope;
	
	public static  WebDriver driverwakeup() throws IOException
	{
		
	
		 prope=new Properties();
		FileInputStream faa=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\basicall.properties");
		prope.load(faa);
	String browsername=	prope.getProperty("browser");
	
	
	System.out.println(browsername);
		
	if(browsername.equals("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{
	
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	
	}
	
	else if(browsername.equals("IE"))
	{
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		
	}
	
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	return driver;
	}
	
	public void getscreenshot(String result) throws IOException
	{
File src=		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("d://aj testing//myscreenshot//"+result+"screenshot.png"));
		
		
		
	}
	
}
