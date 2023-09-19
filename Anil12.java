package startproject;
interface calculator{
	void add();
	void sub();
}

interface calcutator2{
	void mul();
	void div();
}
class mYCalculator implements calculator,calcutator2
{
	public void add() {
		System.out.println("inside add ");
	}
	public void sub() {
		System.out.println("inside sub");
		
	}
	public void mul() {
		System.out.println("inside sub");
		
	}
	public void div() {
		System.out.println("inside sub");
		
	}
	
	

	
}




public class Anil12 {

	public static void main(String[] args) {
		mYCalculator mc = new mYCalculator();
		
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
		
	}

}
