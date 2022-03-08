public class StaticAndClassLoader {
	
	static int i = 1 ;
	static String name;
	static String sirName;
	int value = 5;
	 
	static {                       //static block 
		sirName = "Singh";  //memory created while class loading
	} 

	public static void main(String args[]) {
		
		//static String name = "Singh";
		
		StaticAndClassLoader s = new StaticAndClassLoader();  //object created and heap memory created
		
		i = 2;
	    
		name = "Yogesh";
		
		//sirName = "Singhhh!";
	    
		System.out.println("static block: "+ i+ " "+  name);
		System.out.println(s.value);
		System.out.println("sir Name: "+ sirName);
		
	}
}

// Class first load then object is created 


