package Day07.Ex01_Shape;

public class Point {
	
	// 멤버 변수
	int x,y;
	
	// 기본 생성자
	public Point() {
		super();
	}
	
	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
