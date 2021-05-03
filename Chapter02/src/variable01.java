
public class variable01 {

	public static void main(String[] args) {
		/* 변수 변수명 첫글자는 문자, $와 _만 가능(숫자불가)
		 * 대소문자 구분
		 * 길이제한은 없다
		 * 예약어는 사용불가
		 * 
		 * 약속 : 여러단어를 붙여서 사용할때는 낙타체(첫글자는 소문자로, 단어합성이면 첫글자는 대문자)
		 * 
		 * 단어구분
		 * 1. 낙타체 (camelCase)   <<< 주로 사용
		 * example ) java702HongJavaScore
		 * 2. 뱀체 (snakeCase)
		 * example ) java_702_hong_java_score
		 * 3. 파스칼체
		 * example ) Java702HongJavaScore
		 * 
		 */
	int korScore;
	
	korScore = 80;
	System.out.printf("제 국어점수는 %d점 입니다. \n", korScore);
	System.out.println("제 국어점수는 80점 입니다.");
	System.out.println("제 국어점수는 "+korScore+"점 입니다.");
	
	int engScore;
	int mathScore;
	
	korScore = 65;
	engScore = 55;
	mathScore = 75;
	
	int sumScore;
	
	sumScore = korScore + engScore + mathScore;
	
	
	//변수 안에 데이터를 삭제하는 방법 : 가비지컬렉터[JVM]
	//기본형은 소문자시작, 참조형은 대문자시작임
	
	/* 형변환
	 * 묵시적 형변환 (자동형변환)
	 * char -> short의 크기는 같지만 char는 음수부분이 없기때문에 int 형부터 가능하다
	 * 
	 */
	
	
	
	
	}

}
