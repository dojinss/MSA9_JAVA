package Day07.Ex01_Shape;

public class Triangle extends Shape{
	
	// 멤버 변수
	double width,height;	

	public Triangle() {
		this(0.0, 0.0);
	}
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		// 삼각형의 넓이
		return width * height / 2;
	}
	@Override
	double round() {
		// (정)삼각형의 둘래 = 3 * width
		return 3 * width;
	}
	
	
	// getter,setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// toString
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
