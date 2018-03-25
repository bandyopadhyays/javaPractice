package stringConcept;

public class ImmutableString {
	
	/**
	 * string objects are immutable. Immutable simply means unmodifiable or unchangeable.
	 */

	public static void main(String[] args) {

		String s = "Souni";		// String object created 
		s.concat(" Banerjee");  // concat method will append the string at the end.
		System.out.println(s);  // this will print souni only as new string "souni banerjee" does not have any reference to point on this object
		
		String s3 = "souni banerjee";
		s3.trim();
		System.out.println(s3);
		
		String s1 = "Souni"; // no new object will be created. s and s1 will be pointing to same object.
		System.out.println(s1);
		
		String s2 = s1.concat(" banerjee"); // new object will e created 
		System.out.println(s2);
		
	}

}
