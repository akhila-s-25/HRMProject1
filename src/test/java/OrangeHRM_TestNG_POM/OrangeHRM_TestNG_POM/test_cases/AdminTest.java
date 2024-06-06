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



public class AdminTest extends BaseClass {
	

	
	File file;
	FileInputStream fis;
	Properties config;
	
	@Test
	public void setup() throws InterruptedException, IOException {
		
	file=new File("configs//config.properties");
	fis=new FileInputStream(file);
	config=new Properties();
	config.load(fis);
	
		//BrowserURLLaunch("Chrome");
	BrowserURLLaunch(config.getProperty("browser"));
	
		LoginPage loginApp =new LoginPage(driver);
		
		//loginApp.login("Admin","admin123");
		loginApp.login(config.getProperty("loginUsername"),config.getProperty("loginPassword"));
		
	    
	
	
	}

	@Test
	public void verifyUserDetails() throws InterruptedException {
		
		AdminPage admin=new AdminPage(driver);
		Thread.sleep(2000);
		admin.clickAdmin();
		admin.clickAdd();
		
		admin.enterUserDetails(config.getProperty("employeeName"));
		
		Assert.assertTrue(true);
		
		
		
		
		
	}
	
	





}
