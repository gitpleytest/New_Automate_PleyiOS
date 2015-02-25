package core;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;
import com.thoughtworks.selenium.webdriven.commands.Submit;

public class GiftExistingToNew extends BaseClass
{
	Actions action = new Actions(driver);
	Generate_Random gr= new Generate_Random();
	String amount = gr.generateRandomNumber(3);
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	public GiftExistingToNew(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

public void giftExistingUserToNewUser_25() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Executing Test cases of Existing user to New user 25");
	logger.info("----------------------------------------------------");
	
	driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
	Thread.sleep(3000);
	logger.info("Click on Menu tab");
	WebElement de1 = (new WebDriverWait(driver, 200)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift"))));
	de1.click();
	//driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	Thread.sleep(10000);
	logger.info("Click on Give as Gift");
	WebElement de2 = (new WebDriverWait(driver, 200)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giftas"))));
	//driver.findElement(By.xpath(TestCore.object.getProperty("giftas"))).click();
	de2.click();
	logger.info("Selecting $25 Gift Card");
	Thread.sleep(6000);
	WebElement de3 = (new WebDriverWait(driver, 200)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("heading_n_gftcard"))));
	
	String a = driver.findElement(By.xpath(TestCore.object.getProperty("heading_n_gftcard"))).getText();
	Assert.assertEquals(a, "Give the Gift of Creativity");
	
	WebElement de4 = (new WebDriverWait(driver, 200)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("firstname"))));
	de4.clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test User");	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	logger.info("Entering user data");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	logger.info("Verifying Amount");
	driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div[1]/div/div/ul[2]/li[2]/h4/span"));
	driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div[1]/div/div/ul[2]/li[2]/h4"));
	logger.info("Enter Credit Card details");
	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	    
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("2");
		  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2018");
	   Thread.sleep(2000);
	 
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToNewUser_25() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Verifying Confirmation message");
	logger.info("------------------------------");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	Assert.assertEquals(p, "Success!");
	Thread.sleep(1000);
	//driver.findElement(By.xpath(TestCore.object.getProperty("Go Back Home"))).click();
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(3000);
	logger.info("Gift Sent successfully");
}

public void giftExistingUserToNewUser_50() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Executing Test Cases of Existing user to New user $50");
	logger.info("-----------------------------------------------------");
	driver.findElement(By.xpath(TestCore.object.getProperty("menu"))).click();
	Thread.sleep(3000);
	logger.info("Click on Menu tab");
	WebElement de1 = (new WebDriverWait(driver, 500)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift"))));
	de1.click();
	
	//driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	Thread.sleep(5000);
	logger.info("Click on Give as Gift");
	
	WebElement de2 = (new WebDriverWait(driver, 200)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giftas50"))));
	de2.click();
	
	//driver.findElement(By.xpath(TestCore.object.getProperty("giftas50"))).click();
	logger.info("Selecting $50 Gift Card");
	
	Thread.sleep(3000);
	
	WebElement de3 = (new WebDriverWait(driver, 200)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("firstname"))));
	de3.clear();
	
	//driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test user");	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	logger.info("Entering User data");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);

	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("8");
		  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2016");
	   logger.info("Entering payment details");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToNewUser_50() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Verifying Confirmation message");
	logger.info("------------------------------");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	Assert.assertEquals(p, "Success!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(2000);
	logger.info("Gift Sent Successfully");
}

