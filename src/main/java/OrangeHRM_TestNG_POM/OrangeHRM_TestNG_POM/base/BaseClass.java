package OrangeHRM_TestNG_POM.OrangeHRM_TestNG_POM.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public WebDriver driver;
	public File file;
	public FileInputStream fis;
	public Properties config;
	
	public  void BrowserURLLaunch(String BrowserName) throws IOException{
		 
			
		 file=new File("configs//config.properties");
		fis=new FileInputStream(file);
		config=new Properties();
		config.load(fis);
		 
			
			if(BrowserName.equals("Chrome")) {
				 
				WebDriverManager.chromedriver().setup();
	              driver=new ChromeDriver();
	              
	         	}
			else if(BrowserName.equals("Firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver =new FirefoxDriver();
			
			}else if(BrowserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver =new EdgeDriver();
			}
			
			 System.out.println("Base class");

			driver.manage().window().maximize();
			
			//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.get(config.getProperty("url"));
			//return driver;

			   System.out.println("git branch demo 5");
	 }
	
}
