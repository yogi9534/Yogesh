
public class This {
	
	int num1;  // instance variables
	int num2;
	
	public This(int num1, int num2) {    //local variables 
		this.num1 = num1;
		this.num2 = num2;
	}
         

public static void main(String args[]) {
	This t = new This(6,7);
	System.out.println("This keyword! " + t.num1);
}

}
