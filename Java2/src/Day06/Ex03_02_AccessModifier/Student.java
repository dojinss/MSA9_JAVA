package Day06.Ex03_02_AccessModifier;

import Day06.Ex03_01_AccessModifier.Person;

public class Student extends Person{

	// 생성자
	public Student() {
		super("이름없음",0,0,0);
	}

	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}

	// 메소드
	public void defaultSetting() {
		name = "이름없음";		// public 		: 모든곳에서 접근가능
		age = 20;			// protected 	: Person 상속 받았기 때문에 다른패키지라도 접근 가능
//		height = 170;		// default		: 같은 패키지끼리만 접근가능
//		weight = 60;		// private		: 클래스 내에서만 접근가능
		setHeight(170);
		setWeight(60);
	}
}
