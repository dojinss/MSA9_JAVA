package Day05.Ex03_Car;

public class CarTest {
	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		car.model	= "투싼";
		
		// private 으로 지정한 변수는 외부에서 접근 불가.
		// 제한이나 조건이 있을경우 private 으로 제어가능
		car.setSpeed(-50);
		car.setSpeed(400);
		
		System.out.println("model : " + car.getModel());
		System.out.println("speed : " + car.getSpeed());
	}
}
