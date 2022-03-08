abstract class TestAbstract{   // abstract class should having "abstract" keyword
	 public abstract void check(); // method can be abstract if class is abstract but if method is abstract class should be abstract
	 public void validate() {
		 
	 }
}
class SubTestAbstract extends TestAbstract{
	public void check() { // abstract method of super class should be defined in sub class 
		System.out.println("inside check method()...");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
        TestAbstract abs = new SubTestAbstract();
        abs.check();
	}
}
