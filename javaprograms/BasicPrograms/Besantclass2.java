package BasicPrograms;
import java.util.Scanner;
public class Besantclass2 {
	public static void main(String[]args) {
		int Tamil;
		int English;
		int Maths;
		int Science;
		int Social;
		Scanner mark=new Scanner(System.in);
		System.out.println("Enter they Student Marks");
		Tamil= mark.nextInt();
		English= mark.nextInt();
		Maths= mark.nextInt();
		Science= mark.nextInt();
		Social= mark.nextInt();
		System.out.println("Total Marks in All Subject "+(Tamil+English+Maths+Science+Social));
		
		
		
		
	}
		

  }
