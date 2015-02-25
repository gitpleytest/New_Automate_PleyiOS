package core;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftExistingToNew_Login extends BaseClass 

{
	Generate_Random gr= new Generate_Random();
	String amount= gr.generateRandomNumber(3);
	public GiftExistingToNew_Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void giftExistingUserToNewUser_Login_25() throws InterruptedException
	{
		
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Executing test cases of Existing to New $25 Login");
		logger.info("----------------------------------------------------------------------");
		driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
		Thread.sleep(3000);
		logger.info("Click on Menu tab");
		driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift_login"))).click();
		Thread.sleep(10000);
		logger.info("Click on Give as Gift");
		WebElement de2 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giftas"))));
		//driver.findElement(By.xpath(TestCore.object.getProperty("giftas"))).click();
		de2.click();
		logger.info("Selecting $25 Gift Card");
		Thread.sleep(3000);
		String a = driver.findElement(By.xpath(TestCore.object.getProperty("heading_n_gftcard"))).getText();
		Assert.assertEquals(a, "Give the Gift of Creativity");
		
		
		logger.info("Entering user data");	
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
		driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
		Thread.sleep(2000);
		logger.info("Verifying amount");
		WebElement de3 = (new WebDriverWait(driver, 90)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("Buygift"))));
		
		de3.click();
		
		Thread.sleep(5000);	
		   
	}

	public void confirmgiftExistingUserToNewUser_Login_25() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Verifying confirmation message");
		Thread.sleep(2000);
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		
		Assert.assertEquals(p, "Success!");
		logger.info("Gift sent successfully");
		Thread.sleep(1000);
		
	}

	public void giftExistingUserToNewUser_Login_50() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Executing test cases of Existing to new user $50 Login");
		logger.info("-----------------------------");
		driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
		Thread.sleep(3000);
		logger.info("Click on Menu tab");
		WebElement de1 = (new WebDriverWait(driver, 90)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift_login"))));
		de1.click();
		//driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
		Thread.sleep(5000);
		logger.info("Click on Give as Gift");
		
		WebElement de2 = (new WebDriverWait(driver, 90)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giftas50"))));
		de2.click();
		
		//driver.findElement(By.xpath(TestCore.object.getProperty("giftas50"))).click();
		Thread.sleep(3000);
		logger.info("Entering user data");
		
		WebElement de3 = (new WebDriverWait(driver, 90)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("fullname"))));
		de3.clear();
		//driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("Testuser"+gr.generateRandomNumber(2)+"@pley.com");
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
		driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
		Thread.sleep(2000);
		
		logger.info("Verifying amount");
		String gftamount = driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[1]/ul[1]/li[1]/h4")).getText();
		Assert.assertEquals(gftamount, "Gift Amount");
		String total = driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[1]/ul[2]/li[1]/h4")).getText();
		Assert.assertEquals(total, "Total");
			driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[2]/button")).click();
		Thread.sleep(5000);	
		   
	}

	public void confirmgiftExistingUserToNewUser_Login_50() throws InterruptedException
	{
		Thread.sleep(2000);
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Verifying confirmation");
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		Assert.assertEquals(p, "Success!");
		Thread.sleep(1000);
		logger.info("Gift sent successfully");
	//	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
		Thread.sleep(2000);
	}
	
	public void giftExistingUserToNewUser_Login_Random() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		Thread.sleep(2000);
		logger.info("Executing test cases of Existing to New user with any amount Random");
		logger.info("-------------------------------------------------------------------");
		//driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift_login"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys("9");
		Thread.sleep(2000);
		driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
		Thread.sleep(2000);
		String c= driver.findElement(By.xpath(TestCore.object.getProperty("minimumamount"))).getText();
		
		Assert.assertEquals(c, "The minimum gift amount is $10");
		Thread.sleep(2000);
		driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys(amount);
		driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
		Thread.sleep(3000);
		logger.info("Entering user data");
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
		driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
		Thread.sleep(4000);
		logger.info("Verifying amount");
	String gftamount = driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[1]/ul[1]/li[1]/h4")).getText();
	Assert.assertEquals(gftamount, "Gift Amount");
	String total = driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[1]/ul[2]/li[1]/h4")).getText();
	Assert.assertEquals(total, "TOTAL");
		driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[2]/button")).click();
		
		Thread.sleep(5000);	
		   
	}

	public void confirmgiftExistingUserToNewUser_Login_Random() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Verifying confirmation message ");
		Thread.sleep(2000);
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		Assert.assertEquals(p, "Thank You!");
		Thread.sleep(1000);
		logger.info("Gift sent successfully");
		WebElement de3 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("gohome"))));
		//driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
		//Thread.sleep(2000);
		de3.click();
	}


	}





