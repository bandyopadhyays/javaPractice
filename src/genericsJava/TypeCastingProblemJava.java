package genericsJava;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Array is always type safe. it always give guaranty for the type of element
 * present is the array. where as collection is not type safe. if you forget to
 * mention the type there is no guaranty for type of elements.
 * 
 * To use collection always specify the type i.e. use generics.
 *
 */

public class TypeCastingProblemJava {

	public static void main(String[] args) {
		// without generics
		List l = new ArrayList();
		l.add("String1");
		l.add("String2");
		l.add(2);
		// without generics type casting is needed
		String s1 = (String) l.get(0);
		String s2 = (String) l.get(1);
		//String s3 = (String) l.get(2);	//  java.lang.ClassCastException -> runtime exception
		//System.out.println(s1 + s2 +s3);
		
		List<String> l1 = new ArrayList<>();
		l1.add("String1");
		l1.add("String2");
		//l1.add(2); 						// can not add integer

		// No Type casting required if you use generics
		String s3 = l1.get(0);
		String s4 = l1.get(1);
		
		System.out.println(s3 + " " + s4);
	}
}
