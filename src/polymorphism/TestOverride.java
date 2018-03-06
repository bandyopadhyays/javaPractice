package polymorphism;

public class TestOverride {

	public static void main(String[] args) {
		
		ICICI objICCI = new ICICI();
		objICCI.interest();
		
		SBI objSBI = new SBI();
		objSBI.interest();
		
		SBILife objLife = new SBILife();
		objLife.interest();
		
		// multilevel override 
		BaseClass obj = new SBILife();
		obj.interest();

		// you are upcasting your object 
		SBI objSBI1 =  new SBILife();
		objSBI1.card(); //will call base class method
		objSBI1.credit(); // will call base class method. if SBI Live would have same method it would call the overriden method
		objSBI1.interest();
		
		

	}

}
