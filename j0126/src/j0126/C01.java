package j0126;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// 다른클래스에서 다른 클래스 사용하려면
		// 객체선언(인스턴스생성)
		
		// 예제
		// main에서 입력을 받아, 입력한 값에 arr배열에 그 값을 곱하여 리턴받아 출력하세요.
		// 5 -> [1*5,2*5,3*5]
		// main메소드에서 출력하세요.
		
		// 1) 입력한값을 매개변수로 보내줌
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>> ");
        int num = scan. nextInt();	
        // 객체선언후 매개변수로 전달함
        CMethod cm = new CMethod(); 
        //클래스명          //생성자명
        // 2) 리턴값을 받아서 출력
        int[] arr = cm.method(num);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
		

	}

}
