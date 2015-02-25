package core;



import java.util.ArrayList;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Links extends BaseClass {

	public LoginPage_Links(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	


	public void login() throws InterruptedException
	{
		driver.get("https://stage.pley.com/");
		driver.findElement(By.xpath(TestCore.object.getProperty("Login_tab"))).click();
		Thread.sleep(2000);

	}
	public void testSignupLink() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("sl"))).click();
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("v"))).getText();
		Assert.assertEquals(s, "Start Your FREE Trial");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	public void testForgetPassword() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("Login_tab"))).click();
		Thread.sleep(2000);
         driver.findElement(By.xpath(TestCore.object.getProperty("fpl"))).click();
         Thread.sleep(2000);
         String s = driver.findElement(By.xpath(TestCore.object.getProperty("v6"))).getText();
         Assert.assertEquals(s, "Forgot Password");
         Thread.sleep(2000);
         driver.findElement(By.xpath(TestCore.object.getProperty("cls"))).click();
         Thread.sleep(2000);
	}
	
	public void MyAccount_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("mat"))).click();
		Thread.sleep(2000);
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://stage.pley.com/user/my_account");
		Thread.sleep(2000);
	}
	
	public void ManageAccount_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("ma"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vma"))).getText();
		Assert.assertEquals(s, "Account Settings");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void ManagePley_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("mp"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vmp"))).getText();
		Assert.assertEquals(s, "My Pleylist");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void ManageGallery_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("mg"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vmg"))).getText();
		Assert.assertEquals(s, "My Gallery");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Account_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("at"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vat"))).getText();
		Assert.assertEquals(s, "Account Settings");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void MyPleyList_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("mpt"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vmpt"))).getText();
		Assert.assertEquals(s, "My Pleylist");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void InviteGet_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("ig"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vig"))).getText();
		Assert.assertEquals(s, "Invite by Email");
		driver.navigate().back();
	}
	
	public void Invite_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("Invt"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vinvt"))).getText();
		Assert.assertEquals(s, "Invite by Email");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void AboutUs_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("abs"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vabs"))).getText();
		Assert.assertEquals(s, "About Us");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Blog_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("blg"))).click();
		Thread.sleep(2000);
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://blog.pley.com/");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Gift_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("gft"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vgft"))).getText();
		Assert.assertEquals(s, "Give the Gift of Creativity");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Gallery_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("glly"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vglly"))).getText();
		Assert.assertEquals(s, "My Gallery");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Press_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("prss"))).click();
		Thread.sleep(2000);
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://stage.pley.com/press");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void TradeIn_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("trd"))).click();
		Thread.sleep(2000);
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://stage.pley.com/trade-in");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Partner_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("ptr"))).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath(TestCore.object.getProperty("vprtr"))).getText();
		Assert.assertEquals(s, "Partners & Affiliate Program");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void ContactUs_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("cnt"))).click();
		Thread.sleep(2000);
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://pleygo.uservoice.com/");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Facebook_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("fbk"))).click();
		Thread.sleep(2000);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
  	    driver.switchTo().window(tabs2.get(1));
  	    String s = driver.getCurrentUrl();
  	    Assert.assertEquals(s, "https://www.facebook.com/pleygo");
  	    driver.close();
  	    driver.switchTo().window(tabs2.get(0));
  	    Thread.sleep(2000);
	}
	
	public void Tweeter_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("twtr"))).click();
		Thread.sleep(2000);
		ArrayList<String> tab2 = new ArrayList<String>  (driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://twitter.com/MyPley");
		driver.close();
		driver.switchTo().window(tab2.get(0));
		Thread.sleep(2000);
	}
	
	public void Pinterest_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("ptrt"))).click();
		Thread.sleep(2000);
		ArrayList<String> tab3 = new ArrayList<String>  (driver.getWindowHandles());
		driver.switchTo().window(tab3.get(1));
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "http://www.pinterest.com/pleygo/");
		driver.close();
		driver.switchTo().window(tab3.get(0));
		Thread.sleep(2000);
	}
	
	public void TermPolicy_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("tpp"))).click();
		Thread.sleep(2000);
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://stage.pley.com/terms-and-conditions");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void YouTube_link() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("ye"))).click();
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>    (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://www.youtube.com/channel/UCojrLNLU9UrfxtJnI8XlrBA");
		driver.close();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
	}
}
