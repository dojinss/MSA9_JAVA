package Day07.Ex01_Shape;


// 추상클래스 abstract
public abstract class Shape {
	Point point;
	
	// 넓이와 둘래를 구하는 추상 메소드를 정의하시오.
	// * 추상 메소드 : abstract 접근지정자 반환타입 메소드명( 매개변수 );
	
	abstract double area();		//넓이
	abstract double round();	//둘래
	
	// getter,setter
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
}
