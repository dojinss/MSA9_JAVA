package Day10.Ex01_Lang;

public class StringBufferEx {
	public static void main(String[] args) {
		// StringBuffer
		// : 문자열을 조작하는 클래스
		// - 문자열 추가/수정/삭제하는 메소드를 제공
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		// 문자열 추가
		// append("우가 문자열") : 문자열 마지막에 새 문자열을 추가하는 메소드
		sb.append(" is JAVA");
		System.out.println(sb);
		
		// 문자열 추가(index)
		// insert(index, "추가 문자열") : 지정한 index에 문자열을 추가하는 메소드
		sb.insert(7, " real");
		System.out.println(sb);
		
		// 문자열 수정(대체)
		// replace(시작 index, 끝index + 1, "대체문자열")
		// : 시작iondex [포함]부터 끝 index [이전]까지 문자열을 대체 문자열로 수정하는 메소드
		sb.replace(8, 12, "good");
		System.out.println(sb);
		
		
		// 문자열 삭제
		// 인덱스1[포함] ~ 인덱스2[이전] 까지 문자열 삭제
		sb.delete(8, 13);
		System.out.println(sb);
		
		
		// 문자열 길이 지정
		// 해당 숫자 문자열 길이를 지정하는 메소드 [index와 다름 1부터 시작 4입력하면 4글자]
		sb.setLength(4);
		System.out.println(sb);
	}
}
