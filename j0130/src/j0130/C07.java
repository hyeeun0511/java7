package j0130;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class C07 {

	public static void main(String[] args) {
		String filePath = "c:/aaa/a1.txt";
		try {
			// 설정이 되어있지 않으면 : 덮어쓰기 / true : 이어쓰기
			FileWriter fw = new FileWriter(filePath,true); //true 이어쓰기
			BufferedWriter bw = new BufferedWriter(fw);
			String txt = "hello world222!!\r\n";
			bw.write(txt);
			 bw.close(); 
			 fw.close();
			 // bw.close(); / fw.close();  >> 버퍼를 닫아줘야 저장이 됨
			 // 미작성시 
			System.out.println("다시입력완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


//================================
// true : 이어쓰기
// 작성 안할시 : 덮어쓰기
// \r : 줄에 제일끝으로 이동
// \n : 다음줄로 이동