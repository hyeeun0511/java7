package j0130;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;



public class C06 {

	public static void main(String[] args) { 
		
		// BufferedReader 객체를 사용해서 진행함 
		// BufferedReader : 문자를 읽어옴
		// 문서파일읽어오기 : BufferedReader 객체를 사용해서 진행함
		String filePath = "c:/aaa/a1.txt";
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine(); //1줄씩 읽어오기
				if(line == null) break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
//		// FileInputStream - 2byte씩 읽어와서 문자를 출력하는 방식
//		String filePath = "c:/aaa/a1.txt";
//		try {
//			// 파일과 연결통로생성
//			FileInputStream fis = new FileInputStream(filePath);
//			int read = 0;
//			// 파일을 읽어옴.
//			while((read=fis.read()) != -1) { //2byte
//				// 파일 출력
//				System.out.println((char)read);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
	

//		byte[] b = new byte[1024]; //1KB
//		String filePath = "c:/aaa/a1.txt";
//		try {
//			FileInputStream fis = new FileInputStream(filePath);
//			fis.read(b);
//			System.out.println(new String(b));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}

//byte[] b = new byte[1024]; //1KB // 500자 이하까지만 읽을수있음
//====================================================================

// 1. 파일문서 읽어오기
// FilenputStream 객체선언
// 2byte씩 읽어와서 속더도느림

//2. //문서(지정)파일 일어오기
// FileReader 객체선언
// BufferedReader 객체선언후
// 읽어오면 1줄씩 읽어올수 있음

//3. 이미지파일 읽어오기
// FileInputStream 객체선언

// 4. 파일문서 저장하기
// FileOutputStream 객체선언

//


