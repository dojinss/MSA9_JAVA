package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {
	public static void main(String[] args) {
		// 메뉴판
		// * 변수 선언 : 메뉴 번호, 메뉴 이름
		int i = 1;
		int menuNo = 0;
		int menuNo1Count = 0;
		int menuNo2Count = 0;
		int menuNo3Count = 0;
		int menuNo4Count = 0;
		int menuNo5Count = 0;
		int menuTotalCount = 0;
		String menuName1 = "삼각김밥";
		String menuName2 = "규동";
		String menuName3 = "진라면";
		String menuName4 = "버거킹와퍼";
		String menuName5 = "마라탕";
		String menuName = "";
		
		Scanner sc = new Scanner(System.in);
		//유효성검사
		// 메뉴1~5일때문 가능
		do {			
			System.out.println(":::::::::: 메뉴판 ::::::::::");
			System.out.println("1. " + menuName1);
			System.out.println("2. " + menuName2);
			System.out.println("3. " + menuName3);
			System.out.println("4. " + menuName4);
			System.out.println("5. " + menuName5);
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 : ");
			
			menuNo = sc.nextInt();
			if(menuNo == 0) break;
			
			switch (menuNo) {
				case 1:menuName = menuName1;menuNo1Count++;break;
				case 2:menuName = menuName2;menuNo2Count++;break;
				case 3:menuName = menuName3;menuNo3Count++;break;
				case 4:menuName = menuName4;menuNo4Count++;break;
				case 5:menuName = menuName5;menuNo5Count++;break;
				default:break;
			}
			System.out.println("--------------");
			if(menuNo < 6 && menuNo > 0) {
				menuTotalCount++;
				System.out.println(menuName + "(을/를) 주문하셨습니다.");
			}else {
				System.out.println("(0~5)번의 숫자만 입력해주세요.");
			}
			System.out.println("--------------");
			// 0번 입력시, 메뉴판을 종료하도록 해보세요.
		}while( menuNo != 0 );
		// 주문한 메뉴 개수를 출력하세요
		// 각자 갯수 저장 총갯수
		if(menuNo1Count != 0)
			System.out.println("1번 메뉴 (" + menuName1 + ")의 주문수는 ["+menuNo1Count+"]개 입니다.");
		if(menuNo2Count != 0)
			System.out.println("2번 메뉴 (" + menuName2 + ")의 주문수는 ["+menuNo2Count+"]개 입니다.");
		if(menuNo3Count != 0)
			System.out.println("3번 메뉴 (" + menuName3 + ")의 주문수는 ["+menuNo3Count+"]개 입니다.");
		if(menuNo4Count != 0)
			System.out.println("4번 메뉴 (" + menuName4 + ")의 주문수는 ["+menuNo4Count+"]개 입니다.");
		if(menuNo5Count != 0)
			System.out.println("5번 메뉴 (" + menuName5 + ")의 주문수는 ["+menuNo5Count+"]개 입니다.");
		if(menuTotalCount !=0)
			System.out.println("총 주문수는 ["+menuTotalCount+"]개 입니다.");
			
		System.out.println("메뉴판을 종료합니다.");
		
		

		sc.close();

	}
}
