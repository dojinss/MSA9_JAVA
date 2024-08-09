package Day01;

// 외부 클래스를 포함시키는 키워드
// [작성법] import 패키지.클래스명;
import java.util.Scanner;

// import 하는법
// 1. 클래스 			: ctrl + space
// 2. 전체 import		: ctrl + shift + O 

public class Ex03_Scanner {
	// main
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt(); // nextInt() : 정수 하나를 입력받는 메소드

		System.out.println("a : " + a);

		// close() : Scanner 에 할당된 메모리 해제하는 메소드;
		sc.close();

		// sc.nextInt();
		// Scanner 객체를 해제한 이후에는 더이상 입력을 받을수없다.
	}
}
