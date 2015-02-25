package core;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.TestCore;

public class Login extends BaseClass{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void do_login() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Log In");
		logger.info("------");
		Thread.sleep(3000);
		
		WebElement de1 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("menu"))));
		
		de1.click();
		Thread.sleep(3000);
		logger.info("Click on Menu tab");
	
		WebElement de2 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-out']/ul/li[3]/a")));
		de2.click();
		Thread.sleep(5000);
		logger.info("Click on Login button");
		
		WebElement de3 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(By.id(TestCore.object.getProperty("email_login"))));
		de3.clear();
		de3.sendKeys(TestCore.config.getProperty("user_email1"));	
		//driver.findElement(By.id("password")).sendKeys(TestCore.config.getProperty("pwd"));
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(TestCore.config.getProperty("pwd"));
		logger.info("Enter login details");
		
		driver.findElement(By.xpath(TestCore.object.getProperty("Login_buttn"))).click();
		WebElement de4 = (new WebDriverWait(driver, 90)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("welcome"))));
		de4.isDisplayed();
		logger.info("Successfully Logged In");
		Thread.sleep(3000);
		
	}
}
