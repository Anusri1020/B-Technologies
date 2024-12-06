package File;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class fileread {
		public static void main(String[]args) {
		boolean Rename;
		File f1=new File("C:\\Users\\Hp\\Desktop\\BesantTechonology\\Myfile1.txt");
		try {
		FileWriter w=new FileWriter(f1);
		w.write("Welcome to Besant Technologies!!!");
		
		w.flush();
		w.close();
		FileReader r1=new FileReader(f1);
		char ch[]=new char[(int)f1.length()];
		System.out.println(ch.length);
		r1.read(ch);
		System.out.println(ch);
		}
		catch(Exception e) {
			
		}
		
		}
		
	}

//file kula ena venumo adha pottu adha file la padikuradhu dhaan read