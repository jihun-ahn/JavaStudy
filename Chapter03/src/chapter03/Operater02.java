package chapter03;

public class Operater02 {

	public static void main(String[] args) {
	//1. 가로가 3이고 세로가 6인 사각형의 넓이	
int width = 3;
int height = 6;

int lecArea = width * height;

System.out.println("사각형의 넓이 : "+lecArea);
System.out.println("--------------------------");

//2. 가로가 3이고 세로가 6인 삼각형의 넓이
double triArea = (width * height)/2.0;
System.out.println("삼각형의 넓이 : "+triArea);
System.out.println("--------------------------");


//3. 성적이 40, 30, 10나왔다 평균은?
// sys 말고 int 이런걸로 푸는게 좋음. 위에꺼처럼
// int 같은걸로 계산하고 sys는 출력하기용도로 사용

double c = 40;
double d = 30;
double e = 10;

System.out.println((c+d+e)/3 + "점");

int f = 100;
System.out.print("내 월급은");
System.out.println((f*12)-(f*(0.2*12)) +"원");

//7. 176840원을 화폐매수대로 출력
int money = 176840;
int unit = 50000;
int ohman = money/unit;      // 오만원 권 개수 : 3
money %= unit;  //오만원 권을 제외한 금액 : 26840 
unit /= 5;      //unit을 만원권으로 설정 : 10000


int man = money/unit;      // 만원 권 개수 :2
money %= unit;  //만원 권을 제외한 금액 : 6840
unit /= 5;      //unit을 오천원권으로 설정 : 5000

int ohcheon = money/unit;      // 오천원 권 개수 :1
money %= unit;  //오천 권을 제외한 금액 : 1840
unit /= 5;      //unit을 천원권으로 설정 : 1000

int cheon = money/unit;      // 천원원 권 개수 :1
money %= unit;  //천원 권을 제외한 금액 : 840
unit /= 5;      //unit을 오백원권으로 설정 : 500

int ohbeak = money/unit;      // 오백원원 권 개수 :1
money %= unit;  //오백원 권을 제외한 금액 : 340
unit /= 5;      //unit을 백원권으로 설정 : 100

int beak = money/unit;      // 백원원 권 개수 :3
money %= unit;  //백원 권을 제외한 금액 : 40
unit /= 5;      //unit을 오십원권으로 설정 : 50

//int ohsip = money/unit;      // 오십원 권 개수 :1
//money %= unit;  //오십 원권을 제외한 금액 : 340
//unit /= 5;      //unit을 십원권으로 설정 : 100

//int sip = money/unit;      // 십원 권 개수 :4

System.out.println("오만원권 : "+ohman);


//8.점수에따라 등급을 출력해보자.

int num = 70;
char grade = (num>=90)?'A':((num>=80)?'B':((num>=70)?'C':((num>=60)?'D':'F')));

	}
}