public void giftExistingUserToNewUser_Random() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Executing test cases of Existing to New User with any amount");
	logger.info("------------------------------------------------------------");
	WebElement de1 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("menu"))));
	de1.click();
	Thread.sleep(5000);
	logger.info("Click on Menu tab");
	WebElement de2 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift"))));
	de2.click();
	logger.info("Click on Give as Gift");
	
	WebElement de3 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giftitrandom"))));
	//driver.findElement(By.xpath("//input[@type='text']")).click();
	Thread.sleep(3000);
	
	
	
	
	//JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("document.getElementsByType('text')[0].setAttribute('type', 'text');");
	
	//driver.findElement(By.xpath("//input[@type='text']")).click();
	//driver.findElement(By.xpath("//input[@type='text']")).clear();
	
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9");
	//((JavascriptExecutor) jse1).executeScript("arguments[0].value ='9';",driver.findElement(By.xpath("//input[@type='text']")));
	//WebElement de3 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TestCore.object.getProperty("giftrandom"))));
	//action.moveToElement(de3).perform();
	//WebElement we= driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom")));
	//action.moveToElement(we).build().perform();
	//we.click();
	/*Thread.sleep(2000);
	logger.info("Enter 9");
	String field_value= driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
	logger.info(field_value);
	*///logger.info("click on field");
	//WebElement de4 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giftrandom"))));
	/*driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).click();
	logger.info("click on field");
	Thread.sleep(2);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys(Keys.NUMPAD9);
	//de4.sendKeys("9");
	Thread.sleep(2000);*/
	
	/*driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys("9");
	logger.info("Enter 9");
	Thread.sleep(2000);*/
	/*driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	Thread.sleep(1000);
	String c= driver.findElement(By.xpath(TestCore.object.getProperty("minimumamount"))).getText();
	Assert.assertEquals(c, "The minimum gift amount is $10");
	logger.info("verified validation message");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(7000);
	logger.info("Page Refresh");
	*///driver.findElement(By.xpath("//input[@type='text']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@type='text']")).clear();
	Thread.sleep(2000);
	
	//Thread.sleep(2000);
	//driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).clear();
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.NUMPAD9+""+Keys.NUMPAD8);
	//WebElement text = driver.findElement(By.xpath("//*[@id='anyamount']/div/h4/div"));
	/*WebElement iframe1 = driver.findElement(By.tagName("")));
    driver.switchTo().frame(iframe1);
    WebElement web=driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom")));
    web.clear();
    Actions act1=new Actions(driver);
    act1.sendKeys(web, amount);
    act1.build().perform();*/
    
	//text.findElement(By.id("anyamount"));
	//jse1.executeScript("document.getElementById('anyamount').value="+amount+"");
	//WebElement iframe1 = driver.findElement(By.xpath("//iframe[starts-with(@src, 'rendermail')]"));
	//driver.switchTo().frame(iframe1);
	
	
	//     Click on the text filed
	
	driver.findElement(By.xpath("//*[@id='anyamount']/div/h4/div/input")).click();
	
	
	/*((JavascriptExecutor) jse1).executeScript("arguments[0].value ='19';",driver.findElement(By.xpath("//input[@type='text']")));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='anyamount']/div/h4/div/input")).click();
	driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	Thread.sleep(2000);*/
	
	
	//     Enter amount using javascript (sendkeys is not working)
	
	((JavascriptExecutor) jse1).executeScript("arguments[0].value ='999';",driver.findElement(By.xpath("//*[@id='anyamount']/div/h4/div/input")));
	
	/*driver.findElement(By.xpath("//*[@id='anyamount']/div/h4/div/input")).click();
	Thread.sleep(1000);*/

	
	//      Click on Send button
	
	driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	
	
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(""+amount);
	//jse2.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@type='text']")));
	//((JavascriptExecutor) jse2).executeScript("arguments[0].value ="+amount+";",driver.findElement(By.xpath("//input[@type='text']")));
	//logger.info(jse2);
	logger.info("amount entered");
	Thread.sleep(2000);
	
	
	//  Verify the amount entered 
	
	String field_value2= driver.findElement(By.xpath("//*[@id='anyamount']/div/h4/div/input")).getAttribute("value");
	logger.info("Entered amount is: "+field_value2);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	
	
	logger.info("click random");
	Thread.sleep(2000);
	//driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	//logger.info("clicked");
	Thread.sleep(10000);
	logger.info("ENter name");
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test user");	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("testuser"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	logger.info("Entering User data");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
	Assert.assertEquals(b, amount);
	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	    
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("2");
		  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2018");
	   Thread.sleep(2000);
	   logger.info("Entering payment details");;
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
}


public void confirmgiftExistingUserToNewUser_Random() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Verifying Confirmation message");
	logger.info("------------------------------");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p = de2.getText();
	Assert.assertEquals(p, "Success!");
	Thread.sleep(1000);
	//driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	//Thread.sleep(2000);
	logger.info("Gift Sent successfully");

}

}
