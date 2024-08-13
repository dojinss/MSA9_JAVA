package Day07.Review;

public class Ex02_ThreeSixNine {
	public static void main(String[] args) {
		// 정수 1~100까지 정수를 반복하여 출력하면서,
		// 해당 수가 3또는 6또는 9가 될 때는
		// 자리수마다 369가 되는 개수만큼 정수 대신 "*" 출력하는 프로그램을 작성하시오
		
		int start = 1;
		int end = 100;
		int[] checkNum = {3,6,9};
		boolean check = true;
		for (int i = start; i <= end; i++) {
			check = true;
			for (int j = 0; j < checkNum.length; j++) {
				if( i % 10 == checkNum[j])	{check = false;System.out.print("*");}
				if( i / 10 == checkNum[j])	{check = false;System.out.print("*");}
			}
			if(check) System.out.print(i + "\t");
			else System.out.print("["+i+"]");
			System.out.println();
		}
	}
}
