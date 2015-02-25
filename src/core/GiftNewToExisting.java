package core;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftNewToExisting extends BaseClass

{
	Generate_Random gr= new Generate_Random();
	String amount= gr.generateRandomNumber(3);

	public GiftNewToExisting(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void giftNewUserToExistingUser_25() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Executing test cases of New user to Existing user");
		logger.info("----------------------------------------------------------------------");
		driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
		Thread.sleep(3000);
		logger.info("Click on Menu tab");
		driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
		Thread.sleep(10000);
		logger.info("Click on Give as Gift");
		WebElement de2 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giftas"))));
		//driver.findElement(By.xpath(TestCore.object.getProperty("giftas"))).click();
		de2.click();
		logger.info("Selecting $25 Gift Card");
		Thread.sleep(3000);
		String a = driver.findElement(By.xpath(TestCore.object.getProperty("heading_n_gftcard"))).getText();
		Assert.assertEquals(a, "Give the Gift of Creativity");
		
			logger.info("Entering User Data");
		driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test User");	
		driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
		driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
		Thread.sleep(2000);
		logger.info("Verifying amount");
			logger.info("Entering payment details");
		driver.findElement(By.id("cc_number")).clear();
		   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
		   
		   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("4");
		  
		   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2022");
		   
		   driver.findElement(By.id("security_code")).clear();
		   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
		   Thread.sleep(2000);
		   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
		
		   Thread.sleep(4000);	
		   
	}

	public void confirmgiftNewUserToExistingUser_25() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Verifying Confirmation message");
		Thread.sleep(2000);
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		
	
		Assert.assertEquals(p, "Success!");
		logger.info("Gift sent successfully");	
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
		Thread.sleep(2000);
	}
	
	public void giftNewUserToExistingUser_50() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Executing test cases of New user to Existing user $50");
		logger.info("-----------------------------------------------------");
		driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
		Thread.sleep(3000);
		logger.info("Click on Menu tab");
		WebElement de1 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift"))));
		de1.click();
		//driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
		Thread.sleep(5000);
		logger.info("Click on Give as Gift");
		
		WebElement de2 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giftas50"))));
		de2.click();
		
		//driver.findElement(By.xpath(TestCore.object.getProperty("giftas50"))).click();
		Thread.sleep(3000);
		logger.info("Entering User data");
		WebElement de3 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("firstname"))));
		de3.click();
		
		driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test User");	
		driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
		driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
		Thread.sleep(2000);
		
		logger.info("Verifying amount");
		
		logger.info("Entering payment details");
		driver.findElement(By.id("cc_number")).clear();
		driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	   
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
	  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
	   
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
		
	}
	
	
	public void confirmgiftNewUserToExistingUser_50() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Verifying confirmation message");
		Thread.sleep(2000);
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		Thread.sleep(1000);
		Assert.assertEquals(p, "Success!");
		logger.info("Gift Sent Succesfully");
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
		Thread.sleep(2000);
	}
		
	public void giftNewUserToExistingUser_Random() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Executing test cases of New user to Existing user with any amount");
	driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).clear();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys("9");
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	Thread.sleep(1000);
	String c= driver.findElement(By.xpath(TestCore.object.getProperty("minimumamount"))).getText();
	Assert.assertEquals(c, "The minimum gift amount is $10");
	Thread.sleep(2000);

	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys(amount);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	Thread.sleep(3000);
	logger.info("Entring user data");
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test User");	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("user_email1"));
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	
	/*String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount"))).getText();
	System.out.println(a);
	Assert.assertEquals(a, amount);
	*/String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
	
	Assert.assertEquals(b, amount);
	logger.info("Entering payment details");
	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	   
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
	  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
	   
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
	}
	public void confirmgiftNewUserToExistingUser_Random() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Verifying confirmation message");
		Thread.sleep(2000);
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		Assert.assertEquals(p, "Thank You!");
		logger.info("Gift sent successfully");
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
		
		Thread.sleep(2000);
	}
	


}



