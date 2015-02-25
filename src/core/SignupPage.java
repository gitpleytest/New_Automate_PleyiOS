package core;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignupPage extends BaseClass {
	
	
	Generate_Random gr= new Generate_Random();
	public SignupPage(WebDriver driver){
		
		super(driver);
	}
	
	public void open_signup_page() throws InterruptedException{
		
		driver.findElement(By.xpath(TestCore.object.getProperty("getstarted"))).click();
		Thread.sleep(3000);	
	}
	
	public void signup() throws InterruptedException{
		
		
		driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys(gr.generateRandomString(5));
	    driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys(gr.generateRandomString(5));
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(gr.generateEmail(15));
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(TestCore.config.getProperty("passwd"));
	    driver.findElement(By.id("passwordconf")).clear();
	    driver.findElement(By.id("passwordconf")).sendKeys(TestCore.config.getProperty("passwd"));
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.id("add-addr")).clear();
	    driver.findElement(By.id("add-addr")).sendKeys(gr.generateRandomString(5));
	    driver.findElement(By.id("address2")).clear();
	    driver.findElement(By.id("address2")).sendKeys(gr.generateRandomString(5));
	    Thread.sleep(3000);
	    driver.findElement(By.id("city")).clear();
	    driver.findElement(By.id("city")).sendKeys(gr.generateRandomString(5));
	    Thread.sleep(3000);
	    
	    
	    /*driver.findElement(By.xpath("//*[@id='select2-chosen-1']")).click();
	    Thread.sleep(3000);*/
	    /*driver.findElement(By.xpath("//*[@id='s2id_autogen1_search']")).sendKeys("California");
	    Thread.sleep(1000);
	    *///driver.findElement(By.xpath("//*[@id='select2-result-label-1039']")).click();
	    /*Actions action = new Actions(driver);
	    WebElement we = driver.findElement(By.id("state"));
	    action.moveToElement(we).click().build().perform();*/
	    
	    new Select (driver.findElement(By.id("state"))).selectByVisibleText("Alabama");
	    driver.findElement(By.xpath("//*[@id='zip_code']")).clear();
	    driver.findElement(By.xpath("//*[@id='zip_code']")).sendKeys(TestCore.config.getProperty("zipcode"));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("cc_number")).clear();
	    driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	    
	    new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
	   
	    new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
	    
	    driver.findElement(By.id("security_code")).clear();
	    driver.findElement(By.id("security_code")).sendKeys(TestCore.config.getProperty("ccv"));
	    Thread.sleep(5000);
	    driver.findElement(By.id("form-submit")).click();
	    Thread.sleep(5000);
	    }

	public void verify_signup() throws InterruptedException{
		
		WebElement v1 = driver.findElement(By.xpath(TestCore.object.getProperty("verification")));
		String s1 = v1.getText();
		Assert.assertEquals(s1, "Thanks for joining Pley!");
		WebElement v2 = driver.findElement(By.xpath(TestCore.object.getProperty("verification2")));
		String s2 = v2.getText();
		Assert.assertEquals(s2, "You are now ready to start your FREE trial!");
		Thread.sleep(3000);	
	
	}
}
