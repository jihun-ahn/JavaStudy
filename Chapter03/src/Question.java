
public class Question {

	public static void main(String[] args) {
	//1번
	int width;
	int height;
	int square;

	width = 3;
	height = 6;
	square = width * height;
	System.out.println("가로가 3 세로가 6인 사각형의 넓이 : "+square);
	
	//2번
	double triangle;
	triangle = (width * height)/2.0;
	System.out.println("가로가 3 세로가 6인 삼각형의 넓이 : "+triangle);
	
	//3번
	int score1;
	int score2;
	int score3;
	double sumScore;
	score1 = 40;
	score2 = 30;
	score3 = 10;
	sumScore = (score1 + score2 + score3);
	System.out.printf("성적이 40, 30, 10일때 평균 : %f \n", (sumScore/3.0));
	
	//4번
	int salary;
	salary = 100;
	System.out.println("월급이 100원일때 연봉(세금20%) : "+(salary*0.8*12));
	
	//5번
	int sec;
	int minute;
	int second;
	sec = 286;
	minute = sec/60;
	second = sec%60;
	System.out.printf("%d초는 %d분 %d초 \n", sec, minute, second);
	
	
	//7번
	/*	
 	int won;
	won = 176840;
	
	int won50000;
	int won10000;
	int won5000;
	int won1000;
	int won500;
	int won100;
	int won50;
	int won10;	

	won50000 = won/50000;
	won10000 = won%50000/10000;
	won5000 = won%50000%10000/5000;
	won1000 = won%50000%10000%5000/1000;
	won500 = won%50000%10000%5000%1000/500;
	won100 = won%50000%10000%5000%1000%500/100;
	won50 = won%50000%10000%5000%1000%500%100/50;
	won10 = won%50000%10000%5000%1000%500%100%50/10;
	System.out.printf("176840원을 화폐매수대로 출력 : \n");
	System.out.printf("5만원권 %d장, 만원권 %d장, 5천원권 %d장, 천원권 %d장, 오백원 %d개, 백원 %d개, 오십원%d개, 십원 %d개 \n", won50000, won10000, won5000, won1000, won500, won100, won50, won10);
 	*/
	 int money = 176840;
	 int ohMan;
	 int Man;
	 int ohCheon;
	 int cheon;
	 int ohBaek;
	 int baek;
	 int ohSip;
	 int sip;
	 int unit = 50000;
	 
	 	ohMan = money / unit;
		money %= unit;
		unit /= 5;

		Man = money / unit;
		money %= unit;
		unit /= 2;
		
		ohCheon = money / unit;
		money %= unit;
		unit /= 5;

		cheon = money / unit;
		money %= unit;
		unit /= 2;
		
		ohBaek = money / unit;
		money %= unit;
		unit /= 5;

		baek = money / unit;
		money %= unit;
		unit /= 2;
		
		ohSip = money / unit;
		money %= unit;
		unit /= 5;

		sip = money / unit;
		money %= unit;
		unit /= 2;
		
		System.out.println("5만원권 "+ohMan+"장, 만원권 "+Man+"장, 오천원권 "+ohCheon+"장, 천원권 "+ohMan+"장, 5백원권 "+ohBaek+"개, 백원권 "+baek+"개, 5십원권 "+ohSip+"개, 십원권 "+sip+"개");
	
	//8번
	int num;
	char grade;
	
	num = 70;
	grade = (((num >= 90) ? 'A' : (num >= 80) ? 'B' : (num >= 70) ? 'C' : (num >= 60) ? 'D' : 'F'));
	System.out.printf("점수 : %d, 점수에 따른 등급 : %s \n", num, grade);
	}

}
