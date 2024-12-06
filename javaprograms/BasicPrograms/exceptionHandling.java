package BasicPrograms;
public class exceptionHandling {
	public static void main(String[]args) {
		try {
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(Exception e) {
			System.out.println(e);		
		}
	}

}
