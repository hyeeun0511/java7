package j0129_02;

public class Stuscore {

	// 인스턴스 초기화 블럭
	// 인스턴스 생성될때마다 1씩증가 > 번호부여
	{
		count++;
		no = count;
	}
	
	// 기본생성자
	Stuscore(){}
	
	// 오버로딩 생성자 : 이름,국어,영어,수학
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = (kor+eng+math)/3.0;
	}
	
	
	
	// Stuscore : 학생성적처리 클래스  (count 필요없음)
	public Stuscore(int no, String name, int kor, int eng, int math, int total, double avg) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	
	
	static int count;
	private int no;
	String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg; 
	
	
	//getter/setter
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Stuscore.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	

}
