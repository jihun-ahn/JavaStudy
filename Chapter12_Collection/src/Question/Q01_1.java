package Question;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Q01_1 {
	static Random r = new Random();
	static TreeSet<Integer> lotto = new TreeSet<>();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		//1-1. 게임수를 입력받고 게임수 만큼 로또 번호를 뽑아서 출력해 보세요.
		System.out.println("로또는 몇개 뽑을 것인가??");
		int gameNo = Integer.parseInt(s.nextLine());
		
		for(int i=0;i<gameNo;i++) {
			lotto.clear();// Set을 비워준다.
			for(;lotto.size()<6;) {
				int num = r.nextInt(45)+1;
				lotto.add(num);
			}
			
			int cnt = 1;
			for(int num:lotto) {
				if(cnt==6) {
					System.out.print(num);
				}else {
					System.out.print(num+",");
				}
				cnt++;
				
			}
			System.out.println("\n-------------------");
		}
		
		

	}

}
