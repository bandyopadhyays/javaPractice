package stringPalindromeAndReverse;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String input) {
		String rev = "";
		char[] ch = input.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			rev = rev + ch[ch.length -1 -i];
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println("input string: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("reverse op is - ");
		System.out.println(reverse(sc.next()));
	}

}
