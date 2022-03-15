interface Pqrs {
	void myInterface();
}

class ABC implements Pqrs{
     public void myInterface(){
    	 System.out.println("inside ABC.. .methode definition...");
     }
}

public class Interface{
	public static void main(String args[]) {
		Pqrs intr = new ABC();
		intr.myInterface();
	}
}