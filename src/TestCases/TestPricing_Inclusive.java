package TestCases;



import org.testng.annotations.Test;

import core.Logout;
import core.PricingPage;
import core.TestCore;


public class TestPricing_Inclusive extends TestCore {
	
		@Test
		public void selectprice() throws InterruptedException{
			
			PricingPage pg = new PricingPage(driver);
			Logout lg = new Logout(driver);
			
			//Select Plan
			pg.selectPlan_Inclusive();
		
			//Choose Saving Plan
			pg.chooseSavings();
			
			//Create Account
			pg.createAccount();
			
			//Checkout
			pg.checkout();
			
			//Verify Signup
			pg.verifySignup();
			
			
			//Logout
			lg.do_logout();
		}
}
