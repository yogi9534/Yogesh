//Encapsulation >> Binding data with methods

class Encaps{
	private int eid =  20; // make variables as private
	private String ename;
	
	// getters and setters
	public int getEid() {  // but methods can be public so any one can access method but can't edit data
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Encaps e = new Encaps();
	    e.setEid(30);
	    e.setEname("Yogesh");
		System.out.println("Emp id = "+ e.getEid());
		System.out.println("Emp Name = "+ e.getEname());
	}
}
