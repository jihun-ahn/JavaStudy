package lotto;

import java.util.Iterator;
import java.util.TreeSet;


public class Controller {
	
	TreeSet<Integer> lotto = new TreeSet<>();

	public Controller() {
		init();
	}
	
	public void init() {
		while(true) {
			int mainNum = View.mainMenu();
			switch(mainNum){
			case 1://자동뽑기
				autoLotto();
				break;
			case 2://여러번 자동뽑기
				int chooseNum = View.inputNum();
				for(int i=0;i<chooseNum;i++) {
					View.autoCount(i);
					autoLotto();
				}
				break;
			case 3://수동뽑기
				int num = View.manualCount();
				View.manualNumber();
				for(int i=0;i<num;i++) {
					int number = Integer.parseInt(Main.sc.nextLine());
					lotto.add(number);
				}
				manualLotto();				
				break;
			case 4:
				View.programExit();
				break;

			default:
				break;

			}
		}

	}

	private void manualLotto() {
		TreeSet<Integer> set = new TreeSet<>();
		Iterator<Integer> itrLotto = lotto.iterator();
		while(set.size()<6){
			while(itrLotto.hasNext()) {
				set.add(itrLotto.next());
			}
			int randomNumber = (int)(Math.random()*45)+1;
			set.add(randomNumber);
		}
		Iterator<Integer> itr = set.iterator();
		View.auto();
		while(itr.hasNext()) {
			View.autoNum(itr.next());
		}
		System.out.println("");
		lotto.clear();
	}

	private void autoLotto() {
		TreeSet<Integer> set = new TreeSet<>();
		while(set.size()<6){
			int randomNumber = (int)(Math.random()*45)+1;
			set.add(randomNumber);
		}
		Iterator<Integer> itr = set.iterator();
		View.auto();
		while(itr.hasNext()) {
			View.autoNum(itr.next());
		}
		System.out.println("");
	}

}
