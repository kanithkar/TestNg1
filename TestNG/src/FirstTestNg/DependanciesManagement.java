package FirstTestNg;

import org.testng.annotations.Test;

public class DependanciesManagement {
		

		    
			@Test(enabled=true)
			public void Turnonignition(){
			System.out.println("start");
			}
			@Test(dependsOnMethods="Turnonignition")
			public void Legonclutch(){
				System.out.println("press");
			}
			@Test(dependsOnMethods="Legonclutch")
			public void Putfirstgear(){
				System.out.println("first");
				}

}
