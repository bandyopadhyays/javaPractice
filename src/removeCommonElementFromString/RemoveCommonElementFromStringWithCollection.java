package removeCommonElementFromString;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveCommonElementFromStringWithCollection {
	
	public static void main(String[] args) {
		String input = "ssoouunnii";
		char[] ch = input.toCharArray();
		Set<Character> s = new LinkedHashSet<Character>();
		for(int i = 0; i< ch.length; i++) {
			s.add(ch[i]);
		}
		
		String op = "";
		Iterator<Character> it = s.iterator();
		while(it.hasNext()) {
			op = op + it.next();
		}
		
		System.out.println(op);
	}

}
