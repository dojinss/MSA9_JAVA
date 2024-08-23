package Day10_12.Ex01_Lang;

public class StringBuilderEx {
	public static void main(String[] args) {
		// StringBuilder
		// : 문자열을 변경할 수 있는 클래스
		// * StringBuffer			: 멀티 스레드 환경에서 동기화 O
		// * StringBuilder			: 멀티 스레드 환경에서 동기화 X
		StringBuilder sb = new StringBuilder();
		
		sb.append("더조은");
		sb.append("아카데미");
		System.out.println(sb);
		
		sb.insert(7, "학원");
		
		// Char는 작은 따옴표 [']로 묶어줘야한다 ["] 큰 따옴표는 에러가 난다
		sb.setCharAt(0, 'T');
		
	}
}
