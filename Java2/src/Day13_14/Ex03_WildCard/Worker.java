package Day13_14.Ex03_WildCard;

public class Worker extends Person{

	public Worker(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Worker [" + getName() + "]";
	}
	
}
