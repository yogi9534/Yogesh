interface Abcd {
	void myInterface();
}

class PQR implements Abcd{
     public void myInterface(){
    	 System.out.println("inside ABC.. .methode definition...");
     }
}

public class Interface{
	public static void main(String args[]) {
		Abcd intr = new PQR();
		intr.myInterface();
	}
}