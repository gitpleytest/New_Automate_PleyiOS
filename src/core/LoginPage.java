package core;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BaseClass {
 public LoginPage(WebDriver driver){
		
		super(driver);
	}
public void login() throws InterruptedException
		{
	
	driver.findElement(By.xpath(TestCore.object.getProperty("Login_tab"))).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(TestCore.object.getProperty("email_tab"))).clear();
    driver.findElement(By.cssSelector(TestCore.object.getProperty("email_tab"))).sendKeys(TestCore.config.getProperty("email"));	
	driver.findElement(By.xpath(TestCore.object.getProperty("password"))).sendKeys(TestCore.config.getProperty("password"));
	driver.findElement(By.xpath(TestCore.object.getProperty("Login_buttn"))).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
  		}

public void verify_login(){
	
	Assert.assertEquals("Pley - Pleygo - My Account", driver.getTitle());
	Assert.assertEquals("My Account", driver.findElement(By.linkText("My Account")).getText());
}
	}