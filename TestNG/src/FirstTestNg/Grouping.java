package FirstTestNg;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"Apple"})
	public  void Apple1() {
		System.out.println("Apple1");
	}
	@Test(groups= {"Apple"})
	public  void Apple2() {
		System.out.println("Apple2");
	}
	@Test(groups= {"Moto"})
	public  void Moto1() {
		System.out.println("Moto1");
	}
	@Test(groups= {"Moto"})
	public  void Moto2() {
		System.out.println("Moto2");
	}
	@Test(groups= {"Oneplus"})
	public  void Oneplus1 () {
		System.out.println("Oneplus1");
	}
	@Test(groups= {"Oneplus"})
	public  void Oneplus2 () {
		System.out.println("Oneplus2");
	}
	@Test(groups= {"Iphone"})
	public  void Iphone1() {
		System.out.println("Iphone1");
	}
	@Test(groups= {"Iphone"})
	public  void Iphone2() {
		System.out.println("Iphone2");
	}

}
