public class Equipment {
	private String name;
	private double weight;
	private int value;
	
	public Equipment(String name, double weight, int value) {
		this.name = name;
		this.weight = weight;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isValuable() {
		if (value >= 200) {
			return true;
		}
		else {
			return false;
		}
	}
}
