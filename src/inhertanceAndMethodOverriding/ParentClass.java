package inhertanceAndMethodOverriding;

/**
 * 
 * Inheritance - Inheritance is one of the OOPs concept. through which we can acquire the properties from parent class.
 * 				 JAVA does support multiple inheritance but yes multilevel inheritance is supported by JAVA.
 * 
 * Method overriding - 
 * 						Process for runtime polymorphism 
 * 						Provide specific implementation of method that has been already provided by its supar class.
 * 						To override classes must be in IS-A relation (inheritance)
 * 						method must have same name as parent class.
 * 						method must have same argument as parent class.
 *						static method can not be overridden because they belongs to class rather object.
 */

public class ParentClass {
	
	public void print(String input) {
		System.out.println("Parent class method - " + input);
	}
	
	public static void prints(String input) {
		System.out.println("Parent class static method - " + input);
	}

	
}
