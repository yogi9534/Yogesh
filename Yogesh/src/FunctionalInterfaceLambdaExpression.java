/* Types of Interface - 3 types 
 * 1. Normal - Interface having more than one methods 
 * 2. Single Abstract method(SAM) - having only one method - called as Functional interface - using with Lambda Expression
 * 3. Marker Interface - having no method 
 * 
 * Note: Lambda expression only works for Functional Interface
 */

interface Abcde{
	void funcationalInterface();
}
public class FunctionalInterfaceLambdaExpression {

	public static void main(String[] args) {
		
		Abcde obj = () -> System.out.println("Inside funcational Interface..."); // Lambda expression  : () -> defines interface method 
		
		obj.funcationalInterface();

	}

}


