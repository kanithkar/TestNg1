package FirstTestNg;

import org.testng.annotations.Test;

public class Startcar {
	

	  
		@Test(priority=0)
		public void Turnonignition(){
		System.out.println("Turn on ignition");
		}
		@Test(priority=1)
		public void Legonclutch(){
			System.out.println("Leg on clutch");
			}
		@Test(priority=2)
		public void putfirstgear(){
			System.out.println("put first gear");
			}
		@Test(priority=3)
		public void releaseclutch (){
			System.out.println("release clutch");
			}
		@Test(priority=4)
		public void accelerate () {
			System.out.println("accelerate");
			}
}
		
	


