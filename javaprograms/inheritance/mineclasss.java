package inheritance;

class add{
	public void addition() {
		System.out.println("process is addition="+(22+3));
	}
}
class sub extends add{
	public void subtraction() {
		System.out.println("process is  subtraction="+(22-3));
	}
}
class mul extends sub{
	public void Multiplication() {
		System.out.println("process is Multiplication ="+(22*3));
	}
}
class div extends mul{
	public void divition() {
		System.out.println("process is divition="+(22%3));
	}
}

public class mineclasss {
	public static void main(String[]args) {
		System.out.println("Welcomee......");
		div d=new div();
		d.addition();
		d.subtraction();
		d.Multiplication();
		d.divition();

	/*	add a=new add();
		a.addition();
		sub s=new sub();
		s.subtraction();
		mul m=new mul();
		m.Multiplication();
		div d=new div();
		d.divition();*/
		System.out.println("byee......");

		
		
	}

}
