public class Pattern {
	 public static void main(String args[]) {
		 
		 Pattern p1 = new Pattern();
		 //p1.pattern1();
		 //p1.pattern2();
		 //p1.pattern3();
		 //p1.pattern4();
		 //p1.pattern5();
		 p1.pattern6();
	 }
	 public void pattern1() {
		 System.out.println("Pattern1: ");
		 for(int i=1; i<=6; i++){
				for(int j = 6; j >= i; j--) {
					System.out.print(j + " ");					
				}
				System.out.println();	
		 }
		 System.out.println("------------------");
		 }
	 
	 public void pattern2() {
		 System.out.println("Pattern2: ");
		 for(int i=6; i>=1; i--){
				for(int j = 6; j>= i; j--) {
					System.out.print(j + " ");					
				}
				System.out.println();	
		 }
		 System.out.println("------------------");
		 }
	 
	 public void pattern3() {
		 System.out.println("Pattern3: ");
		 for(int i=65; i<=68; i++){
				for(int j = 65; j<= i; j++) {
					System.out.print((char)j + " ");					
				}
				System.out.println();	
		 }
		 System.out.println("------------------");
		 }
	 
	 public void pattern4() {
		 System.out.println("Pattern4: ");
		 for(int i=68; i>=65; i--){
				for(int j=65; j<= i; j++) {
					System.out.print((char)j + " ");					
				}
				System.out.println();	
		 }
		 System.out.println("------------------");
		 }
	 
	 public void pattern5() {
		 System.out.println("Pattern5: ");
		 for(int i=65; i<=68; i++){
				for(int j=68; j>= i; j--) {
					System.out.print((char)j + " ");					
				}
				System.out.println();	
		 }
		 System.out.println("------------------");
		 }
	 
	 public void pattern6() {
		 System.out.println("Pattern6: ");
		 for(int i=1; i<=4; i++){
				for(int j=1; j<=4; j++) {
					if((i==1 || i==4) || (j==1 || j==4 ))
						System.out.print("$ ");
					else	
               		System.out.print("  ");					
				}
				System.out.println();	
		 }
		 //System.out.println("------------------");
		 }
}


