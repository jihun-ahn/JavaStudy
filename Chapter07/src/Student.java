
public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student() {

	}


	public int getTotal() {
		int total=kor+eng+math;

		return total;
	}

	public double getAverage() {

		double avg = Math.round(getTotal()/3.0*100)/100.0;
		//Math.round는 소숫점 첫번째자리에서 반올림하므로
		//나타내고싶은 자리만큼 올려서 반올림하고
		//마지막에 올린만큼 내려서 출력한다.
		return avg;
	}


	public void info() {
		int total = getTotal();
		double avg = getAverage();
		System.out.println("이름 : "+name);
		System.out.println("반 : "+ban);
		System.out.println("번호 : "+no);
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+getTotal());
		System.out.println("평균 : "+getAverage());
	}

}
