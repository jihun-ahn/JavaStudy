package score;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Student[] student = new Student[5];
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("성적 관리 프로그램");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.print(">");
			int selectNum = Integer.parseInt(sc.nextLine());

			switch(selectNum) {
			case 1:
				if(student[student.length-1]==null) {
					System.out.print("이름: ");
					String name = sc.nextLine();
					int[] score = new int[3];
					System.out.print("국어 성적: ");
					score[0] = Integer.parseInt(sc.nextLine());
					System.out.print("영어 성적: ");
					score[1] = Integer.parseInt(sc.nextLine());
					System.out.print("수학 성적: ");
					score[2] = Integer.parseInt(sc.nextLine());

					Student newStudent= new Student(name, score);
					for(int i=0;i<student.length;i++) {
						if(student[i]==null) {
							student[i]=newStudent;
							System.out.println("입력 완료");
							break;
						}
					}

					if(student[4]!=null) {
						ranking();
					}
					break;
				}else {
					System.out.println("모든학생이 입력 되었습니다.");
					break;
				}

			case 2:
				System.out.println("성적 조회");
				System.out.println("1. 학생 성적 조회");
				System.out.println("2. 과목 성적 조회");
				System.out.println("3. 이전 메뉴 돌아가기");
				System.out.print(">");
				int select = Integer.parseInt(sc.nextLine());

				if(select==1) {
					int studentIdx=-1;
					System.out.println("이름을 입력하세요.");
					System.out.print(">");
					String studentName = sc.nextLine();

					for(int i=0;i<student.length;i++) {
						if(student[i]==null) {
							continue;
						}else if(studentName.equals(student[i].getName())) {
							studentIdx=i;
							break;
						}
					}
					if(studentIdx==-1) {
						System.out.println(studentName+"학생 정보가 없습니다.");
					}else {
						student[studentIdx].avg();
					}
					break;
				}else if(select==2) {
					System.out.println("과목을 입력하세요");
					System.out.print(">");
					String subject = sc.nextLine();
					switch(subject) {
					case "국어":
						for(int i=0;i<student.length;i++) {
							System.out.println(student[i].getName()+"학생의 국어 점수: "+student[i].getScore(0));
						}
						break;
					case "영어":
						for(int i=0;i<student.length;i++) {
							System.out.println(student[i].getName()+"학생의 영어 점수: "+student[i].getScore(1));
						}
						break;
					case "수학":
						for(int i=0;i<student.length;i++){
							System.out.println(student[i].getName()+"학생의 수학 점수: "+student[i].getScore(2));
						}
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
						break;

					}
				}else if(select==3){
					break;

				}else{
					System.out.println("잘못 입력하셨습니다.");
				}
				break;
			case 3:
				if(student[4]!=null) {
					for(int i=0;i<student.length;i++) {
						System.out.println(student[i].getName()+"학생 의 석차: "+student[i].getRanking());
					}
				}else {
					System.out.println("모든 학생의 성적이 입력되지 않았습니다.");
				}
				break;
			case 0:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}
	}
	public static void ranking() {
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<i;j++) {
				if(student[i].getSumScore()>student[j].getSumScore()) {
					student[j].setRanking();
				}else {
					student[i].setRanking();
				}
			}

		}

	}
}
