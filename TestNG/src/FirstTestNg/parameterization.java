package FirstTestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//parameterization  is used  when the input is given from TestNg 
public class parameterization {
	
	@Test
	@Parameters("Name")
	
	public void inputname(String name) {
		System.out.println("Name is "+name);
	}
	

}
