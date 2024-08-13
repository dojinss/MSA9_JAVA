package Day07.Ex01_Shape;

public class Circle extends Shape{
	
	double radius;		//반지름
	
	
	
	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// 원의 넓이 원주율 * 반지름의 제곱
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		// 원의 둘래 ( 2 * 원주율 * 반지름 )
		return 2 * Math.PI * radius;
	}
	
	// getter,setter
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
