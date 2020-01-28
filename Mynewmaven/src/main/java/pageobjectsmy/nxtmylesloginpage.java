package pageobjectsmy;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class nxtmylesloginpage {
	
	public nxtmylesloginpage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	
	public WebDriver driver;
By login=By.xpath("//i[@class='fa fa-lock']");

By username=By.id("email");

By password=By.id("password");

By rememberpass=By.xpath("//input[type='checkbox']");

By signin=By.xpath("//input[@type='submit']");

By newregister=By.linkText("New Registration");

By forgotpass=By.linkText("Forgot Password?");


	
	
public WebElement getlogin() 
{
	
return driver.findElement(login);
	
	
}



public WebElement getusername()

{
	
return driver.findElement(username);
	
	
}
	

public WebElement getpass()

{
	
return driver.findElement(password);
	
	
}

public WebElement getremempass()

{
	
return driver.findElement(rememberpass);
	
	
}

public WebElement getsigningin() 
{
	
return driver.findElement(signin);
	
	
}

public WebElement getnewregister() 
{
	
return driver.findElement(newregister);
	
	
}




}


