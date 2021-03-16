package FirstTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class testsuite {
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchbrowser() {
	startTime=System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kanithkar\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	
	
	/*@Test
	public void opengoogle() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kanithkar\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		
		long totaltime=endTime-startTime;
		System.out.println("Total time taken"+totaltime );
		
	}
		
		@Test
		public void openfacebook() {
			long startTime=System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kanithkar\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.quit();
			long endTime=System.currentTimeMillis();
			
			long totaltime=endTime-startTime;
			System.out.println("Total time taken"+totaltime);
		}
			
			@Test
			public void openamazon() {
				long startTime=System.currentTimeMillis();
				System.setProperty("webdriver.chrome.driver","C:\\Users\\kanithkar\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.com");
				driver.quit();
				long endTime=System.currentTimeMillis();
				
				long totaltime=endTime-startTime;
				System.out.println("Total time taken"+totaltime );
			*/		
	@Test
	public void opengoogle() {
	driver.get("https://www.google.com");
	}
	
	@Test
	public void openamazon() {
	driver.get("https://www.amazon.com");
	}
	
	@Test
	public void openflipkart() {
	driver.get("https://www.flipkart.com");
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.close();
		 endTime=System.currentTimeMillis();
		long totaltime=endTime-startTime;
		System.out.println("Total time taken"+totaltime );
		
	}
		
		
	}


