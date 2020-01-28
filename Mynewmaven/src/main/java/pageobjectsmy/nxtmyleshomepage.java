package pageobjectsmy;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class nxtmyleshomepage {
	
	public nxtmyleshomepage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	
	public WebDriver driver;
By login=By.xpath("//i[@class='fa fa-lock']");
By register=By.xpath("//i[@class='fa fa-user']"); 
	By headerhome=By.linkText("Home");
	By searchtruck=By.linkText("Search a Truck");
	By availabletrucks=By.xpath("//a[@class='Active']");
	By aboutus=By.linkText("About Us");
	
	
public WebElement getlogin() 
{
	
return driver.findElement(login);
	
	
}
	
public WebElement getregister() 
{
	
return driver.findElement(register);
	
	
}

public WebElement getheaderhome() 
{
	
return driver.findElement(headerhome);
	
	
}

public WebElement getsearchatruck() 
{
	
return driver.findElement(searchtruck);
	
	
}


public WebElement getavailabletrucks()
{
	
return	driver.findElement(availabletrucks);

}



public WebElement getaboutus()
{
	
return	driver.findElement(aboutus);
	
	
	
	
}
	
}


