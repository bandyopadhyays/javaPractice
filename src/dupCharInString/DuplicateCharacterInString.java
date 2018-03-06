package dupCharInString;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInString {

	public void getDuplictaeValueFromString(String input) {
		char[] c = input.toCharArray();
		HashMap<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			if (m.containsKey(c[i])) {
				m.put(c[i], m.get(c[i]) + 1);
			} else {
				m.put(c[i], 1);
			}
		}
		
		Set<Character> s = m.keySet();
		for(Character ch : s){
			if(m.get(ch)>1){
				System.out.println(ch+" occurs ---> "+m.get(ch)+" time(s)");
			}
		}
	}

	public static void main(String[] args) {
		String str = "aahdsksfbksdbfdsdfw";
		DuplicateCharacterInString obj = new DuplicateCharacterInString();
		obj.getDuplictaeValueFromString(str);
	}
}
