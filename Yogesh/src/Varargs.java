class VariableLengthArrays{
	public void multiple(int ...m) {  // Variable length of arrays
		int mlt = 1;
		
		for(int n: m) {
			mlt = mlt*n;
		}
		System.out.println(mlt);	
		
	}
}

public class Varargs {
	
	public static void main(String args[]) {
	 VariableLengthArrays varargs = new VariableLengthArrays();
	 varargs.multiple(2,3,4);
	}

}
