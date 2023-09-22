package interface1;

public class Jaya11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jaya myObj = new Jaya();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	}

}
interface x1 {
	  public void myMethod(); // interface method
	}

	interface x2 {
	  public void myOtherMethod(); // interface method
	}

	class Jaya implements x1, x2 {
	  public void myMethod() {
	    System.out.println("Hello");
	  }
	  public void myOtherMethod() {
	    System.out.println("people");
	  }
	}