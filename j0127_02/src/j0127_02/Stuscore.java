package j0127_02;

public class Stuscore {
	{
		count++;
		no = count;
	}
	
	Stuscore(){}
	Stuscore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	// private : 같은 클래스 내에서만 접근 가능 -> 바로접근불가, 다른경로로도 접근불가
	private static int count;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setKor(int kor) {
		if(kor>100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
	}
	int getKor() {
		return kor;
	}

}
