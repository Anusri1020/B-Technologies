package BasicPrograms;

class M {
	public void eat() {
		System.out.println("000000");
		this.drink();
		this.go();
		this.come();
	}
    public void drink() {
		System.out.println("11111");

	}
    public void go() {
		System.out.println("222222");

	}
    public void come() {
		System.out.println("3333333");
	}	
}

public class ishtthis {
	public static void main(String[]args) {
		M obj=new M();
		obj.eat(); 

	}
}



///this is this method[this() or this.]