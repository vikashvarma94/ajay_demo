package academy.Mynewmaven;

import java.io.IOException;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectsmy.nxtmylesregister;
import resources.basicdriver;
import org.apache.logging.log4j.*;
public class RegistrationpageTest extends basicdriver {
public static Logger log=	LogManager.getLogger(RegistrationpageTest.class.getName());
	
	@BeforeTest()
	public void validation() throws IOException
	{
		driver=driverwakeup();
		driver.get(prope.getProperty("url"));
		
		
		
		
	}
	
	
	@Test
	public void registrationtest() throws IOException, InterruptedException
	{
	
	
	nxtmylesregister regi=new nxtmylesregister(driver);
	
	Thread.sleep(2000);
	regi.getregistration().click();
	log.info("clicked on registration button");
	
	Select ir=new Select(regi.getdropdown());
	
	
	ir.selectByIndex(1);
	Thread.sleep(2000);
	
	regi.getradio().click();
	regi.getmobid().sendKeys("655798769");
	log.info("sending keys required");
	regi.getuserid().sendKeys("hiitrju");
	regi.getpasswardi().sendKeys("hgfdrewet");
	regi.getrepassid().sendKeys("hgfdrewet");
	regi.getfullname().sendKeys("jghttrre");
	regi.getaddressi().sendKeys("ytfdsweefcfd");
	regi.getpincodei().sendKeys("655435");
	regi.getadharn().sendKeys("fgdsawrhk");
	regi.getcreateacc().click();
	log.info("registration completed secussfully");
	}

	@AfterTest
	public void closeall()
	
	{
		
		driver.close();
	    driver=null;	
		
	}
	
	
}

