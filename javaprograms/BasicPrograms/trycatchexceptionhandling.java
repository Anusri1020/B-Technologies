package BasicPrograms;

public class trycatchexceptionhandling {
	public static void main(String[]args) {
		int a=10;int b=20;
		try {
			System.out.println(b/0);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Thank you");

	}

}
//this program is uses of try catch.purpose is try is error part,catch is correct part but using exception handling.