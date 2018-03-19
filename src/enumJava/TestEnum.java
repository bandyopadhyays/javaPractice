package enumJava;

import java.util.Scanner;

public class TestEnum {
	
	/**
	 * 
	 * remember enum can have main method
	 * 
	 */
	
	
	public static void main(String[] args) {
		System.out.println("Please enter a direction...");
		Scanner input = new Scanner(System.in);
		String in = input.next();
		DirectionEnum1 objEnum = DirectionEnum1.valueOf(in);
		
		switch (objEnum) {
			case north:
				System.out.println("Go to North ->");
				break;
			case south:
				System.out.println("So to south ->");
				break;
			case east:
				System.out.println("Go to East ->");
				break;
			case west:
				System.out.println("Go to West ->");
				break;
			default:
				System.out.println("Stay in central ");
				break;
		}
		
		objEnum.print();
		
		System.out.println(DirectionEnum1.south);
		
		System.out.println("---------------------------------");
		
		for(Apple a : Apple.values()) {
			System.out.println(a + " " + a.getPrice());
		}
	}

}
