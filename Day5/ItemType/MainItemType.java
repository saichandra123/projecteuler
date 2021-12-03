import java.util.Scanner;

public class MainItemType {

	public static void main(String[] args) {
		
		ItemType it = new ItemType();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item type name");
	    String name = sc.next();
	    System.out.println("Enter the cost per day");
		double costPerDay = sc.nextDouble();
		System.out.println("Enter the deposit");
		double deposit  = sc.nextDouble();
		it.setName(name);
		it.setCostPerDay(costPerDay);
		it.setDeposit(deposit);
		it.display();
		sc.close();
		 
		
	}
}
