package Day10_13.Ex02_Util;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		// 동전 던지기
		boolean rndTF = random.nextBoolean();
		System.out.println("동전 앞뒤 : " + rndTF);
		
		System.out.println("동전 던지기");
		if (rndTF) 	System.out.println("앞면");
		else 		System.out.println("뒷면");
		
		
		// 정수형 랜덤수
		// * 4bytes : 32bits (-21억 ~ 21억 ) 사이의 난수를 반환
		int fourByteRnd = random.nextInt();
		System.out.println("fourByteRandom : " + fourByteRnd);
		
		
		// [공식] nextInt(개수) + 시작 숫자
		// 주사위 던지기
		int dice = random.nextInt(6) + 1;
		System.out.println("주사위 : " + dice);
		
		
		// 로또
		int lotto = random.nextInt(45) + 1;
		System.out.println("로또번호 : " + lotto);
		
		// 실수형 랜덤수
		double rndDouble = random.nextDouble();
		System.out.println("실수형 랜덤 수 : " + rndDouble);
		
	}
}
