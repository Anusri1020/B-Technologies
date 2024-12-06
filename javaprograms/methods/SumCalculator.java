package methods;
public class SumCalculator {
	    public static int getTotal(int num1, int num2) {
	        return num1 + num2; 
	    }
	    public static void main(String[] args) {
	    	System.out.println("method valuess");
	        int number1 = 15; 
	        int number2 = 25; 
	        int result = getTotal(number1, number2);
	        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
	        System.out.println("close they values");
	    }
	}


