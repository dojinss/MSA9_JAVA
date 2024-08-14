package Day07.Review;
/*
 * 
 * 
 * 
 * 
 * 
*/
public class Ex04_Lotto {
	
	public static void main(String[] args) {
		
		// Math.random() : 0.xxxxx ~ 0.9xxxxxx 사이의 난수를 반환하는 메소드
//		double random = Math.random();
		
		//System.out.println(random);
		
		// 1~6 주사위
		
//		for (int i = 0; i < 100; i++) {
//			int dice = (int)(Math.random() * 6) + 1;
//			if(dice > 6 || dice < 1) {
//				System.err.println("범위를 벗어남");
//				break;
//			}
//			System.out.println(dice);
//		}
		
		// 공식 : (int) (Math.random() * [개수]) + [시작숫자]
		
		// 1~20
//		System.out.println("::::::::::::::::");
//		System.out.println("1 ~ 20 까지 랜덤");
//		for (int i = 0; i < 100; i++) {
//			int dice = (int)(Math.random() * 20) + 1;
//			if(dice > 20 || dice < 1) {
//				System.err.println("범위를 벗어남");
//				break;
//			}
//			System.out.println(dice);
//		}
		
		// -20 ~ 20
//		System.out.println("::::::::::::::::");
//		System.out.println("-20 ~ 20 까지 랜덤");
//		for (int i = 0; i < 100; i++) {
//			int dice = (int)(Math.random() * 41) - 20;
//			if(dice > 20 || dice < (-20)) {
//				System.err.println("범위를 벗어남");
//				break;
//			}
//			System.out.println(dice);
//		}
		
		// 1 ~ 45 랜덤수 6개 배열에 넣기
		System.out.println("::::::::::::::::");
		System.out.println(" 1 ~ 45 까지 랜덤수 6개");
		int[] num = new int[6];
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45 ) + 1;
			for (int j = 0; j < i-1; j++) {
				if(num[i] == num[j] && i != j) {
					i--;
				}
			}
		}
		
		
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	}
}
