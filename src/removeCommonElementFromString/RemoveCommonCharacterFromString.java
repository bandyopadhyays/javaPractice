package removeCommonElementFromString;

public class RemoveCommonCharacterFromString {

	public void remove(String input) {
		char[] ch = input.toCharArray();
		int len = ch.length;
		String op = "";
		for (int i = 0; i < len; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (ch[i] == ch[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				op = op + ch[i];
			}
		}
		System.out.println("out put = " + op);
	}

	public static void main(String[] args) {
		RemoveCommonCharacterFromString obj = new RemoveCommonCharacterFromString();
		String in = "ababdkbliudfwaahkjhsbakdaljjnsladnldnnssnshn";
		System.out.println("input = " + in);
		obj.remove(in);
	}

}
