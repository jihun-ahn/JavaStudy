import java.util.Scanner;

public class QuestionNotepad {
	//5명의 학생 정보를 입력하는 프로그램 작성
	//Student2라는 클래스를 만들어서
	//이름, 자바점수, 오라클점수, 파이썬점수를 저장할 수 있도록 합니다.
	//5명의 학생정보를 출력하는 프로그램을 만들어 봅시다.
	//5명의 학생 정보를 배열에 담아서 반복을 통해 데이터를 입력하고 출력해봅시다.
	static Scanner sc = new Scanner(System.in);
	static Student2[] students = new Student2[5];
	public static void main(String[] args) {
						
		for(int i=0;i<students.length;i++) {
			System.out.print("이름 입력: ");
			String name=sc.nextLine();
			System.out.print("자바 점수 입력: ");
			int java=Integer.parseInt(sc.nextLine());
			System.out.print("오라클 점수 입력: ");
			int oracle=Integer.parseInt(sc.nextLine());
			System.out.print("파이썬 점수 입력: ");
			int python=Integer.parseInt(sc.nextLine());
			
			students[i] = new Student2(name, java, oracle, python);
			
		}
		for(int i=0;i<5;i++) {
			students[i].prt();
		}
	}

}

