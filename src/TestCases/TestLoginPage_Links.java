package TestCases;

import org.testng.annotations.Test;

import core.LoginPage;
import core.LoginPage_Links;
import core.Logout;
import core.TestCore;

public class TestLoginPage_Links extends TestCore {
	
	@Test
	public void loginPage_links() throws InterruptedException{
		LoginPage_Links pl = new LoginPage_Links(driver);
		LoginPage lg = new LoginPage(driver);
		Logout l = new Logout(driver);
		
		
		//Login
		pl.login();
		
		//Verify signup link
		pl.testSignupLink();
		
		//verify forget password
		pl.testForgetPassword();
		
		//Login into application
		lg.login();
		
		//My Account
		pl.MyAccount_link();
		
		//Manage Account
		pl.ManageAccount_link();
		
		//My pleyList
		pl.MyPleyList_link();
		
		//Manage Pley
		pl.ManagePley_link();
		
		//Manage Gallery
		pl.ManageGallery_link();
		
		//Account
		pl.Account_link();
		
		//Invite - Get $ 10
		pl.InviteGet_link();
		
		//Invite
		pl.Invite_link();
		
		//Gift
		pl.Gift_link();
		
		//Trade In
		pl.TradeIn_link();
		
		//About Us
		pl.AboutUs_link();
		
		//Gallery
		pl.Gallery_link();
		
		//Partner
		pl.Partner_link();
		
		//Blog
		pl.Blog_link();
		
		//Press
		pl.Press_link();
		
		//Contact Us
		pl.ContactUs_link();
		
		//Facebook
		pl.Facebook_link();
		
		//Tweeter
		pl.Tweeter_link();
	
		//Pinterest
		pl.Pinterest_link();
		
		//Term & Privacy Policy
		pl.TermPolicy_link();
		
		//YouTube
		pl.YouTube_link();
		
		//Logout
		l.do_logout();
	}

}
