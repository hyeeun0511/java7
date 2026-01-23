package j0123_01;

public class Stuscore {
	{// 초기화 블럭 - 생성자보다 우선 실행
		this.no = count+1;
		count++;
	}
	
	Stuscore(){} // 기본 생성자 - 생성자가 없으면 자동생성
	
	Stuscore(String name, int kor, int eng, int math) {// int no 받지않음 : 자동증가
		this.no = count; 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
	}
	
	void cal(int kor,int eng,int math) {
		this.total = kor+eng+math;
		this.avg=this.total/3.0;
	}
	
	static int count=0; // 클래스 변수 - 객체선언없이 클래스명.변수명
	int no;      // 인스턴스 변수 - 객체선언 후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

}

//=====================================================
// this() : 생성자에서 다른 생성자 호출
// this. : 인스턴스 변수
//=====================================================

