interface FirstInt{
	default void display() {
		System.out.println("inside FirstInt display()...");
	}
}

interface SecondInt{
	default void display() {
		System.out.println("inside SecondInt display()...");
	}
}

class Implementor implements FirstInt, SecondInt{
	@Override
	public  void display() {
		//System.out.println("inside Implementor Class display()...");
		FirstInt.super.display();  //super keyword used for calling particular method of interface
		SecondInt.super.display();
	}
}
public class MultipleInteritenceIssueWithInterface {
	
	public static void main(String args[]) {
		FirstInt fint = new Implementor();
		fint.display();	
	}

}
