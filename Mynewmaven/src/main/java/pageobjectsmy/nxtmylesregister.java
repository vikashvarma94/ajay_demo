package pageobjectsmy;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class nxtmylesregister {
	
	
	public nxtmylesregister(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	
	public WebDriver driver;

By regiser=By.xpath("//a[@title='Register']");
By dropdownl=By.xpath("//select[@id='btype']");
By radio=By.xpath("//input[@value='Own']");
By mobileid=By.id("usermobile");

By usernameb=By.id("useremail");
By passid=By.id("password");
By repassid=By.id("cpassword");
By fullname=By.id("pname");
By addressi=By.id("address");
By pincodei=By.id("pincode");
By adhari=By.id("aadharno");
By createacc=By.id("submit");
public WebElement getregistration()
{

	
	return driver.findElement(regiser);
	
	

}


public WebElement getdropdown()
{

	
	return driver.findElement(dropdownl);
	
	

}

public WebElement getradio()
{

	
	return driver.findElement(radio);
	
	

}


public WebElement getmobid()
{

	
	return driver.findElement(mobileid);
	
	

}


public WebElement getuserid()
{

	
	return driver.findElement(usernameb);
	
	

}

public WebElement getpasswardi()
{

	
	return driver.findElement(passid);
	
	

}

public WebElement getrepassid()
{

	
	return driver.findElement(repassid);
	
	

}


public WebElement getfullname()
{

	
	return driver.findElement(fullname);
	
	

}


public WebElement getaddressi()
{

	
	return driver.findElement(addressi);
	
	

}


public WebElement getpincodei()
{

	
	return driver.findElement(pincodei);
	
	

}

public WebElement getadharn()
{

	
	return driver.findElement(adhari);
	
	

}


public WebElement getcreateacc()
{

	
	return driver.findElement(createacc);
	
	

}


}


