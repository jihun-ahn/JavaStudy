package q08;

public class Student extends Member{	//Member 추상클래스를 상속하는 Student클래스
	
	private String subject;
	
	public Student(String name, String id, String password, String subject) {
		//Student의 이름, 아이디, 비밀번호, 전공 저장
		super(name, id, password);	//상속된 Member필드에 저장
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void work() {
		System.out.println("공부를 합니다.");
	}
	
	@Override
	public void test() {
		System.out.println("시험을 봅니다.");
	}
}
