package Day07.Review;

import java.util.Scanner;

/*
 * 더조은컴퓨터아카데미에서 김조은 팀장에게 예산을 주고
 * 에어컨을 구매하라고 지시하였다.
 * 이때 에어컨 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비			: 657,825
 * 50,000		: 13 ea
 * 10,000		: 0
 * 5,000		: 1 ea
 * 1,000		: 2 ea
 * 500			: 1 ea
 * 100			: 3 ea
 * 50			: 0
 * 10			: 2 ea
 * 5			: 1 ea
 * 1			: 0
 * 위와 같이 입력하면,
 * 큰 홮페단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
*/
public class Ex03_화폐매수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1,5,10
		int[] coins 	 = {1,5,10,50,100,500,1000,5000,10000,50000};
		
		System.out.print("구매비 : ");
		int inputCoin 	= sc.nextInt();
		int count		= 0;
		for (int i = coins.length - 1; i >=0 ; i--) {
			count	= inputCoin / coins[i];
			inputCoin = inputCoin % coins[i];
			String mString = String.format("%,d", coins[i]);
			if(coins[i] >= 1000)
				System.out.println( mString + "원권 화폐 개수 : " + count + "장");
			else
				System.out.println( coins[i] + "원짜리 동전 개수 : " + count + "개");
		}
		
		
		sc.close();
	}
}
