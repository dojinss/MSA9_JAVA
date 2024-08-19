package Day09.Ex07_Review.인터페이스;

public class BoardAccess implements BoardInterface{
	
	int count = 5;
	Board[] boardList = {
		new Board("제목 01","작성자 01", "내용 01"),
		new Board("제목 02","작성자 02", "내용 02"),
		new Board("제목 03","작성자 03", "내용 03"),
		new Board("제목 04","작성자 04", "내용 04"),
		new Board("제목 05","작성자 05", "내용 05")
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
		
		int boardNo = count;
		board.setNo(boardNo);
		String regDate = "2024/08/09 - 17:20";
		String updDate = "2024/08/09 - 17:20";
		board.setRegDate(regDate);
		board.setUpdDate(updDate);
		
		boardList[count++] = board;
		System.out.println(board);
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
		if( boardList[0] == null )	return null;
		else						return boardList;
	}
	/**
	 * 	- 게시글 조회 - 
	 * 	1. 넘겨받은 게시글 번호가 유효하지 않으면 null반환
	 *  2. 게시글 번호가 유효하면 번호에 해당 하는 boardList[]요소 반환
	 *  
	 */
	@Override
	public Board read(int no) {
		if(boardList[no] == null) 	return null;
		else 						return boardList[no];
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
		if( boardList[board.getNo()] != null ) {
			String updDate = "2024/08/09 - 18:20";
			board.setUpdDate(updDate);
			boardList[board.getNo()] = board;
			System.out.println(board);
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
		if( boardList[no] != null ) {
			boardList[no] = null;
			for (int i = (no + 1); i < (boardList.length - 1) ; i++) {
				boardList[i] = boardList[i+1];
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
