package q08;

public class Teacher extends Member{	//Member 추상클래스를 상속하는 Teacher클래스
	
	private String subject;
	
	public Teacher(String name, String id, String password, String subject) {
		//Teacher의 이름, 아이디, 비밀번호, 담당 과목저장
		super(name, id, password); //상속된 Member필드에 저장
		this.subject=subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void work() {
		System.out.println("강의를 합니다.");
	}
	
	@Override
	public void test() {
		System.out.println("채점을 합니다.");
	}
}
