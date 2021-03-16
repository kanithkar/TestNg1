package FirstTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void test() {
	  System.out.println("test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("B method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("A method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("B class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("A class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println( " Btest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" A test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("B suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("A suite");
  }

}
