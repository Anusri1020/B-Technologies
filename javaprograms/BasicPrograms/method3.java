package BasicPrograms;

import java.util.Scanner;

public class method3 {
	public static void main(String[]args) {
		int x,y;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the valueee....");
		x=scn.nextInt();
		y=scn.nextInt();
		mymethod(x,y);
		
	}
	public static void mymethod(int a,int b) {
		System.out.println(a+b*10);
	}

}
