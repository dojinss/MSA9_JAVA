package Day07.Ex03_NestedClass;

public class NestedClass {
	public static void main(String[] args) {
		// 아우터 클래스인 A 객체 생성
		A a = new A();
		a.a = 10;
		a.b = 20;
		System.out.println("A클래스의 a변수 : " + a.a);
		System.out.println("A클래스의 b변수 : " + a.b);
		a.aMethod();
		
		// 이너 클래스인 B 객체 생성
		A.B b = a.new B();
		b.x = 30;
		b.y = 40;
		System.out.println("B클래스의 x변수 : " + b.x);
		System.out.println("B클래스의 y변수 : " + b.y);		
		b.bMethod();
	}
}
