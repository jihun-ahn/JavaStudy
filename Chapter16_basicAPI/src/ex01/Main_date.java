package ex01;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Main_date {

	public static void main(String[] args) {
		Date now = new Date();

		System.out.println(now.toString());
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String date = sdf.format(now);
		System.out.println(date);
		
	
	}
	
	

}
