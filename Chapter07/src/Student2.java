
public class Student2 {
	String name;
	int java;
	int oracle;
	int python;	
	

	public Student2(String name, int java, int oracle, int python) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.python = python;
	}
	
	public void prt() {
		System.out.println("이름: "+name);
		System.out.println("자바 점수: "+java);
		System.out.println("오라클 점수: "+oracle);
		System.out.println("파이썬 점수: "+python);
	}
}
