package BasicPrograms;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
    	int Choice;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the choice");  
        Choice = scn.nextInt();
        switch (Choice) {
        case 1:
        	System.out.println("java");  
        	break;
        case 2:
        	System.out.println("sql");  
        	break;
        case 3:
        	System.out.println("p++");  
        	break;
        case 4:
        	System.out.println("support engineer");  
        	break;
        	
        }
        System.out.println("invalid choice");  
        }
}
        
