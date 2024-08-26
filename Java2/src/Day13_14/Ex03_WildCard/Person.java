package Day13_14.Ex03_WildCard;

public class Person {
	
	// 멤버 변수
	private String name;

	// 생성자
	public Person(String name) {
		this.name = name;
	}
	
	
	// getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "Person [" + name + "]";
	}
	
	
	
}
