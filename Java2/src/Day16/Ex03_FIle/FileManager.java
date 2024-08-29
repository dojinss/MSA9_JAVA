package Day16.Ex03_FIle;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileManager {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int menuNo;  // 메뉴 번호
		
		do {
			menu();		// 메뉴판 출력
			
			menuNo = sc.nextInt();
			sc.nextLine();
			
			if ( menuNo == 0 ) break; 	
			
			// 파일 경로 입력
			System.out.print("파일 경로 : ");
			String filePath = sc.nextLine();
			
			// 메뉴 선택
			switch(menuNo) {
				case 1: // 디렉토리 생성
						makeDirectory(filePath);
						break;
				case 2: // 디렉토리 파일 목록
						listDirectory(filePath);
						break;
				case 3: // 파일 정보 조회
						fileInfo(filePath);
						break;
				case 4: // 파일 삭제
						deleteFile(filePath);
						break;
				case 5: // 디렉토리 삭제
						deleteDirectory(filePath);
						break;
			}
			
		} while (true);
		System.out.println("프로그램을 종료합니다.");
	}
	/**
	 * 메뉴 출력 메소드
	 */
	public static void menu() {
		System.out.println("::::: 파일관리 :::::");
		System.out.println("1. 디렉토리 생성");
		System.out.println("2. 디렉토리 파일 목록");
		System.out.println("3. 파일 정보 조회");
		System.out.println("4. 파일 삭제");
		System.out.println("5. 디렉토리 삭제");
		System.out.println("0. 종료");
		System.out.println("==================");
		System.out.print("입력>>");
	}
	/**
	 * 디렉토리 생성
	 * @param filePath
	 */
	private static void makeDirectory(String filePath) {
		// 파일 객체 생성 방법
		// 1. File 객체명 = new File(파일경로);
		// 2. File 객체명 = new File(폴더경로, 파일명);
		File file = new File(filePath);
		
		// 폴더 생성
		// mkdir()		: 생성할 경로의 상위 경로까지 기존 디렉토리가 존재해야한다.
		// mkdirs()		: 생성할 경로의 상위 경로까지 디렉토리를 생성해준다.
		if ( file.mkdirs() ) {
			System.out.println("디렉토리 생성 성공!");
		}
		else {
			System.err.println("디렉토리 생성 실패!");
		}
		System.out.println("경로 : " + filePath);
	}
	/**
	 * 디렉토리의 파일 목록을 출력하는 메소드
	 * @param filePath
	 */
	private static void listDirectory(String filePath) {
		System.out.println(filePath);
		System.out.println("----------------------------------------------");
		File file = new File(filePath);
		File[] fileList = file.listFiles();		// 하위 경로의 파일목록을 file 배열로 반환
		
		System.out.println("파일명\t\t용량\t\t수정일자");
		for (File subFile : fileList) {
			long update = subFile.lastModified();
			Date date = new Date(update);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String updateDate = sdf.format(date);
			
			System.out.print( subFile.getName() + "\t" + (subFile.getName().length() < 7?"\t":""));
			System.out.print( "[" + subFile.length() + "]\t\t" );
			System.out.print( updateDate + "\t\t");
			System.out.println();
		}
		System.out.println("----------------------------------------------");
	}
	/**
	 * 파일 정보 조회
	 * @param filePath
	 */
	private static void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.print("파일 종류 : ");
		if ( file.isDirectory() ) System.out.print("디렉토리");
		if ( file.isFile() ) System.out.print("파일");
		System.out.println();
		
		long update = file.lastModified();
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate = sdf.format(date);
		
		System.out.print( "이름 : "+ file.getName() + "\n");
		System.out.print( "[" + file.length() + " Byte] " );
		System.out.print( updateDate + "");
		System.out.println();
	}
	/**
	 * 파일 삭제
	 * @param filePath
	 */
	private static void deleteFile(String filePath) {
		File file = new File(filePath);
		
		// 파일 존재 여부 확인
		if( file.exists() ) {
			// delete()
			// - 파일 삭제 성공 --> true
			// - 파일 삭제 실패 --> false
			// * 하위 경로에 파일이 존재하면 삭제가 되지 않는다.
			if( file.delete() ) System.out.println("파일 삭제 성공.");
			else System.err.println("파일 삭제 실패!");
		}
		else {
			System.err.println("파일이 존재하지 않습니다.");
		}
	}
	/**
	 * 디렉토리 삭제
	 * @param filePath
	 */
	private static void deleteDirectory(String filePath) {
		
		File file = new File(filePath);
		File[] fileList = file.listFiles();	// 하위 파일 목록
		
		// 하위 경로에 파일이 있으면, 하위 파일을 먼저 삭제
		if( fileList != null ) {
			//하위 경로의 파일들을 삭제
			for (File subFile : fileList) {
				// 재귀 호출 (재귀 함수; recusive)
				deleteDirectory( subFile.getPath() );
			}
		}
		
		// 폴더(파일) 삭제
		if ( file.delete() ) System.out.println( file.getName() + " 삭제 완료.");
		else System.err.println("폴더(파일) 삭제 실패!");
	}
}
