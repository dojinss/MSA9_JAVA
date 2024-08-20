package Day09.Ex07_Review.인터페이스;

public class BoardAccess implements BoardInterface{
	
	int count = 5;
	Board[] boardList = {
		new Board(1, "제목01","작성자01", "내용01", "2020","2020"),
		new Board(2, "제목02","작성자02", "내용02", "2020","2020"),
		new Board(3, "제목03","작성자03", "내용03", "2020","2020"),
		new Board(4, "제목04","작성자04", "내용04", "2020","2020"),
		new Board(5, "제목05","작성자05", "내용05", "2020","2020")
	};
	
	/**
	 * 	- 게시글 등록 -
	 * 	1. 매개변수로 넘겨받은 board 개체에 게시글 번호를 부여한다.
	 * 	2. 등록일자와 수정일자를 현재 날짜/시간으로 지정한다.
	 * 	3. board객체를 현재까지 등록된 배열 요소 다음 index에 저장한다.
	 * 	4. 등록된 board 객체를 반환한다.ㅣ
	 */
	@Override
	public Board create(Board board) {
		if(this.count >= 5) {
			System.err.println("게시글 목록이 꽉 찼습니다.");
			return null;
		}
		int boardNo = (++count);
		board.setNo(boardNo);
		String regDate = "2024/08/09 - 17:20";
		String updDate = "2024/08/09 - 17:20";
		board.setRegDate(regDate);
		board.setUpdDate(updDate);
		
		boardList[boardNo-1] = board;
		System.out.println("게시글이 등록 되었습니다.");
		
		return board;
	}
	/*
	 * - 게시글 목록 -
	 * 1. 게시글이 존재하는지 확인하고 1개의 게시글도 없으면 null 반환
	 * 2. 게시글이 존재하면, 전체 게시글 배열인 boardList 반환 
	 **/
	@Override
	public Board[] list() {
		if( boardList.length == 0 || this.count == 0 )	
			return null;
		else						
			return boardList;
	}
	/**
	 * 	- 게시글 조회 - 
	 * 	1. 넘겨받은 게시글 번호가 유효하지 않으면 null반환
	 *  2. 게시글 번호가 유효하면 번호에 해당 하는 boardList[]요소 반환
	 *  
	 */
	@Override
	public Board read(int no) {
		if( no > 0 && no < 6) 	
			return boardList[no-1];
		else if (boardList[no-1] == null) {
			System.out.println("게시글이 존재하지 않습니다.");
			return null;
		}
		else {
			System.out.println("유효하지 않은 글번호입니다.");
			return null;
		}
	}
	
	/**
	 * 	- 게시글 수정 - 
	 * 	1. 수정할 게시글 번호가 유효하지 않으면 0
	 * 	2. 수정할 게시글 번호가 유효하면
	 * 			- 해당하는 boardList[]의 요소 변경
	 * 			- 수정일자를 현재 날짜/시간으로 변경 
	 * 			- 수정된 게시글 수 1을 반환
	 */
	@Override
	public int update(Board board) {
		int no = board.getNo() - 1;
		if( boardList[no] != null ) {
			String updDate = "2024/08/09 - 18:20";
			board.setUpdDate(updDate);
			boardList[no] = board;
			System.out.println("게시글이 수정 되었습니다.");
			return 1;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * 	- 게시글 삭제 -
	 * 	1. 삭제할 게시글 번호가 유효하지 않으면 0반환
	 * 	2. 게시글이 하나도 존재하지 않으면 0반환
	 * 	3. 삭제할 게시글 번호가 유효하면
	 * 		- 번호에 해당하는 요소 null로 변경
	 * 		- 해당 index 다음의 요소들을 앞으로 한칸씩 당겨준다
	 * 		- 게시글 개수 count를 1 감소 시킨다
	 */
	@Override
	public int delete(int no) {
		if( boardList == null) {
			System.out.println("게시글이 없습니다.");
			return 0;
		}			
		if( boardList[no] != null ) {
			//boardList[no] = null;
			if(no <= boardList.length) {
				for (int i = no; i < (boardList.length-1) ; i++) {
					boardList[i] = boardList[i+1];
					if(boardList[i] != null)
						boardList[i].setNo(i+1);
				}
			}
			boardList[boardList.length-1] = null;				
			count--;
			System.out.println("게시글이 삭제 되었습니다.");
			return 1;
		}
		else {
			return 0;
		}
		
		
	}
	
}
