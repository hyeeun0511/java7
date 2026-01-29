package j0129;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		
		try {
			// 외부에서 파일을 읽어오기 때문에 try-catch 선언이 되어야 함
			FileReader fr = new FileReader("c:/aaa/a1.txt"); // c드라이브에 aaa폴더안에 a1.txt 파일
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				// 한줄씩 읽어오기
				String line = br.readLine();
				if(line ==null) break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace(); // 미작성시 -> 에러 발생 위치를 알 수 없음
		}
		System.out.println("프로그램이 종료되었습니다."); // 에러가 나도 프로그램 종료 됨
		
		
		
		// <예외처리 미루기 => throws>
//		// TryClass 객체선언 및 메서드 호출
//		TryClass t = new TryClass();
//		try {
//			t.method(); // 메서드 호출 => 에러가 난 부분 출력
//		} catch (Exception e) {
//			e.printStackTrace(); // 에러발생 정보 위치 메세지 출력
//		}
//		System.out.println("프로그램을 종료합니다.");

		
		
//		// try-catch문 => 에러가 발생할 가능성이 있는 코드를 미리 감싸놓음
//		System.out.println(1);
//		System.out.println(2);
////		System.out.println(0/0); // 0으로 나누기 -> 에러!! => try로 넘어가지않고 (2)에서 멈춤
//		try {
//			System.out.println(3);
////			System.out.println(0/0); // 0으로 나누기 -> 에러!!
//			System.out.println(4);
//			System.out.println(5);
//			throw new Exception("!!고의로 발생!!"); // 강제로 에러 발생
//		} catch (Exception e) {
//		System.out.println(6);
//		System.out.println(e.getMessage());
//		e.printStackTrace(); // 에러발생 정보 위치 메세지 출력  // 많이 사용
//		}
//		System.out.println(7);
//		// try문에서 에러가 발생하면 catch문으로 이동
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("안녕"); // 컴파일에러 : 오타
//		
//		int[] a = new int[3];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		System.out.println("값을 입력하세요.>> ");
//		int b = scan.nextInt();
//		System.out.println(b);
//		a[3] = b; // 런타임에러
		
		

//		int[] arr = {1,2,3,4,5};
//		System.out.println(arr.length);
//		arr[2] = 0; // 안에있는 데이터를 없애도 공간은 남아있음 // 3->0 {1,2,0,4,5} -> arr.length는 변하지않음 => 5
//		System.out.println(arr.length);
		
		
		// object 타입 :  모든 클래스의 최고 조상 클래스
		// 아무 타입이나 넣을 수 있음
//		int[] arr = {1,2,3};
//		Stuscore s = new Stuscore("홍길동",100,100,99);
//		
//		String str = "aaa";
//		String str2 = "bbb";
////		if(str == str2) // 객체는 등가비교 X => equals() 사용!!
//		if(str.equals(str2)) {
//			System.out.println("같음");
//		}else {
//			System.out.println("다름");
//		}
		
	}

}
