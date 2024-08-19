package Day09.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  예외처리
 *  InputMismatchException
 *  : 입력 시, 자료형이 입력 메소드와 일치하지 않아서 발생하는 예외 상황
 *  ex) nextInt() 에 대하여 정수를 입력하지 안ㄶ고 다른 자료형(문자 등)을 일벽한 경우
 */
public class InputMismatch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		String menuName = "";
		
		do {
			System.out.println("1. Java");
			System.out.println("2. Oracle DB");
			System.out.println("3. HTML CSS JS");
			System.out.println("4. Servlet/JSP");
			System.out.println("5. Spring Framework");
			System.out.println("6. React");
			System.out.println("7. Flutter");
			System.out.println("0. 종료");
			
			// 예외 메시지		: java.utill.InputMismatchException
			// 예외 상황		: 숫자 입력 메소드에 문자를 입력한경우
			try {
				System.out.print("입력 : ");
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();	// 문자또는 입력값 + enter 을 할경우 enter(또는 공백)로 인한 분류가 사라지지 않아서 입력값이 사라지지 않아서 그것을 초기화
				System.err.println("(0~7)번 사이의 정수를 입력해주세요.");
				continue;
			}
			if (menuNo == 0) break;
			
			switch (menuNo) {
				case 1: menuName = "Java";					break;
				case 2: menuName = "Oracle DB";				break;
				case 3: menuName = "HTML CSS JS";			break;
				case 4: menuName = "Servlet/JSP";			break;
				case 5: menuName = "Spring Framework";		break;
				case 6: menuName = "React";					break;
				case 7: menuName = "Flutter";				break;
			}
			System.out.println(":::::::::::::");
			System.out.println(menuName);
			System.out.println(":::::::::::::");
		} while (true);
		
		sc.close();
	}
}
