package countNoOfVowelInString;

import java.util.HashMap;

public class CountVowelInString {

	public boolean isVowel(char c) {
		if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i'
				|| Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public void printVowelCount(String line) {
		char[] c = line.toCharArray();
		HashMap<Character, Integer> m = new HashMap<>();
		int size = c.length;
		for (int i = 0; i < size; i++) {
			if (m.containsKey(c[i])) {
				m.put(c[i], m.get(c[i]) + 1);
			} else {
				m.put(c[i], 1);
			}
		}

		for (char ch : m.keySet()) {
			if (isVowel(ch)) {
				System.out.println(ch + " occurs " + m.get(ch) + " time(s)");
			}
		}
	}

	public static void main(String[] args) {
		CountVowelInString obj = new CountVowelInString();
		obj.printVowelCount("aaabadbddakdhkeeaaiiaoioajbgvjAAAAAavaajuabavahuaababakbkauhajaauuaaaooeeeeeeeeeeeeee");
	}
}
