package TestCases;

import org.testng.annotations.Test;

import core.HomePage_Links;
import core.TestCore;

public class TestHomePage_Links extends TestCore {

	@Test
	public void HomePage_Links() throws InterruptedException
	{
	HomePage_Links hl = new HomePage_Links(driver);
	
	//Verify that "Pley" logo link is working
	hl.verifyPleyLogo();
	
	//Verify that "View Sets" link is working
	hl.viewSets();
	
	//Verify that "How it Works" link is working
	hl.howItWorks();
	
	//Verify that "Gift" link is working
	hl.gift();
	
	//Verify that "Login" link is working
	hl.login();
	
	//Verify that "Signup" link is working
	hl.signup();
	
	//Verify that all the 7 Footer Links are working
	hl.footerLinks();
	}
}
