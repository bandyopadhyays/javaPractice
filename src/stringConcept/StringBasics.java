package stringConcept;

public class StringBasics {
	
	/**
	 * String - is basically a object which represent sequence of character.
	 * how to create string?
	 * Type 1 - with string literal. 
	 * 			String s1 = "string" --> this will create a string object in String constant pool (this is a memory area in heap)
	 * 			String s2 = "string" --> first it will search in string constant pool if object exist with same value,
	 * 									 if string object already exist it will return reference to same instance.
	 * 			purpose --> memory management. 
	 * Type 2 - with new keyword.
	 * 			String s2 = new String("String") --> it will create new object every time just like regular object creation. 
	 */

	public static void main(String[] args) {
		char[] c = {'s','t','r','i','n','g'};
		String s1 = new String(c); // will create new object
		String s2 = new String("string"); // will create new object
		String s3 = new String("string"); // will create new object
		
		String s4 = "string"; // will create new object
		String s5 = "string"; // will not create new object reference of s4 will be returned 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		/**
		 * below code will verify reference will point to same object or not.
		 * == returns true only if both references points to same object
		 * equals() evaluates to the comparison of values in the objects.   
		 */
		
		if(s4 == s5) {
			System.out.println("s4 and s5 are same object");
		} else {
			System.out.println("s4 and s5 are not same object");
		}
		
		if(s2 == s3) {
			System.out.println("s2 and s3 are same object");
		} else {
			System.out.println("s2 and s3 are not same object");
		}
		
		if(s1.equals(s5)) {
			System.out.println("s1 and s5 have same value");
		} else {
			System.out.println("s1 and s5 dont have same value");
		}
		
		
		
		
	}
}
