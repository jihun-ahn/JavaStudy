package q08;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Set<Teacher> teacher = new HashSet<>();	//Teacher 클래스 Set 선언
	static Set<Student> student = new HashSet<>();	//Student 클래스 Set 선언

	public static void main(String[] args) {
		new Controller().init();
	}
}
