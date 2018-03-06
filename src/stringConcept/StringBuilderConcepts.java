package stringConcept;

public class StringBuilderConcepts {
	
	/**
	 * STRING BUILDER IS USED TO CREATE MUTABLE STRING. MEANS VALUE CAN BE CHANGED.
	 */

	public static void main(String[] args) {
		// String Builder is mutable 
		StringBuilder s1 = new StringBuilder("souni");
		System.out.println("s1 before append:- "+s1);
		s1.append(" Banerjee");
		System.out.println("s1 after append:- "+s1);
		
	}
}
