package OrangeHRM_TestNG_POM.OrangeHRM_TestNG_POM.test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeHRM_TestNG_POM.pages.AdminPage;

public class AdminTest3 extends BaseTest {

	

	@Test(priority=1)
    public void VerifyURL() {
		
		
   	String ActualURL=   driver.getCurrentUrl();
   	   
   	  System.out.println(ActualURL);
   	 
    }


    @Test(priority=2)
    public void VerifyTitle() {
   	 
   	 String ActualTitle=   driver.getTitle();
   	 
   	 System.out.println(ActualTitle);
   	 
   	 
    }
    
    
    
    

	@Test(priority=3)
	public void verifyUserDetails() throws InterruptedException {
		
		AdminPage admin=new AdminPage(driver);
		Thread.sleep(3000);
		admin.clickAdmin();
		admin.clickAdd();
		
		//admin.enterUserDetails(config2.getProperty("Viraaj Nandan"));
		
		admin.enterUserDetails("Mahesh Babu");
		Assert.assertTrue(true);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
