//-------------------------[ 학생성적입력 프로그램 ]-------------------------//
package j2026;

public class C01_학생성적입력 {

	public static void main(String[] args) {
		
		// 1) 변수선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[10]; // 번호 10명
		String[] name = new String[10]; // 이름 10명
		int[][] score = new int[10][4]; // 국어,영어,수학,합계:int
		double[] avg = new double[10]; // 평균 10명:double
		int count = 0, temp = 0, choice = 0; // 학생수, 임시변수, 선택번호
		

	}

}


//================
// 1) 변수선언
//    - String > title, name / int[] > no, score / double > avg / int > count, temp, choice = 0
// 2) 화면출력
// 3) 1.성적입력/저장
// 4) 2.성적출력
// 5) 3.성적수정
// 6) 4.성적검색
// 7) 0.프로그램종료
//================