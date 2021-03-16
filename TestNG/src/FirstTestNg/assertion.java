package FirstTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
	
 String name="Kanith";
 boolean value=false;
 
 @Test
 public void checkEquals() {
	/* if(name.equals("Kanith")) {
		 System.out.println("name is equal");
		 }
	 else {
		 System.out.println("name is not equal");
		 }*/
	 Assert.assertFalse(value,"This should not be true");
 }
 
 
 
}
