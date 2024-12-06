package File;
import java.io.File;
public class filenewcreate {
	public static void main(String[] args) {
		boolean present;
		File f1=new File("C:\\Users\\Hp\\Desktop\\BesantTechonology\\Myfile1.txt");
		File f2=new File("C:\\Users\\Hp\\Desktop\\BesantTechonology\\Myfile2.txt");

		try {
			f1.createNewFile();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	

	

}
}
