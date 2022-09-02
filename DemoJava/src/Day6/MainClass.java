package Day6;

import java.util.Set;

public class MainClass {
	
	public static Set<String> carsofIndia;
	public static Set<String> carsOfJapanese;
	
	public static void main(String[] args) {
		input();
		subset();
		display();
		intersection();
		display();
		remove();
		display();
		union();
		display();
		
		
	}
	
	 static void input() {
		Cars carsObj=new Cars();
		carsofIndia=carsObj.getCarsOfIndia();
		carsOfJapanese=carsObj.getCarsOfJapanese();
	}
	 public static void union() {
		 System.out.println("AddAll---"+carsofIndia.addAll(carsOfJapanese));
			
		}
		public static void intersection() {
			System.out.println("retainAll---"+carsofIndia.retainAll(carsOfJapanese));
			
		}
		public static void subset() {
			System.out.println("containsAll---"+carsofIndia.containsAll(carsOfJapanese));
				
		}
		public static void remove() {
			System.out.println("removeAll---"+carsofIndia.removeAll(carsOfJapanese));
			
		}
		public static void display() {
			System.out.println("CarsOFIndia---"+carsofIndia);
			System.out.println("CarsOFJapanese---"+carsOfJapanese);
		}
	
}
