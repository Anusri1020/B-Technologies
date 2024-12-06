package BasicPrograms;

class S{ 
	String course = "php";
}
class O extends S{
	 String course ="sQl";
	

	public void course_details() {
		System.out.println(super.course);
		System.out.println(course);

	}
}
public class superrclass {
	 public static void main(String[]args) {
		 O obj1=new O();
		 obj1.course_details();
	 }
}
	


