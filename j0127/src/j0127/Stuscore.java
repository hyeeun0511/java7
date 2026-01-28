package j0127;

public class Stuscore {
	
	// 초기화블록
	{
		count++;
		no = count; // 번호자동부여  // this.no = count;와 같음. this 생략가능
	}
	
	// 생성자 - 초기화메소드
	// 클래스명 같음,리턴X,voidX
    Stuscore(){} // 기본생선자
	
	Stuscore(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	// 합계
	void calTotal(int kor, int eng, int math) {
		this.total = kor + eng + math;
	}
	// 평균
	void calAvg(int kor,int eng,int math) {
		this.avg = this.total/3.0;
	}
}


