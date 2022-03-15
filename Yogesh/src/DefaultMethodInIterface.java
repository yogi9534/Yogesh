@FuncationalInterface
interface Pqr{
	void clear(); // Abstract method - equivalent to public abstract void clear();
	default void render() { // default method can be define inside interface used in java 1.8
		System.out.println("render() method definition inside interface..");
	}
	
}

class Xyz implements Pqr{
	public void clear() {
		System.out.println("clear() definition...");
	}
	public void render() {
		System.out.println("render() methode overrider here...");
	}
}

public class DefaultMethodInIterface {

	public static void main(String args[]) {	
		Pqr obj = new Xyz();
		obj.clear();
		obj.render();
	}
}
