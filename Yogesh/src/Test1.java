class CheckTest{
	public void run() {
		System.out.println("inside run()...");
	}
	public void test() {
		System.out.println("inside test()...");
	}
}

public class Test1 {

	public static void main(String[] args) {
		CheckTest c = new CheckTest();
	    c.test();
		//c.run();
		

	}

}
