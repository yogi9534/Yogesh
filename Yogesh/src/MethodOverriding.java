class FirstOverriding{
	public void write(){
		System.out.println("Write method...");
	}
	
    public void read(){
    	System.out.println("Read method...");
    }
}
class SecondOverriding extends FirstOverriding{
	@Override
	public void write(){
		System.out.println("2nd write method....");
	}
	
	@Override    //indicates the logical errors while overriding a method
	public void read(){
		System.out.println("2nd read method....");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
        SecondOverriding ovr2 = new SecondOverriding();
        //ovr2.write();
        ovr2.read();
        
	}

}

