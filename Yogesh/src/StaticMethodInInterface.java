interface StaticMethodInterface{
	int i = 10;  //any variable inside interface is always final so, here, int i = 10 is equivalent to final int i = 10;
	void run();
	static void show() {   //static method in interface
		System.out.println("inside show");
	}
}
class ImplementInterface implements StaticMethodInterface{	
	public void run() {
		System.out.println("inside run");
	}
}

public class StaticMethodInInterface {
   public static void main(String args[]){
	 StaticMethodInterface.show();   //static show method can be called directly for interface  
   }
}
