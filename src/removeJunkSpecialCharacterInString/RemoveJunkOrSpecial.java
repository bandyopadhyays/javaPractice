package removeJunkSpecialCharacterInString;

public class RemoveJunkOrSpecial {
	
	public void remove(String input) {
		input = input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(input);
	}
	public static void main(String[] args) {
		RemoveJunkOrSpecial obj = new RemoveJunkOrSpecial();
		obj.remove("@@@@souniSOUNI######");
	}

}
