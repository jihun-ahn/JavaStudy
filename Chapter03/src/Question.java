
public class Question {

	public static void main(String[] args) {
	//1��
	int width;
	int height;
	int square;

	width = 3;
	height = 6;
	square = width * height;
	System.out.println("���ΰ� 3 ���ΰ� 6�� �簢���� ���� : "+square);
	
	//2��
	double triangle;
	triangle = (width * height)/2.0;
	System.out.println("���ΰ� 3 ���ΰ� 6�� �ﰢ���� ���� : "+triangle);
	
	//3��
	int score1;
	int score2;
	int score3;
	double sumScore;
	score1 = 40;
	score2 = 30;
	score3 = 10;
	sumScore = (score1 + score2 + score3);
	System.out.printf("������ 40, 30, 10�϶� ��� : %f \n", (sumScore/3.0));
	
	//4��
	int salary;
	salary = 100;
	System.out.println("������ 100���϶� ����(����20%) : "+(salary*0.8*12));
	
	//5��
	int sec;
	int minute;
	int second;
	sec = 286;
	minute = sec/60;
	second = sec%60;
	System.out.printf("%d�ʴ� %d�� %d�� \n", sec, minute, second);
	
	
	//7��
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
	System.out.printf("176840���� ȭ��ż���� ��� : \n");
	System.out.printf("5������ %d��, ������ %d��, 5õ���� %d��, õ���� %d��, ����� %d��, ��� %d��, ���ʿ�%d��, �ʿ� %d�� \n", won50000, won10000, won5000, won1000, won500, won100, won50, won10);
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
		
		System.out.println("5������ "+ohMan+"��, ������ "+Man+"��, ��õ���� "+ohCheon+"��, õ���� "+ohMan+"��, 5����� "+ohBaek+"��, ����� "+baek+"��, 5�ʿ��� "+ohSip+"��, �ʿ��� "+sip+"��");
	
	//8��
	int num;
	char grade;
	
	num = 70;
	grade = (((num >= 90) ? 'A' : (num >= 80) ? 'B' : (num >= 70) ? 'C' : (num >= 60) ? 'D' : 'F'));
	System.out.printf("���� : %d, ������ ���� ��� : %s \n", num, grade);
	}

}
