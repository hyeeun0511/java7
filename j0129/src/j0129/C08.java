package j0129;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ==== [ wrapper 클래스 ] ====================================================================
		
		// Wrapper 클래스 : 기본형 데이터를 객체(참조형)로 감싸기 위한 클래스이며
		// Boxing / Unboxing을 통해 기본형 ↔ 참조형 변환이 가능하다.
		
		// 기본형(primitive type) <-> 참조형(reference type)
		// 1. Integer(21억...), Double, Character, Boolean
		// 2. Boxing, UnBoxing
		// 내부적으로 기본형 변수를 갖고있음
//		int a = 10;
//		Integer b = new Integer(10); // 기본형 -> 참조형 // 클래스 하나를 만들어놓고 그 안에 기본형을 넣어놓음 (덮어씌움)
//		BigInteger c = new BigInteger("12345678901234567890"); // 매우 큰 수  //BigInterger은 문자열로 넣어야함
		
		
		
		// ==== [ String 클래스 ] ====================================================================
		// String, StringBuffer
		
		// 2. StringBuffer
//		StringBuffer sb = new StringBuffer("0123");
//		sb.append("4");
//////	sb = sb+"4"; // 불가능 > 에러
//		System.out.println(sb); // 01234
//		System.out.println(sb.charAt(0)); // 0
//		
//		String str = "0123";
//		str = str+4;
//		System.out.println(str); // 01234
//		System.out.println(sb.charAt(0)); // 0
		
		// 1. String
//		String str = "0";  // 10123456789 // 주로 활용 
//		
//		int a = 0;
//		for(int i=1;i<=10;i++) {
////			1.
////			a += i;
//			str += i;  // 문자열 결합
//		}
////		1.
////		System.out.println(a);  // 메모리 공간 : 1개 / 값 : 55
//		System.out.println(str);  
		// i -> 자동으로 문자열로 변환 > 문자열 결합
		
		
		
		// ==== [subString() 함수 사용 ] ====================================================================
		// subString(시작위치,끝위치) : 문자열 자르기 / "시작위치"부터 "끝위치"까지 잘라오기
		// subString(0,5)
		// 10조12345번
		// 12345
//		String txt = "10조12345번";
//		System.out.println(txt.substring(3,8)); // 3번부터 8번까지 잘라오기
//		System.out.println(txt.substring(3)); // 3번부터 끝까지 잘라오기
//		System.out.println(txt.substring(0)); // 0번부터 끝까지 잘라오기
//		
//		//charAt(); - 문자1개 잘라내기
//		System.out.println(txt.charAt(0)); // 문자 1개 잘라옴
		
		
		
		// ==== [ split() 함수 사용 ] ====================================================================
		// split(",") : 특정문자분리, valueOf-타입변경, parseInt-타입변경
//		String txt = "1,홍길동,100,100,100,300,100.0";
//		String[] arr = txt.split(",");
//		int no = Integer.parseInt(arr[0]); // 문자열(string) > 기본형(int) 변환	
//		String name = arr[1];
//		int kor = Integer.valueOf(arr[2]);
//		int eng = Integer.valueOf(arr[3]);
//		int math = Integer.valueOf(arr[4]);
//		int total = Integer.valueOf(arr[5]);
//		double avg = Double.parseDouble(arr[6]);  // 숫자일 경우에만 사용가능
//		System.out.println(Arrays.toString(arr));
		
		
		
		// ==== [ trim(), replace() 함수 사용 ] ====================================================================
		// trim() : 앞뒤 빈공백 제거  
		//          중간(사이) 공백 제거 불가
		// replace() : 문자 대체
		//             (" ","") : 공백제거
//		String txt = "   a   b   c   ";
//		String txt2 = "   abc   ";
//		System.out.println(txt);
//		System.out.println(txt2);
//		System.out.println(txt.trim()); 
//		System.out.println(txt2.trim());
//		System.out.println(txt.replace(" ",""));
		
		
		// ==== [ replace() 함수 사용 ] ====================================================================
//		String txt = "aaabbbcdeaaabcccceaeaeab"; 
//		String txt2 = txt.replace("a","A"); // txt문자열에서 a를 A로 변경 > 변경된 문자열 반환
//		System.out.println(txt2);
//		System.out.println(txt.length()-txt.replace("e","").length()); // a문자 제거 후 길이 반환 // "a","" =의미= a -> 빈공백
//		// txt.length()   -   txt.replace("e","").length() 
//		// 원래문자열 길이    (-)  e문자 제거한 후 길이 
//		// = e문자 개수
		
		
		// ==== [ indexOf() 함수 사용 ] ====================================================================
//		// 문자 선언
//		String txt = "aaabbbcdeaaabcccceaeaeab"; 
//		// 문자 길이
//		System.out.println("문자 길이 : "+txt.length());
//		int count = 0;
//		for(int i=0;i<txt.length();i++) { // txt.length 문자열 길이로 정해놔야함 > 길이를 넘어갈시 for문 빠져나옴
//			if(txt.indexOf("a",i)!=-1) {
//				System.out.println("위치값 : "+txt.indexOf("e",i));
//				i=txt.indexOf("a",i); // 찾은 위치값 // 8
//				count++; // 찾았으면
//			}else break;
//		}
//		System.out.println("-------------------");
//		System.out.println("a문자 개수 : "+count);
		
		

		// e문자의 위치
//		System.out.println(txt.indexOf("e")); // 8  // txt.indexOf("e") = 8
//		System.out.println(txt.indexOf("e",8+1)); // 17
//		System.out.println(txt.indexOf("e",17+1)); // 19
//		System.out.println(txt.indexOf("e",19+1)); // 21
//		System.out.println(txt.indexOf("e",21+1)); // -1 > e없음
		// => for문으로 변경
		
		
		
		
		// ==== [ contains() 함수 사용 ] ====================================================================
//		Scanner scan = new Scanner(System.in);
//		String[] name = {
//			"홍길동","유관순","이순신","강감찬","김구",
//			"김유신","홍길자","홍길순","유관자","이순자",
//		};
//		
//		// "홍"이 들어가 있는 사람을 모두 출력하세요.
//		int temp = 0; //temp : 임시변수
//		System.out.println("[ 검색 출력 ]");
//		for(int i=0;i<name.length;i++) {
//			
//			if(name[i].contains("순")) {
//				System.out.println(i+" : "+name[i]);
//				temp=1;
//			}
//		}//for
//		System.out.println("-------------------");
//		System.out.println("이름 변경할 사람의 번호를 입력하세요.>> ");
//		int no = scan.nextInt(); // 번호 입력
//		// 변경할 이름을 입력받아, 수정을 시키고 전체출력하시요.
//		// 1. 변경 이름 입력
//		System.out.println(name[no]+" : 변경할 이름을 입력하세요.>>");
//		name[no] = scan.next();
//		// 2. 변경 이름으로 변경
////		name[no] = chname;
//		// 3. 전체 출력
//		System.out.println("[전체 출력]");
//		for(int i=0;i<name.length;i++) {
//			System.out.println(i+" : "+name[i]);
//		}
//		
//		if(temp==0) {
//            System.out.println("검색된 사람이 없습니다.");
//        }
	}//main

}

// equals : 같다
// contains : 포함하다