package j0129;

//import java.io.FileInputStream;
import java.io.FileReader;

public class C06 {

	public static void main(String[] args) {
		FileReader fr = null;
	try{
		fr = new FileReader("c:/aaa/a1.txt");
		int data = 0;
		while ((data = fr.read()) != -1) {
			//2byte(1단어)씩 읽어옴
			System.out.print((char) data);
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		 try {
             if (fr != null) {
                 fr.close();
             }
         }catch (Exception e) {
             e.printStackTrace();
         }
	}
	}
}
