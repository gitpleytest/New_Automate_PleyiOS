package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PricingPage extends BaseClass{
    Generate_Random gr = new Generate_Random();
	public PricingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void selectPlan_Starter() throws InterruptedException{
		driver.get("https://stage.pley.com/pricing");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(TestCore.object.getProperty("Select"))).click();
		System.out.println("Select Plan Starter()");
		Thread.sleep(2000);
		
	}
	
	public void selectPlan_Inclusive() throws InterruptedException{
		driver.get("https://stage.pley.com/pricing");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(TestCore.object.getProperty("select_inc"))).click();
		Thread.sleep(3000);
		System.out.println("selectPlan_INStarter()");
	}
	
	public void chooseSavings() throws InterruptedException{
		Thread.sleep(2000);
	    driver.findElement(By.xpath(TestCore.object.getProperty("Month"))).click();
	
	 
		Thread.sleep(2000);
		System.out.println("chooseSavings()");
	}
	
	public void createAccount() throws InterruptedException{
		driver.findElement(By.xpath(TestCore.object.getProperty("Name"))).sendKeys(TestCore.config.getProperty("Name"));
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(gr.generateEmail(15));
		driver.findElement(By.xpath(TestCore.object.getProperty("Pswd"))).sendKeys(TestCore.config.getProperty("Pass"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("Submit"))).click();
		Thread.sleep(3000);
		System.out.println("CreateAccount()");
	}
	
	public void checkout() throws InterruptedException{
		driver.findElement(By.xpath(TestCore.object.getProperty("Address"))).sendKeys(TestCore.config.getProperty("Add"));
		driver.findElement(By.xpath(TestCore.object.getProperty("City"))).sendKeys(TestCore.config.getProperty("City"));
		new Select(driver.findElement(By.id("state"))).selectByVisibleText(TestCore.config.getProperty("State"));
		driver.findElement(By.id("zip_code")).clear();
		driver.findElement(By.id("zip_code")).sendKeys(TestCore.config.getProperty("zipcode"));
		driver.findElement(By.xpath(TestCore.object.getProperty("ccnum"))).sendKeys(TestCore.config.getProperty("cc_number"));
		driver.findElement(By.id("security_code")).clear();
		driver.findElement(By.id("security_code")).sendKeys(TestCore.config.getProperty("ccv"));
		driver.findElement(By.xpath(TestCore.object.getProperty("Expmonth"))).sendKeys(TestCore.config.getProperty("month"));
		driver.findElement(By.xpath(TestCore.object.getProperty("Expyear"))).sendKeys(TestCore.config.getProperty("year"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("Subldt"))).click();
		Thread.sleep(3000);
		System.out.println("checkout()");
	}
	
	public void verifySignup() throws InterruptedException{
		WebElement v = driver.findElement(By.xpath(TestCore.object.getProperty("verification3")));
		String s = v.getText();
		Assert.assertEquals(s, "Have Fun Pleying!");
		Thread.sleep(2000);
		System.out.println("verifysignup()");
	}
	
}
