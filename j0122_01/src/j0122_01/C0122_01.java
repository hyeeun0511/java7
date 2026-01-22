package j0122_01;

import java.util.Scanner;

public class C0122_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 변수선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = {1,2,3,0,0,0,0,0,0,0}; // 번호 5명
		String[] name = {"홍길동", "유관순","이순신","","","","","","",""};// 이름 5명
		int[][] score = {
				{ 100, 100, 100, 300 }, { 90, 90, 90, 270 }, { 80, 80, 80, 240 }, 
				{ 0, 0, 0, 0 },{ 0, 0, 0, 0 },{ 0, 0, 0, 0 },{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },{ 0, 0, 0, 0 },{ 0, 0, 0, 0 },
		};
		double[] avg = {100.0,90.0,80.0,0,0,0,0,0,0,0,0,0};
		int count = 3;  // 같은 타입이면 쉼표로 구분해서, 여러개를 한줄로 선언 가능
		String search = ""; 
		int temp = 0,choice = 0;
//==============================================
		
		loop:while(true) {
			// 화면출력
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적검색");
			System.out.println("0. 종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1: // 성적입력
				while(true) {
					System.out.println("[ 성적입력 ]");
					int total = 0; // 합계 초기화
					// 번호
					no[count] = count+1;
					// 이름입력
					System.out.printf("%d번째 학생이름을 입력하세요.(0.이전페이지 이동)>> ",count+1); // count 0,1,2,3,4
					name[count] = scanner.next(); // 이름 입력
					// 이전페이지 이동 체크
					if(name[count].equals("0")) {
						System.out.println(">> 이전페이지 이동입니다.");
						System.out.println();
						break; 
					}
					
					for(int i=0;i<3;i++) {  // 3: 국어,영어,수학 총 3번 돌아야해서
						// 국어,영어,수학 점수 입력
						System.out.printf("%s 점수를 입력하세요.>> ",title[i+2]); //i+2 : title 2,3,4번방 (국,영,수) // title[0] : 번호, title[1] : 이름
						score[count][i] = scanner.nextInt();
						// 합계
						total += score[count][i];
					}
					// 합계.평균
					score[count][3] = total; // 합계
					avg[count] = total/3.0; // 평균
					
					System.out.printf("%s 학생성적이 저장되었습니다.\n",name[count]);
					System.out.println();
					count++;
				}
				break;
			// 성적출력 
			case 2:
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]); //번호,이름,국어,영어,수학,합계,평균
				System.out.println("-------------------------------------------------------");
				for(int i=0;i<count;i++) {  // count : 입력된 학생수만큼 출력
					System.out.printf("%d\t",no[i]);           // 번호
					System.out.printf("%s\t",name[i]);         // 이름
					for(int j=0;j<score[0].length;j++) {       
						System.out.printf("%d\t",score[i][j]); // 국영수 점수 합계  //[0,0] [0,1] [0,2] [0,3]
					}
					System.out.printf("%.2f\n",avg[i]);        // 평균 : 소수점 2자리까지
				}
				System.out.println();
				break;
			
			// 수정학생 이름 검색
			case 3:
				System.out.println("수정하려는 학생 이름을 입력하세요.>> ");
			search = scanner.next();
			temp = 0;
			for(int i=0;i<count;i++) {
				// 검색확인
				if(name[i].contains(search)) {                 // 이름에 검색어가 포함되면 출력
					System.out.printf("[ %s 학생 성적수정 ]\n",search);
					System.out.println("1. 국어점수 수정");
					System.out.println("2. 영어점수 수정");
					System.out.println("3. 수학점수 수정");
					System.out.println("-----------------------");
					System.out.println("수정하려는 과목번호를 입력하세요.>> ");
					choice = scanner.nextInt();
					System.out.println();
					
					// 국어,영어,수학 점수수정
					System.out.printf("[%s점수 수정]\n",title[choice+1]);  // case:1 선택 -> choice:1 -> choice+1=1+1 => 0,1,2 = 번호,이름,국어 ~> 국어
					// ex.현재국어점수 출력 // case:1 선택 -> choice:1 -> choice-1=1-1 => 0,1,2 = 국어,영어,수학 ~> 국어
					System.out.printf("현재%s점수 : %d \n",title[choice+1],score[i][choice-1]); 
					System.out.printf("변경%s점수를 입력하세요.>> ",title[choice+1]);
					score[i][choice-1] = scanner.nextInt(); //국어점수 변경 //바로 입력
						
//					case 2: // 영어점수 수정
//						System.out.println("[영어점수 수정]");
//						System.out.printf("현재영어점수 : %d \n",score[i][1]);
//						System.out.print("변경영어점수를 입력하세요.>> ");
//						score[i][1] = scanner.nextInt(); //국어점수 변경 //바로 입력
//						break;
//					case 3: // 수학점수 수정
//						System.out.println("[수학점수 수정]");
//						System.out.printf("현재수학점수 : %d \n",score[i][2]);
//						System.out.print("변경수학점수를 입력하세요.>> ");
//						score[i][2] = scanner.nextInt(); //국어점수 변경 //바로 입력
//						break;
					
					// 합계,평균 수정(공통부분)
					score[i][3] = score[i][0] + score[i][1] + score[i][2]; // 합계 재계산
					avg[i] = score[i][3]/3.0; // 평균 재계산
					
					temp=1; // 검색되었음을 표시
					
					System.out.printf("%s학생 %s 점수가 %d으로 수정되었습니다.\n",search,title[choice+1],score[i][choice-1]);
					System.out.println();
					
				}
			}	
			if(temp==0) { // 검색되지 않을때(검색어가 이름에 포함되어있지않을때
				System.out.printf("수정하려는 %s 학생을 찾지 못했습니다.",search); 
				System.out.println();
			}
			
			break;
			// 학생검색
			case 4: 
				// 학생이름검색
				System.out.println("검색하려는 학생 이름을 입력하세요.>> ");
				search = scanner.next();
				temp = 0;
				// 1. 겁색 출력 시작
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]); //번호,이름,국어,영어,수학,합계,평균
				System.out.println("-------------------------------------------------------");
				for(int i=0;i<count;i++) {
					// 검색확인
					if(name[i].contains(search)) {                 // 이름에 검색어가 포함되면 출력
						System.out.printf("%d\t",no[i]);           // 번호
						System.out.printf("%s\t",name[i]);         // 이름
						for(int j=0;j<score[0].length;j++) {       
							System.out.printf("%d\t",score[i][j]); // 국영수 점수 합계  //[0,0] [0,1] [0,2] [0,3]
						}
						System.out.printf("%.2f\n",avg[i]);        // 평균 : 소수점 2자리까지
						temp=1; // 검색되었음을 표시
					} // if 끝
					
				}
				System.out.println();
				// 검색되지 않을때
				if(temp==0) {
					System.out.println("%학생이 검색되지 않았습ㄴ다.");
					System.out.println();
				}
				
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop; // break만 작성 시 : switch문 종료 - while문은 계속 실행
			} // switch 끝
		} // while(반복문) 끝

	} // main 끝

}
