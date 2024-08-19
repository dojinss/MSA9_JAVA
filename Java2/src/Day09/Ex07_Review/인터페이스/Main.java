package Day09.Ex07_Review.인터페이스;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		BoardAccess board = new BoardAccess();
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("1. 목록 보기");
			System.out.println("2. 글작성");
			System.out.println("3. 수정하기");
			System.out.println("4. 삭제하기");
			System.out.println("0. ---종료----");
			System.out.print("번호를 입력해 주세요. : ");
			int input = sc.nextInt();
			switch (input) {
				case 1:
					System.out.println(":::::: 목록 ::::::");
					for (Board b : board.list()) {
						System.out.print(b.getNo() + ". ");
						System.out.print("[" + b.getWriter() + "]");
						System.out.print(b.getTitle());
						System.out.print("[" + b.getRegDate() + "]");
						System.out.println();
					}
					System.out.println(":::::::::::::::::::");
					break;
				case 2:
					Board cb = new Board();
					System.out.print("제목 : ");
					cb.setTitle(sc.nextLine());
					System.out.println();
					System.out.print("내용 : ");
					cb.setContent(sc.nextLine());
					board.create(cb);
					System.out.println();
					break;
				case 3:break;
				case 4:break;
			}
			
			if(input == 0) break;
		} while (true);
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}
	
}
