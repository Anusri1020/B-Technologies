package methods;
import java.util.Scanner;
public class Average {
	    public static double computeAverage(int num1, int num2, int num3) {
	        return (num1 + num2 + num3) / 3.0; 
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Input the second number: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Input the third number: ");
	        int num3 = scanner.nextInt();
	        double average = computeAverage(num1, num2, num3);
	        System.out.println("The average value is: " + average);
	        scanner.close(); 
	    }
	}



