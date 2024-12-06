package File;
import java.io.File;
import java.io.FileWriter;
public class writingaFile {
	public static void main(String[]args) {
	boolean Rename;
	File f1=new File("C:\\Users\\Hp\\Desktop\\BesantTechonology\\Myfile1.txt");
	try {
	FileWriter w=new FileWriter(f1);
	w.write("How are you?");
	w.write("have you lunch?");
	w.write("i think your job is good?");
	w.write("i like your job?");
	w.flush();
	w.close();
	}
	catch(Exception e) {
		
	}
	
	}
	
}

//FileWriter obj=new FileWriter(location);
//writing a file.
// file fulla contect eludhanum na rendu word adhula try kuylla kudukkanum onnu flush();,close();