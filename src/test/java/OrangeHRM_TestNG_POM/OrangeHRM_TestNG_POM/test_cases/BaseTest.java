package OrangeHRM_TestNG_POM.OrangeHRM_TestNG_POM.test_cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import OrangeHRM_TestNG_POM.OrangeHRM_TestNG_POM.base.BaseClass;
import OrangeHRM_TestNG_POM.pages.LoginPage;

public class BaseTest extends BaseClass{

	//BaseClass BC;
	
	//WebDriver driver;
	
	
	LoginPage LP;
	
	
	
	@BeforeTest
	public void SetUp() throws InterruptedException, IOException {
		
//		BC =new BaseClass();
//		
//		BC.BrowserURLLaunch("Chrome");
		
	BrowserURLLaunch("Chrome");
		//Browse
		
		LP =new LoginPage(driver);
		
		LP.login("Admin","admin123");
		
		
	}
	
	
	
	@AfterTest
	public void teardown() throws InterruptedException {
		
		      Thread.sleep(2000);
		     driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
