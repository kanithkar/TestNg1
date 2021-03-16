package FirstTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltesting {
   @Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kanithkar\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
   @Test
	public void openyahoo() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kanithkar\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.quit();
		
	}
}
