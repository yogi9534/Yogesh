class P{       // P >> super class
	public P() {  
		System.out.println("Default P constructor");
	}
	public P(int p) {
		System.out.println("Parameterized P constructor");
	}
}
class Q extends P{   // Q >> sub class
	public Q() {
		super(5); // parameterized super method  >> this calls the parameterized constructor of super class P
		System.out.println("Default Q constructor");
	}
	public Q(int q) {
		super(11); 
		System.out.println("Parameterized Q constructor");
	}
	public void show(int l) {
		int i = 10;
		System.out.println("Inside show: "+ l +" "+ i);
	}
}

public class Super {

	public static void main(String[] args) {
		Q q = new Q(9);
		q.show(11);
	}

}
