package Day13_14.Ex03_WildCard;



public class ElementCheck {
	private String type = "";
	
	
	
	public ElementCheck(String type) {
		this.type = type;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return this.type;
	}
	
}
