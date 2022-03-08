class X{
	public void display() {
		System.out.println("display in X");
	}
	public void enter() {
		System.out.println("enter in X");
	}
}
class Y extends X{
	public void display() {
		System.out.println("display in Y");
	}
	public void enter() {
		super.enter();
		System.out.println("enter in Y");
	}
}
class Z extends X{
	public void display() {
		System.out.println("display in Z");
	}
}

public class DynamicMethodDisptach {

	public static void main(String args[]) {
        X obj = new Y(); // run time polymorphism
        obj.enter();
        
        obj = new Z(); // Dynamic method Dispatch
        obj.display();
        
        
	}
	
}
