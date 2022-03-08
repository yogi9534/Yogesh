//Primitive keywords >> int, float, double, string, char etc.
/*Wrapper Class >> Integer [int]
                   String  [string]*/

class WrapAutoBoxing{
	public void wrap() {
		int num = 9; // Primitive Data Types
		@SuppressWarnings("removal")
		Integer p = new Integer(num);  // Boxing - Wrapping
		System.out.println("Boxing: "+ p);   
		
		int q = p.intValue(); // Unboxing - Unwrapping 
		System.out.println("Unboxing: "+ q);
		
		Integer r = num; // Autoboxing - Autowrapping
		System.out.println("Autoboxing: "+r );
		
		int s = r;   // AutoUnboxing - Autounwrapping
		System.out.println("AutoUnboxing: "+s);	
	}
	public int parsing() {
		String str = "342";
		int i = Integer.parseInt(str);
		return i;
	}
}
public class Wrapper_Autoboxing {
	public static void main(String[] args) {
		WrapAutoBoxing wrp = new WrapAutoBoxing();
		wrp.wrap();
		System.out.println("parsing: "+wrp.parsing());
	}

}
