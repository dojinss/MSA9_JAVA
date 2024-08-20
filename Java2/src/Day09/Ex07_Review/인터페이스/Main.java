package Day09.Ex07_Review.인터페이스;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		BoardAccess board = new BoardAccess();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 목록 보기");
			System.out.println("2. 글작성");
			System.out.println("3. 조회하기");
			System.out.println("4. 수정하기");
			System.out.println("5. 삭제하기");
			System.out.println("0. ---종료----");
			System.out.print("번호를 입력해 주세요. : ");
			try {
				int input = sc.nextInt();
				sc.nextLine();
				
				switch (input) {
				case 1:
					System.out.println(":::::: 목록 ::::::");
					if(board.list() == null) {
						System.out.println("게시글이 존재하지 않습니다.");
						System.out.println(":::::::::::::::::::");
						continue;
					}
					
					for (Board b : board.list()) {
						if(b == null) {
							System.out.println("없음");
							continue;
						}
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
					cb.setTitle(sc.next());
					System.out.print("작성자 : ");
					cb.setWriter(sc.next());
					System.out.print("내용 : ");
					cb.setContent(sc.next());
					board.create(cb);
					System.out.println();
					break;
				case 3:
					System.out.print("조회할 글번호를 입력해주세요 : ");
					int rNo = sc.nextInt();
					sc.nextLine();
					Board rBoard = board.read(rNo);
					System.out.println(":::::: 조회 ::::::");
					System.out.println("제목 \t: " + rBoard.getTitle());
					System.out.println("작성자 \t: " + rBoard.getWriter());
					System.out.println("작성시간 \t: " + rBoard.getRegDate());
					System.out.println("수정시간 \t: " + rBoard.getUpdDate());
					System.out.println("[내용]");
					System.out.println(rBoard.getContent());
					System.out.println(":::::::::::::::::");
					break;
				case 4:
					System.out.print("수정할 글번호를 입력해주세요 : ");
					int uNo = sc.nextInt();
					sc.nextLine();
					Board[] list = board.list();
					Board uBoard = list[uNo-1]; 

					System.out.print("바꿀 제목 : ");
					uBoard.setTitle(sc.next());
					
					System.out.print("바꿀 내용 : ");
					uBoard.setContent(sc.next());
					
					board.update(uBoard);
					break;
				case 5:
					System.out.print("삭제할 글번호를 입력해주세요 : ");
					int dNo = sc.nextInt();
					sc.nextLine();
					System.out.println(dNo + "번 글을 정말 삭제하시겠습니까 ? Y/N");
					String str1 = sc.next();
					char[] check = str1.toCharArray();
					if(check[0] == 'Y' || check[0] == 'y')
						board.delete(dNo-1);
					System.out.println();
					break;
				}
				
				if(input == 0) break;
			} catch (Exception e) {
				sc.nextLine();
				e.printStackTrace();
				System.out.println();
				System.err.println("0~5 사이 정수만 입력가능합니다.");
				continue;
			}
			
		} while (true);
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}
	
}
