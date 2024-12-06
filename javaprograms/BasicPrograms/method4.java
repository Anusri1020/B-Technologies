package BasicPrograms;

public class method4 {
 public static void main(String[]args) {
	 System.out.println("The factorial value is"+fact(8 ));
	 
 }
 public static int fact(int n)
 {
	 if(n==1) {
		 return 1;
	 }
	 else {
		 return n*fact(n-1);
	 }
 }
}
