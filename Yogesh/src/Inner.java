class Outer{
	int i = 1;
	public void show() {
		System.out.println("Outer class method, member method!");
	}
	
	class Outer$Inner{
	    public void inner() {
			System.out.println("Inside Inner Class!");

		}
	}
}

public class Inner {

	public static void main(String args[]) {
		
		Outer out = new Outer();
		System.out.println("i = "+ out.i);
		out.show();
		
		Outer.Outer$Inner inn = out.new Outer$Inner();  // Outer.Outer$Inner class :  out.new Outer$Inner() --> inner object 
		inn.inner();
		
		
	}
	
	
}
