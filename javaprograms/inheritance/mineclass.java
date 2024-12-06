package inheritance;

class vechile{
	public void type_of_vechile() {
		System.out.println("type of vechile on theree ");
	}
}
class car extends vechile{
	public void drive() {
		System.out.println("car can drive they road");
	}
}

public class mineclass {
	public static void main(String[]args) {
		System.out.println("Welcome Vechile.......");
		vechile v=new vechile();
		v.type_of_vechile();
		car c=new car();
		c.drive();
		System.out.println("Bye Bye......");
		
	}

}
