// final can be used with variables, methods and class
/*
 * final variable - makes variable as CONSTANT
 * final method - makes method as final which can't be overriden by any other class
 * final class - can't be inherited by any sub class
 */

class Check{ 
	//final int VAL = 11; //Constant  - Final value can't be changed further
	/*
	 * public Check() {
	 *    VAL = 10; 
	 *    System.out.println("value: "+VAL); }
	 */
	public void display() {
		final int VAL = 20; // use of final with variable 
		System.out.println("Inside Check display()..."+ VAL);
	}
	/*public final void show() {  // >> final method
		System.out.println("Inside Check show()!!!");
	}*/
	public void show() {
		System.out.println("Inside Check show()!!!");
	}
}
class Validate extends Check{
	public void display() {
		System.out.println("Inside Validate display()...");
	}
	public void show() {  //Can't override Check class - show() final method :: use of final method
		System.out.println("Inside Validate show()!!!");
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
		Check c = new Check();
	    //c = new Validate();
		//c.display();
		c.show(); 
	}
}
