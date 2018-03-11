package countSpecificDigitInNumber;

public class CountDigit { 
	
	public void count(double d) {
		
		String s = Double.valueOf(d).toString();
		System.out.println(s);
		String[] s1 = s.split("\\.");
		System.out.println(s1.length);
		String s2 = s1[0]+s1[1];
		Integer i = Integer.valueOf(s2);
		int count = 0;
		while(i>0) {
			int remender = i%10;
			if(remender == 2) {
				count ++;
			}
			i = i/10;
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		CountDigit obj = new CountDigit();
		obj.count(2522.22);
		obj.count(252222);
	}

}
