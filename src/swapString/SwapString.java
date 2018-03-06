package swapString;

public class SwapString {	
	
	public void swap(String s1, String s2) {
		System.out.println("Before swapping first string:- "+s1);
		System.out.println("Before swapping second string:- "+s2);
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping first string:- "+s1);
		System.out.println("After swapping second string:- "+s2);
	}
	
	public static void main(String[] args) {
		String s1 = "souni";
		String s2 = "banerjee";
		SwapString obj = new SwapString();
		obj.swap(s1, s2);
	}

}
