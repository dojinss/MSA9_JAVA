package Day09.Ex07_Review.추상클래스;

public abstract class Computer {
	
	// 추상 메소드를 정의하려면, abstract 키워드를 붙여주어야한다.
	
	public abstract void display();
	public abstract void typing();
	
	public void on() {
		System.out.println("ON");
	}
	public void off() {
		System.out.println("OFF");
	}
}
