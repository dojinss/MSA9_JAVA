package Day16.Ex02_CharacterStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderEx {
	public static void main(String[] args) {
		
		String filePath = "sample.txt";
		
		try (
			// 해당 객체를 사용하여, 문자 단위로 데이터 출력
			FileReader fr = new FileReader(filePath);
			// 해당 객체를 이용하여, 데이터 출력 성능 향상
			BufferedReader br = new BufferedReader(fr);
		) {
//			while (br.ready()) {
//				System.out.print((char)br.read());
//			}
			String text;
			// readLine() : 파일의 문자 데이터를 한 줄씩 입력
			//			    데이터가 더이상 없으면 null 반환
			while( (text = br.readLine()) != null ) {
				System.out.println(text);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
