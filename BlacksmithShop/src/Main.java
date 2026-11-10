public class Main {
	public static void main(String[] args) {
		double totalWeight;
		int totalValue;
		
		Equipment item1 = new Equipment("Iron Longsword", 5.0, 150);
		Equipment item2 = new Equipment("Steel Greatsword", 8.5, 250);
		Equipment item3 = new Equipment("Wooden Shield", 6.0, 80);
		Equipment item4 = new Equipment("Dragonbone Armour", 12.0, 500);
		
		totalWeight = item1.getWeight() + item2.getWeight() + item3.getWeight() + item4.getWeight();
		totalValue = item1.getValue() + item2.getValue() + item3.getValue() + item4.getValue();
		
		System.out.println(" =====Blacksmith Shop===== ");
		System.out.println("");
		
		if(item1.isValuable()) {
			System.out.println("*" + item1.getName() + " - " + item1.getWeight() + " - " + item1.getValue());
		}
		else {
			System.out.println(item1.getName() + " - " + item1.getWeight() + " - " + item1.getValue());
		}
		
		if (item2.isValuable()) {
			System.out.println("*" + item2.getName() + " - " + item2.getWeight() + " - " + item2.getValue());
		}
		else {
			System.out.println(item2.getName() + " - " + item2.getWeight() + " - " + item2.getValue());
		}
		
		if (item3.isValuable()) {
			System.out.println("*" + item3.getName() + " - " + item3.getWeight() + " - " + item3.getValue());
		}
		else {
			System.out.println(item3.getName() + " - " + item3.getWeight() + " - " + item3.getValue());
		}
		
		if (item4.isValuable()) {
			System.out.println("*" + item4.getName() + " - " + item4.getWeight() + " - " + item4.getValue());
		}
		else {
			System.out.println(item4.getName() + " - " + item4.getWeight() + " - " + item4.getValue());
		}
		
		System.out.println("");
		System.out.println("Total Weight: " + totalWeight);
		System.out.println("Total Value: " + totalValue);
	}
}
