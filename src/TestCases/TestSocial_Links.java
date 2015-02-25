package TestCases;

import org.testng.annotations.Test;

import core.Social_Link;
import core.TestCore;

public class TestSocial_Links extends TestCore {
	
	@Test
	public void Social_Links() throws InterruptedException{
		Social_Link sl = new Social_Link(driver);
		
		//Facebook Link
		sl.Facebook_link();
		
		//Tweeter Link
		sl.Tweeter_link();
		
		//Pinterest Link
		sl.Pinterest_link();
		
		//YouTube Link
		sl.YouTube_link();
		
	}

}
