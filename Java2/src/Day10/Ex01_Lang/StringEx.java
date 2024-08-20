package Day10.Ex01_Lang;

import java.util.Scanner;

public class StringEx {
	
	public static void main(String[] args) {
		String str1 = " TheJoEun Academy ";
		String str2 = " theJoEun Academy ";
		// index는 0부터 시작 2를 호출하거나 반환된거면 3번째
		System.out.println( str1.charAt(2) );				// index에 있는 문자 호출
		System.out.println( str1.concat(str2) );			// 문자열 연결
		System.out.println( str1.contains( "Academy" ) );	// 문자열 포함 여부 t/f
		System.out.println( str1.equals(str2) );			// 문자열 일치 여부 t/f
		System.out.println( str1.equalsIgnoreCase(str2) );	// 대소문자 구분없이 문자열 일치 여부 t/f
		System.out.println( str1.indexOf("A") );			// 해당 문자의 첫 index 반환, 없으면 -1
		System.out.println( str1.lastIndexOf("e") );		// 해당 문자의 마지막 index 반환, 없으면 -1		
		System.out.println( str1.trim() );					// 문자열 양쪽 공백 제거
		System.out.println( str1.length() );				// 문자열 길이 (글자수)[공백포함]
		System.out.println( str1.substring(10) );			// index 앞의 문자열을 자르고, 뒤의 문자열 반환
		System.out.println( str1.substring(10, 17) );		// index1 ~ (index2-1)까지 반환
															// index 10번째 부터 16번째 까지의 문자열
		
//		String[] sp = str1.split("");		// ""(빈문자열)을 기준으로 하면, 한그자씩 배열오소로 반환
//		for (String string : sp) {
//			System.out.println(string);
//		}
		
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			System.out.println(ch);
		}
		
		// String.split( 정규표현식 )
		// : 정규표현식에서 + 기호는 산술연산자가 아닌 다른 의미로 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사칙 연산 : ");
		String cal = sc.nextLine();
		String[] num = cal.split("\\+");
		
		if( cal.contains("+") ) {
			int a = Integer.parseInt( num[0] );
			int b = Integer.parseInt( num[1] );
			
			int result = a + b;
			System.out.println(result);
		}
		
		System.out.println("피연산자1 : " + num[0]);
		System.out.println("피연산자2 : " + num[1]);
		sc.close();
	}
}
