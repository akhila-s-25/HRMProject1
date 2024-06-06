package OrangeHRM_TestNG_POM.OrangeHRM_TestNG_POM.test_cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OrangeHRM_TestNG_POM.OrangeHRM_TestNG_POM.base.BaseClass;
import OrangeHRM_TestNG_POM.pages.AdminPage;
import OrangeHRM_TestNG_POM.pages.LoginPage;



public class AdminTest2 extends BaseTest {
	  
	  File propFile;
	  
	  FileInputStream fis;
	  
	  
	
	  Properties config2;
	
	
	  
//	@Test
//	public void setup() throws InterruptedException, IOException {
//	
//	
//		//BrowserURLLaunch("Chrome");
//	
//		   propFile=new File("configs//config2.properties");
//		   
//		   fis =new  FileInputStream(propFile);
//		   
//		   
//	       config2=new Properties();
//	       
//	       config2.load(fis);
//	       
//	       //BrowserURLLaunch(config2.getProperty("browser"));
//	       
//		//LoginPage loginApp =new LoginPage(driver);
//		
//		//loginApp.login("Admin","admin123");
//		
//		//loginApp.login(config2.getProperty("username"),config2.getProperty("password"));
		
// }	    
	
	
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
		
		admin.enterUserDetails(config2.getProperty("Viraaj Nandan"));
		
		Assert.assertTrue(true);
		
		
		
		
		
	}
	
	





}
