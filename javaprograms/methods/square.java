package methods;
import java.util.Scanner;
public class square {
	    public static double computeSquare(double number) {
	        return number * number; 
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input any number for square: ");
	        double number = scanner.nextDouble();
	        double square = computeSquare(number);
	        System.out.printf("The square of %.2f is: %.2f\n", number, square);

	        scanner.close(); 
	    }
	}



