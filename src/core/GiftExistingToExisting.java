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

public class GiftExistingToExisting extends BaseClass
{
	Generate_Random gr= new Generate_Random();
	String amount = gr.generateRandomNumber(3);
	public GiftExistingToExisting(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

public void giftExistingUserToExistingUser_25() throws InterruptedException
{	
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Executing Test case of Existing user to Existing user");
	logger.info("----------------------------------------------------------------------");
	
	driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
	Thread.sleep(3000);
	logger.info("Click on Menu tab");
	WebElement de1 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift"))));
	de1.click();
	//driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	Thread.sleep(10000);
	logger.info("Click on Give as Gift");
	WebElement de2 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giftas"))));
	//driver.findElement(By.xpath(TestCore.object.getProperty("giftas"))).click();
	de2.click();
	logger.info("Selecting $25 Gift Card");
	Thread.sleep(5000);
	WebElement de3 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("heading_n_gftcard"))));
	
	String a = de3.getText();
	Assert.assertEquals(a, "Give the Gift of Creativity");
	
	WebElement de4 = (new WebDriverWait(driver, 2000)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("firstname"))));
	de4.clear();
	
	//driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test user");	
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	logger.info("User data is entered");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	logger.info("Confirming Amount");

	driver.findElement(By.id("cc_number")).clear();
	driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	Thread.sleep(1000);   
	new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
	  
   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
	   
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(TestCore.config.getProperty("ccv"));
	   Thread.sleep(2000);
	   logger.info("Entering Payment details");
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToExistingUser_25() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Verifying Confirmation message");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	Assert.assertEquals(p, "Success!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(2000);
	logger.info("Gift sent successfully");
}



public void giftExistingUserToExistingUser_50() throws InterruptedException

{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Executing Test case of Existing user to Existing user $50");
	logger.info("----------------------------------------------------------------------");
	WebElement de1 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("menu"))));
	de1.click();
	//driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
	Thread.sleep(3000);
	logger.info("Click on Menu tab");
	WebElement de2 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift"))));
	de2.click();
	
	//driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	Thread.sleep(5000);
	logger.info("Click on Give as Gift");
	
	
driver.findElement(By.xpath(TestCore.object.getProperty("giftas50"))).click();
	logger.info("Selecting $50 Gift card");
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test user");	
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	logger.info("Entering user data");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	
		logger.info("Confirming amount");

	driver.findElement(By.id("cc_number")).clear();
	driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	Thread.sleep(1000);   
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
	  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
	   
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   Thread.sleep(2000);
	   logger.info("Entering Payment details");
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
	   
}

public void confirmgiftExistingUserToExistingUser_50() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Verifying Confirmation message");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	Assert.assertEquals(p, "Success!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	logger.info("Gift Sent Successfully");
	Thread.sleep(2000);
	
}

public void giftExistingUserToExistingUser_Random() throws InterruptedException
{
	
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Executing Test cases of Existing user to Existing user Random");
	logger.info("-------------------------------------------------------------");
	WebElement de1 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("menu"))));
	//driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
	Thread.sleep(2000);
	de1.click();
	logger.info("click on Menu Tab");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift"))));
	//driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	de2.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).clear();
	logger.info("Entering amount in Gift Card");
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
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test user");	
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	logger.info("Entering user data");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	
	/*String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount"))).getText();
	System.out.println(a);
	Assert.assertEquals(a, amount);
	*/String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
	System.out.println(b);
	Assert.assertEquals(b, amount);

	driver.findElement(By.id("cc_number")).clear();
	driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	Thread.sleep(1000);   
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
	  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
	   
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   logger.info("Entering payment details");
}

public void confirmgiftExistingUserToExistingUser_Random() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Verifying Confirmation message");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	Assert.assertEquals(p, "Thank You!");
	Thread.sleep(1000);
	//driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	//Thread.sleep(2000);
	logger.info("Gift sent successfully");
}


}
