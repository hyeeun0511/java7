package j0129;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StuDeck { // extends Object { -> 생략가능
	// 세명의 학생을 자동으로(미리)추가
	StuDeck(){
		list.add(new Stuscore("홍길동",100,99,98));
		list.add(new Stuscore("유관순",100,20,78));
		list.add(new Stuscore("이순신",80,95,75));
	}
	
	
	//2.배열
	// 객체컬렉션 - 객체담을 수 있는 배열
	// add,get,remove,size(),isEmpty()
	ArrayList<Stuscore> list = new ArrayList(); // <Stuscore> 제네릭 타입 지정 -> Stuscore 타입만 담음
	Scanner scan = new Scanner(System.in);
	String name,search;
	int no,kor,eng,math,total,temp,choice;
	double avg;
	//4.테이블 제목 배열
	String[] title = {"번호","이름","국어","영어","수학","총점","평균"};
	
	// 성적삭제
	void stu_delete() {
		System.out.println("삭제할 학생 이름을 입력하세요.>> ");
		search = scan.next();
		temp = 0;
		for(int i=0;i<list.size();i++) {
			Stuscore s = list.get(i);
			if(s.getName().equals(search)) {
				temp = 1; // temp가 1이면 찾은 것
				// 삭제할 학생을 찾은 경우
				System.out.println(search+"학생을 찾았습니다. 삭제하시겠습니까? (1.예/0.아니오)>> ");
			    choice = scan.nextInt();
			    if(choice==1) {
			    	list.remove(i); // 삭제
			    	System.out.println("학색성적이 삭제되었습니다.");
			    	break;
			    }else {
			    	System.out.println("삭제가 취소되었습니다.");
			    	break;
			    }
			}
		}//for문
		
		if(temp==0) {
			System.out.println("찾고자 하는 학생이 없습니다. 다시 입력하세요.");
		}
	}

	//5.성적출력
	void stu_output() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
		System.out.println("-----------------------------------------------------");

		//방법1)== Iterator 사용출력
		Iterator<Stuscore> it = list.iterator();
		while(it.hasNext()) {
			Stuscore s = it.next();
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
		}
		
		//방법2)== for문 사용출력
//		for(int i=0;i<list.size();i++) {
////			Stuscore s = (Stuscore) list.get(i); // object 타입으로 저장된 것을 Stuscore 타입으로 변환
//			Stuscore s = list.get(i); // 위에서 제네릭 타입 지정으로 형변환 불필요
////			System.out.println(s); // toString() 자동 호출
//			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
//					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
//		}//for문
		System.out.println();
	}//stu_output
	
	//3.성적입력
	void stu_input() {
		System.out.println((Stuscore.count+1)+" 번 학생이름을 입력하세요.>> ");  // Stuscore.count+1 : 학생 번호 자동증가
		name = scan.next();
		System.out.println("국어점수를 입력하세요.>> ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>> ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>> ");
		math = scan.nextInt();
		// 추가적으로 번호,합계,평균 자동 부여
		list.add(new Stuscore(name,kor,eng,math)); // object 타입으로 바뀌어 저장
		
		System.out.println("학생성적이 추가되었습니다.");
		System.out.println();
	}//stu_input
	

	//1.화면출력
	void screen_print() {
		System.out.println("[학생성적프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("====================");
		System.out.println("원하는 번호를 입력하세요.>> ");
	}
}


//==============================================================
// 	Object o = new Stuscore();  //부모의 참조변수로 받음
//  list.add(new Stuscore());