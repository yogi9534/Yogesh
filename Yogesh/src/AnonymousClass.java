class A{
  public void display() {
	  System.out.println("inside class A display method....");
  }
}

interface B{
	void show();
}

public class AnonymousClass {
	public static void main(String[] args) {
        A obj = new A()
        		{
        	       public void display() {
        	    	   System.out.println("inside obj of class A which is now termed as Anonymous class...");
        	       }
        		};
        obj.display();
	
	  B obj1 = new B() 
	          {
		         public void show() {
		        	 System.out.println("inside interface B which is termed as Anyonymous class with Interface, we don't need to implements from any class...");
		         }
	          };
	  obj1.show();
	}
}


