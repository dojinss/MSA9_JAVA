package Day10_12.Ex02_Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 	이번 주 로또 추첨 일시를 구해보자.
 * 	<조건>
 * 	- 매일 06시 ~ 24시까지 판매
 * 	- 추첨일(토요일)에는 오후 8시에 판매 마감
 * 	- 추첨일(토요일) 오후 8시부터 다음일(일요일) 오전 6시까지 판매 정지
 * 
 * 	Q. 오늘 날짜/시간을 기준으로 로또를 구매한다면, 추첨일시는 언제인가?
 */
public class CalendarLotto {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int inputMonth = sc.nextInt();
		sc.nextLine();
		System.out.print("일 : ");
		int inputDay = sc.nextInt();
		sc.nextLine();
		
		
		
		cal.set(cal.get(Calendar.YEAR), (inputMonth-1), inputDay, 20,00,00);
		
		// 현재시각
		int nowDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int nowHour = cal.get(Calendar.HOUR_OF_DAY);
		
		
		// 판매시간 확인
		if(nowHour < 6 && nowDayOfWeek < 7) 
			System.err.println("판매시간이 아닙니다.");
		else if((nowHour < 6 || nowHour > 19) && nowDayOfWeek == 7 ) 
			System.err.println("판매시간이 아닙니다.");
		else {
		
			// 추첨시간 21시 00분 00초
			cal.set(Calendar.HOUR_OF_DAY, 21);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			// 1:일 2:월 3:화 4:수 5:목 6:금 7:토
			int dDayOfWeek = Calendar.SATURDAY - nowDayOfWeek;		// DAY_OF_WEEK 에서 7은 토요일, 토요일까지 며칠 남았는지 계산
			cal.add(cal.DAY_OF_MONTH, dDayOfWeek);					// 위에서 계산한 날짜 차이만큼 증가
			String dDay = sdf.format(cal.getTime());
			System.out.println("금주 추첨일 : " + dDay);
		}
		
		sc.close();
	}
}
