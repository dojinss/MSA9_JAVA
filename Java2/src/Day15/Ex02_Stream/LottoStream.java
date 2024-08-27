package Day15.Ex02_Stream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoStream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.print("["+(i+1)+"게임] : ");
			Set<Integer> lottoSet = new HashSet<Integer>();
			
			// 랜덤 수 6개를 대입
			while( lottoSet.size() < 6 ) { // 6만큼 찰때까지 반복 -->
				int rand = new Random().nextInt(45) + 1;
				lottoSet.add(rand);
			}// <-- 끝
			// 스트림을 사용하여 정렬 + 출력
			lottoSet.stream()						// 스트림 객체 생성
				 	.sorted()						// 정렬
				 	.forEach( lotto -> System.out.print((lotto<10?" ":"")+lotto + " ") );	// 전체 반복
			System.out.println();
		}
		sc.close();
	}
}
