package Question08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Board[] posts = new Board[101];
	static List<Member> members = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		new Controller().init();
	}
}