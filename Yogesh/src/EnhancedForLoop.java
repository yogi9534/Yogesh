class ForEachLoop{
	public void forEachLoop() {
		
		System.out.println("2D Array>> ");
		System.out.println();
		double i[] = {2.4, 5.6, 7.8, 0.9};
		double j[] = {1.2, 5.64, 17.81};
		double k[] = {3.2};
		
		double l[][] = {i,j,k};
		
		for(double m[]: l) {
			for(double n: m) {
			  System.out.print(n+ " ");
			}
			System.out.println();
		}
	}
}

public class EnhancedForLoop {
	
	public static void main(String[] args) {
		ForEachLoop f = new ForEachLoop();
		f.forEachLoop();
	}
}
