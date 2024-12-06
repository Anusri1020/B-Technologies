package BasicPrograms;

class Animal {
	public void walk() {
		System.out.println("Animal is walking they forest");
	}
}
class Bird extends Animal{
	public void fly() {
		System.out.println("Bird is flying they skyyy");
	}
}

public class singleInheritance {
	public static void main(String[]args) {
		Bird  obj=new Bird();
		 obj.walk();
		obj.fly();
		
	}

}
