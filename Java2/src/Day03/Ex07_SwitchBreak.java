package Day03;
import java.util.Scanner;
public class Ex07_SwitchBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력  : ");
		int num = sc.nextInt();
		// 입력 받은 정수를 5로 나눈 나머지가 
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**"
		// switch문을 사용
		int checkNum = num % 5;
		
		switch (checkNum) {
			case 0:
			case 1:
				System.out.println("*");
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("**");
				break;
			default:
				System.out.println("정수만 입력가능");
				break;
		}
		
		sc.close();

	}
}
