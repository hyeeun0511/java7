package j0126_02;

public class Stuscore {
	
	{// 초기화 블록 : 생성자를 실행시 먼저 실행되는 함수
		count++;
		no=count;
	}
	Stuscore(){}
	Stuscore(String name,int kor,int eng,int math){
		this.name=name; // this : 밑에있는 변수
		this.kor=kor;
		this.eng=eng;
		this.math=math; // 이름이 다를경우 this 생략가능
//		super.math=math; // super : 부모클래스 변수 호출
		this.total=kor+eng+math;
		this.avg = total / 3.0;
	}

	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
}
