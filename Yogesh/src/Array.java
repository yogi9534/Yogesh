class TestArray{	
	public void oneDArray() {
		int a[] = {2,4,5};
		System.out.println("1D Array> ");
		
		for(int i=0; i<3; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public void twoDArray() {
		System.out.println("2D Array>> ");
		double i[] = {2.4, 5.6, 7.8, 0.9};
		double j[] = {1.2, 5.64, 17.81};
		double k[] = {3.2};
		
		double l[][] = {i,j,k};
		
		for(int m=0; m<l.length; m++) {
			for(int n=0; n<l[m].length; n++) {	
				System.out.print(l[m][n]+ " ");
			}
			System.out.println();
		}
	}
}

public class Array {
	public static void main(String args[]) {
		TestArray arr = new TestArray();
		arr.oneDArray();
		arr.twoDArray();
	}
}


