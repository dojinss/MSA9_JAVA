package Day10_12.Ex01_Lang;

public class MathEx {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);			// 원주율
		System.out.println(Math.E);				// 자연상수
		System.out.println(Math.ceil(3.125));	// 올림 : 해당 수보다 큰 정수 중 가장 작은 수
		System.out.println(Math.floor(3.75));	// 내림 : 해당 수보다 작은 정수중 가장 큰 수
		System.out.println(Math.sqrt(9));		// 제곱근
		System.out.println(Math.pow(3, 2));		// 3의 2제곱
		System.out.println(Math.exp(2));		// e의 2승
		System.out.println(Math.round(3.14));	// 반올림
		System.out.println("------------------------");
		
		// 로또 번호
		// Math.random()				: 0.0 보다 크거나 같고 1.0 보다 작은 임의의 실수
		// Math.random()				: 0.0XXXX ~ 0.9XXXXXX
		// 0.0XXXX ~ 0.9XXXXXX * 10 (+ 1) : 0 ~ 9 (1~10)					- 10 갸
		
		// [공식]
		// (int)(Math.random() * [개수] + [시작숫자])
		
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int rnd = (int)(Math.random() * 45 + 1);
			lotto[i] = rnd;
			// 중복 제거
			for (int j = 0; j < i; j++) {
				if(lotto[j] == rnd) {
					i--;
				}
			}
			
		}
		// 선택 정렬
		int temp = 0;
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		double[] arr = {90.22, 12.45, 33.22, 88.12, 70.45 };
		
		double max = Double.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
//			if(max < arr[i])
//				max = arr[i];
		}
		System.out.println("max : " + max);
	}
}
