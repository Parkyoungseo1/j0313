package api8_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T1_Date {
	public static void main(String[] args) {
		// Date객체
		Date now = new Date();
		System.out.println("1.오늘의 날짜(기본형식) : " + now);
		
		// 날짜객체를 문자화 : toString()
		String strnow = now.toString();
		System.out.println("2.오늘의 날짜(문자형식) : " + strnow);
		System.out.println();
		
		// 날짜형식을 사용자 지정에 따라서 변경 : SimpleDateFormat()
		// 매개변수 : 년도(yy, yyyy), 월(M), 일(d), 시간(h,H), 분(m), 초(s)
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strnow1 = sdf.format(now);
		System.out.println("기본 날짜 시간 포맷 : " + strnow1);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strnow1 = sdf.format(now);
		System.out.println("yyyy-MM--dd : " + strnow1);
		
		sdf = new SimpleDateFormat("MM/dd/yyyy");
		strnow1 = sdf.format(now);
		System.out.println("MM/dd/yyyy : " + strnow1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strnow1 = sdf.format(now);
		System.out.println("yyyy년 MM월 dd일 : " + strnow1);
		
		sdf = new SimpleDateFormat("yy년 M월 d일");
		strnow1 = sdf.format(now);
		System.out.println("yy년 M월 d일 : " + strnow1);
		System.out.println();
		
		sdf = new SimpleDateFormat("hh:mm:ss");
		strnow1 = sdf.format(now);
		System.out.println("hh:mm:ss : " + strnow1);
		
		sdf = new SimpleDateFormat("h:m:s");
		strnow1 = sdf.format(now);
		System.out.println("h:m:s : " + strnow1);
		
		sdf = new SimpleDateFormat("HH:m:s");
		strnow1 = sdf.format(now);
		System.out.println("HH:m:s : " + strnow1);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		strnow1 = sdf.format(now);
		System.out.println("yyyy-MM-dd HH:mm:ss : " + strnow1);
		System.out.println("오늘날짜 : " + strnow1.substring(0,10));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		strnow1 = sdf.format(now);
		System.out.println("yyyy.MM.dd HH:mm:ss : " + strnow1);
		
		sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		strnow1 = sdf.format(now);
		System.out.println("yyyy년MM월dd일 HH시mm분ss초 : " + strnow1);
		System.out.println();
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 이번달의 d번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
		System.out.println(sdf.format(now));
	}
}
