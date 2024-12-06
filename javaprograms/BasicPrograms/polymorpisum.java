package BasicPrograms;
class compiletime{
	public void A() {
		System.out.println("noo");
	}
    public void A(int a, int b) {
		System.out.println("yes");

	}
    public void A(float x) {
		System.out.println("come");

}
}

public class polymorpisum {
	public static void main(String[]args) {
		compiletime a1=new compiletime();
		a1.A();
		a1.A(12,36);
		a1.A(12.3f);
		
		
	}

}
