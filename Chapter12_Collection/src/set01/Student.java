package set01;

public class Student {
	
	private String name;
	private int studentNumber;
	
	public Student(String name, int studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			
			return (stu.getName().equals(this.name));
//					 && (stu.getStudentNumber() == this.studentNumber);
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
//		return studentNumber;
		return this.name.hashCode();
	}
	
	
	
	
}
