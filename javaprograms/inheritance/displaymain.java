package inheritance;
class A{
	public void display1() {
		System.out.println("it is  method A");
	}
}
class B extends A{
	public void display2() {
		System.out.println("it is  method B");
	}
}
class C extends A{
	public void display3() {
		System.out.println("it is  method C");
	}
}
class D extends A{
	public void display4() {
		System.out.println("it is  method D");
	}
}
public class displaymain {
	public static void main(String[]args) {
		System.out.println("Welcome Display.....");
		A a1=new A();
		B b1=new B();
		C c1=new C();
		D d1=new D();
		a1.display1();
		b1.display2();
		c1.display3();
		d1.display4();
		System.out.println("Bye Display......");
	}
}
