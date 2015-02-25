package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUp extends BaseClass {
	
Generate_Random gr= new Generate_Random();
//String patternUsed;

public SignUp(WebDriver driver)
{
	super(driver);
}
public void open_signup_page() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Executing Signup");
	logger.info("----------------");
	
    String s = driver.findElement(By.xpath(TestCore.object.getProperty("getstarted"))).getText();
    logger.info("Click on Start My Free Trial");
    Assert.assertEquals(s, "Start Now");
    driver.findElement(By.xpath(TestCore.object.getProperty("getstarted"))).click();
    logger.info("Open Signup page");
    Thread.sleep(3000);
}
public void signup() throws InterruptedException, IOException 
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("signup");	
	logger.info("------");

	Properties properties = new Properties();
	String patternUsed = TestCore.test3.getProperty("EmailUsedDuringSignUp");
	int pattNew = 0;
	try {
	pattNew = Integer.parseInt(patternUsed)+1;
	} 
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	String emailNew = "testuser"+(pattNew)+"@pley.com";
	String emailUsed = "testuser"+patternUsed+"@pley.com";
	logger.info("reading from file");	

	try {
		String newPatt = Integer.toString(pattNew);
		properties.setProperty("EmailUsedDuringSignUp", newPatt);
		
		File file = new File("test3.properties");
		FileOutputStream fileOut = new FileOutputStream(file);
		properties.store(fileOut, "Email which is already used");
		fileOut.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	catch (IOException e) 
	{
			e.printStackTrace();
	}
	logger.info("read");	
    
	/*WebElement te = (new WebDriverWait(driver, 90)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("freetrial"))));
	String t = driver.findElement(By.xpath(TestCore.object.getProperty("freetrial"))).getText();
	
	Assert.assertEquals(t, "Start Your FREE Trial");
	logger.info("click start");	*/
	//String u = driver.findElement(By.xpath(TestCore.object.getProperty("join5000"))).getText();
	String u = driver.findElement(By.xpath("//*[@id='eg-1']/div/h1")).getText();
	
	Assert.assertEquals(u, "Join 50,000+ Families Already Pleying.");
	logger.info("verify heads");	
	String v = driver.findElement(By.xpath(TestCore.object.getProperty("createaccount"))).getText();
	
	Assert.assertEquals(v, "1. Create Your Account");
	
	Thread.sleep(2000);
	logger.info("account");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("fullname")));
	
	de2.findElement(By.id("fullname")).sendKeys("Test User");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys(emailNew);
	   
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(TestCore.config.getProperty("passwd"));
	String w = driver.findElement(By.xpath(TestCore.object.getProperty("contnue"))).getText();
	Assert.assertEquals(w, "Continue");
	driver.findElement(By.xpath("//*[@id='signup1']/div[4]/div/button")).click();
	Thread.sleep(5000);
	   
	logger.info("Entered information");
	WebElement ship = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("shipinfo"))));
	String x = ship.getText();
	Assert.assertEquals(x, "2. Shipping Information");
	logger.info("shipping info verified");
	Thread.sleep(2000);
	//  driver.findElement(By.id("address1")).clear();
	//  driver.findElement(By.id("address1")).sendKeys("Street "+gr.generateRandomNumber(2));
	driver.findElement(By.xpath(TestCore.object.getProperty("address1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("address1"))).sendKeys("Street "+gr.generateRandomNumber(2));
	driver.findElement(By.id("address2")).clear();
	driver.findElement(By.id("address2")).sendKeys("Apt "+gr.generateRandomNumber(3));
	Thread.sleep(1000);
	driver.findElement(By.id("city")).clear();
	driver.findElement(By.id("city")).sendKeys("San Diego");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(TestCore.object.getProperty("address1"))).clear();
	driver.findElement(By.id("state")).sendKeys("California");
	   
	//new Select (driver.findElement(By.id("state"))).selectByVisibleText("California");
	
    new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States");
   
    driver.findElement(By.xpath("//*[@id='zip_code']")).clear();
   
    driver.findElement(By.xpath("//*[@id='zip_code']")).sendKeys(TestCore.config.getProperty("zipcode"));
    Thread.sleep(2000);
   
   
    String y = driver.findElement(By.xpath(TestCore.object.getProperty("contnue1"))).getText();
    Assert.assertEquals(y, "Continue");
    driver.findElement(By.xpath("//*[@id='signup2']/div[7]/div/button")).click();
    Thread.sleep(4000);
    logger.info("Entered Shipping Information");
    //String z = driver.findElement(By.xpath(TestCore.object.getProperty("billinginfo"))).getText();
    String z = driver.findElement(By.xpath("//*[@id='accordion']/div[3]/div[1]/h4/button/span[2]")).getText();
    Assert.assertEquals(z, "3. Billing Information");
    driver.findElement(By.id("cc-num")).clear();

    driver.findElement(By.id("cc-num")).sendKeys("4111");
    driver.findElement(By.id("cc-num")).sendKeys("1111");
    driver.findElement(By.id("cc-num")).sendKeys("1111");
    driver.findElement(By.id("cc-num")).sendKeys("1111");
    driver.findElement(By.id("cc-exp")).clear();

    driver.findElement(By.id("cc-exp")).sendKeys("11");
    driver.findElement(By.id("cc-exp")).sendKeys("2019");
    driver.findElement(By.id("cc-cvc")).clear();
    driver.findElement(By.id("cc-cvc")).sendKeys(TestCore.config.getProperty("ccv"));
    Thread.sleep(2000);
   
    String a = driver.findElement(By.xpath(TestCore.object.getProperty("firstset"))).getText();
    Assert.assertEquals(a, "Get My First Set");
    driver.findElement(By.id("form-submit")).click();
    Thread.sleep(5000);
    logger.info("Entered Billing Information");
    }

public void verify_signup() throws InterruptedException
{
	Logger logger = Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("verification starts...");
	logger.info("----------------------");
	
	WebElement v1 = driver.findElement(By.xpath(TestCore.object.getProperty("verification")));
    String s1 = v1.getText();

    Assert.assertEquals(s1, "Let's Create Your Pleylist");
    Thread.sleep(3000);	
    logger.info("Sign up verified");

}

}