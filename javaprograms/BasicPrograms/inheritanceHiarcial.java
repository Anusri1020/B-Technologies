package BasicPrograms;
class shape{
	public void shape_details() {
		System.out.println("shape or there");
	}
}
class method extends shape{
	public void display() {
		System.out.println("displayy they methodd..");
	} 
}

class Rectangle extends shape {
	   public void rec_details() {
		   System.out.println("rectangle is shapee");
	   }
   }
class cube extends shape {
	   public void cub_details() {
		   System.out.println("circle is shapee");
	   }
}
public class inheritanceHiarcial {
	public static void main(String[]args) {
		  method m=new method();
		  m.display();
		  cube c=new cube();
		  c.cub_details();
		  Rectangle r=new Rectangle();
		  r.rec_details();
	}

}
