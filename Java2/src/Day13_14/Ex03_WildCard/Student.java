package Day13_14.Ex03_WildCard;

public class Student extends Person{

	public Student(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Student [" + getName() + "]";
	}
	
}
