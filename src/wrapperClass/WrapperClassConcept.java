package wrapperClass;

/**
 * Wrapper class are used to convert any primitive data type to object(non primitive)
 * Primitive Data type - has no special capability which are predefined. like int, char etc..
 * 						 primitive data type are not object they don't belongs to any class they defined in language itself 
 * Non primitive - object type. like string  
 * 
 * Why we need wrapper class? 
 * -- Data structure/collections need object to manipulate data so we need to convert primitive to object.
 * -- Co relation or conversion to one data type to another data type can only be achieve through wrapper class or type casting.
 * 
 * boxing - converting primitive to object type
 * unboxing - converting object type to primitive
 * this is done automatically
 * 
 * Internally JVN convert every primitive to object. even we say int i = 10; JVM will convert Integer.valueOf(10)
 * 
 */


public class WrapperClassConcept {

	public static void main(String[] args) {
		boolean dataBoolean; // wrapper class - Boolean
		int dataInt; // wrapper class - Integer
		double dataDouble; // wrapper class - Double
		char dataChar; // wrapper class - Character
		short dataShort; // wrapper class - Short
		long dataLong; // wrapper class - Long
		float dataFloot; // wrapper class - Float
		byte dataByte; // wrapper class - Byte
		
		// below is the example for type casting.
		// output will be blank.
		dataInt = 10;
		dataChar = (char) dataInt;
		System.out.println(dataChar);
		
		// wrapper class example
		// use valueOf method
		Integer in = new Integer(12);
		System.out.println(in);
		//or
		Integer in1 = Integer.valueOf(dataInt);
		System.out.println(dataInt);
		
		
		
	}
}
