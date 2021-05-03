package Question;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Q02 {
	
	static TreeMap<String,String> words = new TreeMap<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		2. 영어단어장을 만들어 봅시다.
		boolean run = true;
		while(run) {
			System.out.println("영어 단어장 프로그램");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 단어 등록");
			System.out.println("2. 단어 조회");
			System.out.println("3. 단어 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택>");
			int selectMenu=0;
			
			try {
				selectMenu = Integer.parseInt(scan.nextLine());
			}catch(NumberFormatException err) {
				System.out.println("잘못 입력했습니다. \n다시 확인해 주세요.");
				System.out.println("*************************************");
				continue;
			}
			
			switch(selectMenu) {
			case 1:// 단어 등록
				regWord();
				break;
			case 2:// 단어 조회
				chkWord();
				break;
			case 3:// 단어 삭제
				delWord();
				break;
			case 4:// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다. \n다시 확인해 주세요.");
			}
		}
	}

	private static void chkWord() {
		System.out.println("단어 검색 방법을 선택하세요.");
		System.out.println("1. 특정 단어 조회");
		System.out.println("2. 전체 단어 조회");
		
		int selectSearchWords = Integer.parseInt(scan.nextLine());
		
		if(selectSearchWords == 1) {
			System.out.println("특정 단어를 조회합니다.");
			searchWordSpec();
		}else if(selectSearchWords == 2) {
			System.out.println("모든 단어를 조회합니다.");
			searchWordAll();
		}else {
			System.out.println("잘못 입력했습니다. \n다시 확인해 주세요.");
		}
	}

	private static void searchWordSpec() {
		System.out.println("조회 하고자 하는 단어를 입력해 주세요.");
		String engWord = scan.nextLine();
		
		if(words.containsKey(engWord)) {
			System.out.println("한글 의미 : "+words.get(engWord));
		}else {
			System.out.println("해당 단어는 등록되지 않았습니다.");
		}
	}

	private static void searchWordAll() {//맵 전체 데이터 조회  => Set으로 전환 후 검색
		System.out.println("************************************");
		 Set<Map.Entry<String,String>> wordSet = words.entrySet();
		 
		 Iterator<Map.Entry<String,String>>  wordItr= wordSet.iterator();
		
		 while(wordItr.hasNext()) {
			 Map.Entry<String,String> wordEntry = wordItr.next();
			 String engWord = wordEntry.getKey();
			 String korWord = wordEntry.getValue();
			 
			 System.out.println(engWord+" : "+korWord);
		 }
		 System.out.println("************************************");
	}

	private static void delWord() {
		System.out.println("단어 삭제 방법을 선택하세요.");
		System.out.println("1. 특정 단어 삭제");
		System.out.println("2. 전체 단어 삭제");
		
		int selectRemoveWords = Integer.parseInt(scan.nextLine());
		
		if(selectRemoveWords == 1) {
			System.out.println("특정 단어를 삭제합니다.");
			delWordSpec();
		}else if(selectRemoveWords == 2) {
			System.out.println("모든 단어를 삭제합니다.");
			words.clear();
		}else {
			System.out.println("잘못 입력했습니다. \n다시 확인해 주세요.");
		}
		
	}

	private static void delWordSpec() {
		System.out.println("삭제할 단어를 입력해 주세요.");
		String engWord = scan.nextLine();
		
		words.remove(engWord);
	}

	private static void regWord() {
		System.out.println("단어를 등록해 주세요.");
		System.out.println("이미 등록된 단어의 경우 새로운 의미로 갱신됩니다.");
		System.out.println("영단어를 입력해 주세요.");
		String engWord = scan.nextLine();
		System.out.println("단어의 의미를 입력해 주세요.");
		String korWord = scan.nextLine();
		
		words.put(engWord, korWord);
		System.out.println("단어 등록이 완료되었습니다.");
	}

}






