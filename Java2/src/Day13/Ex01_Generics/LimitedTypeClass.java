package Day13.Ex01_Generics;

class X {}

class A extends X {}
class B extends A {}
class C extends A {}

// 타입 매개변수를 A 클래스와 그 하위 클래스로만 가능하도록 제한
class D <T extends A> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

// * Number 클래스 타입 매개변수로 사용가능하도록 제한
//   (Integer, Double 등 숫자 타입 클래스만 사용가능하도록 제한)
class E <T extends Number> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class LimitedTypeClass {
	
	public static void main(String[] args) {
		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		// (에러) D<X> d4 = new D<X>();
		// D 클래스는 타입 매개변수를 A 클래스로 제한하고 있기 때문에,
		// X 클래스로 타입 매개변수 지정 불가
		// A,B,C 클래스는 타입 매개변수로 지정 가능
		
		d1.setT( new A() );
		d2.setT( new B() );
		d3.setT( new C() );
		
		// 업캐스팅 발생
		d1.setT( new B() );		// B의 부모 클래스인 A클래스로 업캐스팅
		d1.setT( new C() );		// C의 부모 클래스인 A클래스로 업캐스팅
		
		// d2<B>, d3<C> <-- 부모 객체인 A 대입 불가
		// (에러) d2.setT( new A() );		
		// (에러) d3.setT( new A() );
		
		// * 타입 지정을 생략한 경우,
		// 제네릭 타입을 제한한 A클래스를 기본으로 타입지정하여 생성한다.
		D d5 = new D();				// D<A> d5 = new D<A>();
		d5.setT( new B() );
		d5.setT( new C() );
		
		// E <T extends Number>
		// * Number 클래스로 제한해주어서 숫자 타입인 클래스들만 타입지정 가능
		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
		// (에러 : 숫자타입이 아님) E<Boolean> e4 = new E<Boolean>();
		
		e1.setT( 100 );
		System.out.println(e1.getT());

		e2.setT( 12.34 );
		System.out.println(e2.getT());
		
		// 기본적으로 정수는 int타입으로 인식 4byte
		// byte 타입은 1byte
		// 자동형변환은 작은것에서 큰것만 가능
		// 작은것으로 바꾸려면 강제 형변환 [(자료형)변수] 사용
		e3.setT( (byte)127 );
		System.out.println(e3.getT());
		
	}
}
