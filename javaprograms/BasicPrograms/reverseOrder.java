package BasicPrograms;
import java.util.Scanner;
public class reverseOrder {
	public static void main(String[]args) {
		int n,a,s=0;
		Scanner scn=new Scanner(System.in);		
		System.out.println("Enter any reverse number");
		n=scn.nextInt();
		while(n!=0) {
			a=n%10;
			s=s*10+a;
			n=n/10;
		}
		System.out.println("reverse order or there"+s);
	}

}
