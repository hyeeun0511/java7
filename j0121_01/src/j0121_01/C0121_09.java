package j0121_01;

import java.util.Scanner;


public class C0121_09 {
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		// 변수선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[10]; // 번호 5명
		String[] name = new String[10]; // 이름 5명
		int[][] score = new int[10][4]; // 국,영,수,합계
		double[] avg = new double[10];
		int total = 0, count = 0;  // 같은 타입이면 쉼표로 구분해서, 여러개를 한줄로 선언 가능
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적검색");
			System.out.println("0. 종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: // 성적입력
				while(true) {
					total = 0; // 합계 초기화 (다음 학생때 합계가 합쳐져서 나오지 않도록)
					System.out.println("[ 학생성적입력 ]");
					System.out.printf("%d번째 학생이름을 입력하세요.(0.이전페이지이동)>> ",count+1);
					name[count] = scanner.next();
					
					if(name[count].equals("0")) break; // 이전페이지 이동
					
					for(int i=0;i<3;i++) {
						//국어,영어,수학 점수 입력
						System.out.printf("%s 점수를 입력하세요.>> ",title[i+2]);
						score[count][i] = scanner.nextInt(); // count에 0,1,2번방에 국,영,수 점수 입력 (0의 1,2,3번방)
						//합계
						total += score[count][i];
					}
						//평균
						avg[count] = total/3.0; 
						no[count] = count+1; // 번호
						score[count][3] = total;  // 0번째 : 국어 , 1번째 : 영어 , 2번째 : 수학 , 3번째 : 합계
						
						System.out.println("학생성적이 입력되었습니다.");
						count++; // 다음 학생 // 합계에 넣어야함
						//합계
					System.out.println();
				}
				break;
			
			case 2: // 성적출력
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]); //번호,이름,국어,영어,수학,합계,평균
				System.out.println("-------------------------------------------------------");
				for(int i=0;i<count;i++) {  // count : 입력된 학생수만큼 출력
					System.out.printf("%d\t",no[i]);           // 번호
					System.out.printf("%s\t",name[i]);         // 이름
					for(int j=0;j<score[0].length;j++) {       
						System.out.printf("%d\t",score[i][j]); // 국영수 점수 합계  //[0,0] [0,1] [0,2] [0,3]
					}
					System.out.printf("%.2f\n",avg[i]);        // 평균 : 소수점 2자리까지
					System.out.println();
				}
				break;
			case 3:
				break;
			case 4: // 학생검색
				System.out.println("[ 학생검색 ]");
				
				System.out.println("검색할 학생 이름을 입력하세요.>> ");
				String search = scanner.next();
				int temp = 0;
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]); //번호,이름,국어,영어,수학,합계,평균
				System.out.println("-------------------------------------------------------");
				for(int i=0;i<count;i++) {  // count : 입력된 학생수만큼 출력  // 홍길동,유관순,이순신,홍길자,홍길순
					//if (name[i].equals(search)) { // 이름과 동일하면 출력
					if (name[i].contains(search)) { // 이름에 검색어가 포함되면 출력
						temp = 1; // 찾았다는 표시
					//if(name[i].equals(search)) { // 이름과 동일하면 출력
						System.out.printf("%d\t",no[i]);           // 번호
						System.out.printf("%s\t",name[i]);         // 이름
						for(int j=0;j<score[0].length;j++) {       
							System.out.printf("%d\t",score[i][j]); // 국영수 점수 합계  //[0,0] [0,1] [0,2] [0,3]
						}
						System.out.printf("%.2f\n",avg[i]);        // 평균 : 소수점 2자리까지
					}
				}
				if(temp==0) System.out.println("검색된 학생이 없습니다.");
				System.out.println();
				break;
			default:
				System.out.println("[ 프로그램을 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break loop;  // while
		}
	}
		
		
		
		
//====================================================================================
//		// 검색.
//		int[] a = {1,2,0,4,0,12,3,4,0,9,6,34,5,0};
//		int temp = 0;
//		int count = 0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==0) {
//				count++;
//				temp = 1; // 찾았다는 표시
//			}
//		}
//		if(temp==0) {
//			System.out.println("해당문자가 없습니다.");
//		}else {
//			System.out.println("해당문자가 있습니다."); // for문 안에 들어가면 여러번 출력됨
//			System.out.println("해당문자 개수 : "+count);
//		}
//====================================================================================
		
		
		
		
		
		
//		int[] a = {1,2,3,4,5};
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+"\t");  // 순차정렬  // 1 2 3 4 5
//		}
//		System.out.println();
//		System.out.println("개수 : "+a.length);
//		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();  // 역순정렬  // 5 4 3 2 1

	}

}
