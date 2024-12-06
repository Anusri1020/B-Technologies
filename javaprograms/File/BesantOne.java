package File;
import java.io.File;
public class BesantOne {
	public static void main(String[] args) {
		boolean present;
		File f1=new File("C:\\Users\\Hp\\Desktop\\BesantTechonology\\one\\two\\three");
		present=f1.exists();
		System.out.println("If folder is"+present);
		if(present==false) {
			f1.mkdirs();//make directories
		}
		
	}
	

}
//ipo folder create pannanum na namba folder vandhu link (path copy panni) sysout kulla paste pannaum aprm adha apo than folder kylla folder varum ana adhukulla (\\idhu use panni pannuanum)