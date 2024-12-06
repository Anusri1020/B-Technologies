package File;
import java.io.File;
public class filerename {
		public static void main(String[] args) {
			boolean Rename;
			File f1=new File("C:\\Users\\Hp\\Desktop\\BesantTechonology\\Myfile1.txt");
			File f2=new File("C:\\Users\\Hp\\Desktop\\BesantTechonology\\Myfile2.txt");
           Rename= f1.renameTo(f2);
           System.out.println("Rename to "+Rename);
		}

		}

