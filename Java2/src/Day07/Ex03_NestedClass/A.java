package Day07.Ex03_NestedClass;

/*
 * 중첩 클래스
*/

// 아우터 클래스
public class A {

	int a,b;
	
	// 이너 클래스
	class B {
		int x,y;
		public void bMethod() {
			System.out.println("이너 클래스에서 아우터 클래스의 멤버 접근 가능");
			System.out.println("A클래스의 a변수 : " + a);
			System.out.println("A클래스의 b변수 : " + b);
		}
	}
	
	public void aMethod() {
		System.out.println("아우터 클래스에서 이너 클래스의 멤버 접근 불가");
		//(에러) System.out.println("B클래스의 x변수 : " + x);
		//(에러) System.out.println("B클래스의 y변수 : " + y);
	}
}
