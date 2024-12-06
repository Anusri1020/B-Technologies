package methods;
import java.util.Scanner;
public class SmallestNumber 
	{
	    public static int findSmallest(int num1, int num2, int num3) {
	        int smallest = num1; 
	        if (num2 < smallest) {
	            smallest = num2;
	        }
	        if (num3 < smallest) {
	            smallest = num3;
	        }
	        return smallest; 
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Input the second number: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Input the third number: ");
	        int num3 = scanner.nextInt();
	        int smallest = findSmallest(num1, num2, num3);
	        System.out.println("The smallest number is: " + smallest);
	        scanner.close(); 
	    }
	}

