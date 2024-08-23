package Day13.Ex02_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {
	
	public static void main(String[] args) {
		// ArrayList 생성 - 쇼핑카트(장바구니)
		ArrayList<String> shopingCart = new ArrayList<String>();
		
		// 요소 추가 - add()
		shopingCart.add("아웃백 외식상품권 5만원권");
		shopingCart.add("BBQ 황금오리브 반반치킨");
		shopingCart.add("카카오 프렌즈 피규어");
		
		// 반복 출력
		System.out.println("::::: 장바구니 목록 :::::");
		for (String item : shopingCart) {
			System.out.println(item);
		}
		// 특정 위치에 요소 추가 - add(index, Value)
		shopingCart.add(1, "맥북 프로");
		System.out.println("::::: 위치에 요소 추가 :::::");
		System.out.println(shopingCart);
		
		// 요소 제거
		shopingCart.remove("카카오 프렌즈 피규어");
		System.out.println("::::: 요소 제거 :::::");
		System.out.println(shopingCart);
		
		// 요소 순서 확인
		String secondItem = shopingCart.get(1);
		System.out.println("::::: 요소 순서 확인 :::::");
		System.out.println("두 번째 아이템 : " + secondItem);
		
		// 요소 확인
		System.out.println("::::: 요소 제거 :::::");
		boolean hasMacBook = shopingCart.contains("맥북 프로");
		if (hasMacBook) {
			System.out.println("맥북 프로가 목록에 있습니다.");
		} else {
			System.out.println("해당 아이템이 업습니다.");
		}
		
		// 모든 요소 제거
		shopingCart.clear();
		System.out.println("::::: 모든 요소 제거 :::::");
		System.out.println(shopingCart);
		
		System.out.println("가지고 싶은 물건 5가지 입력하기");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			String item = sc.nextLine();
			shopingCart.add(item);
		}
		
		// 반복 1 - for
		System.out.println("반복 1 - for");
		for (int i = 0; i < shopingCart.size(); i++) {
			System.out.println( shopingCart.get(i));
		}
		System.out.println("==================");
		
		// 반복 2 - foreach
		System.out.println("반복 2 - foreach");
		for (String item : shopingCart) {
			System.out.println(item);
		}
		System.out.println("==================");
		
		// 반복 3 - Iterator (for) * for (atrl+space) 1번 옵션
		System.out.println("반복 3 - Iterator (for)");
		for (Iterator<String> iterator = shopingCart.iterator(); iterator.hasNext();) {
			String item = (String) iterator.next();
			System.out.println(item);
		}
		System.out.println("==================");
		
		// 반복 4 - Iterator (while)
		System.out.println("반복 4 - Iterator (while)");
		Iterator<String> it = shopingCart.iterator();
		while (it.hasNext()) {
			String item = (String) it.next();
			System.out.println(item);
		}
		System.out.println("==================");

		sc.close();
	}

}