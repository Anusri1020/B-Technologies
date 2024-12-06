package BasicPrograms;
import java.util.Scanner;
public class methodVote2 {
	public static void main(String[]args) {
		int age;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter they valuee....");
		age=scn.nextInt();
		eligible(age);
		
	}
	public static void eligible(int age) {
		if(age>18) {
			System.out.println("eligible for vote");
		}
		else {
			System.out.println("not eligible for vote");
		}
	}

}
