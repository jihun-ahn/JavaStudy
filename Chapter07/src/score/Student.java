package score;

public class Student {
	private String name;
	private int[] score = new int[3];
	private int sumScore;
	private double avg;
	private int ranking=1;
	
	public Student(String name, int[] score) {
		this.name=name;
		this.score=score;
		setSumScore();
	}
	public int getScore(int a) {
		return score[a];
	}
	

	private void setSumScore() {
		for(int i=0;i<score.length;i++) {
			sumScore+=score[i];
		}
	}
	
	public int getSumScore() {
		return sumScore;
	}
	
	public void avg() {
		avg=Math.round((sumScore*10/((double)(score.length))))/10.0;
		System.out.println("이름: "+name);
		System.out.println("국어 점수: "+score[0]);
		System.out.println("영어 점수: "+score[1]);
		System.out.println("수학 점수: "+score[2]);
		System.out.println("총점: "+sumScore);
		System.out.println("합계: "+avg);
	}
	
	public String getName() {
		return name;
	}
	
	public int getRanking() {
		return ranking;
	}
	public void setRanking() {
		ranking+=1;
	}

}
