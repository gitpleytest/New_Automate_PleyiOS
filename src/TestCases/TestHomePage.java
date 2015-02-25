package TestCases;



import org.testng.annotations.Test;

import core.HomePage;
import core.TestCore;

public class TestHomePage extends TestCore {
	
	@Test
	public void HomePage(){
		
		
		HomePage hm = new HomePage(driver); 
		
		//Verify that header name appears on the page
		hm.headername();
		
		//Verify that Login button appears
		hm.login();
		
		//Verify that Sign up button appears
		hm.signup();
		
	}

}
