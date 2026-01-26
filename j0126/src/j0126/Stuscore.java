package j0126;

public class Stuscore { //초기화블록:생성자릐 공통적으로 사용되는 것들을 정의
	{ count++; 
		no= count; 
	} //인스턴스 초기화 블럭}
	
	Stuscore(){
		count++;
		this.avg = total / 3.0;
	} //기본생성자-클래스명같다.리턴값이 없다. void 안붙임
                                  //같은 이름
	Stuscore(int no, String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		count++;
	}
	static int count;
	int no; // 인스턴스변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	 Stuscore(String name, int kor, int eng, int math) {
	        this.name = name;
	        this.kor = kor;
	        this.eng = eng;
	        this.math = math;
	        this.total = kor + eng + math;
	        this.avg = total / 3.0;
	    }
	
	public void calTotal(int kor,int eng,int math) {
		this.total = kor+eng+math;
	}
	
	public void calAvg(int kor,int eng,int math) {
		this.avg = this.total / 3.0;
	}
}
