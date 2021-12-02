import java.util.Scanner;

public class EventExpenses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalExpenses, brandingPer, travelPer, foodPer, logisticsPer;
		System.out.println("Enter branding Expenses");
		int brandingExp = sc.nextInt();
		System.out.println("Enter travel Expenses");
		int travel = sc.nextInt();
		System.out.println("Enter food Expenses");
		int food = sc.nextInt();
		System.out.println("Enter logistics Expenses");
		int logistics = sc.nextInt();
		sc.close();
		
		totalExpenses = brandingExp+travel+food+logistics;
		System.out.println("Total Expenses " +totalExpenses);
		
		brandingPer = (brandingExp/totalExpenses)*100;
		System.out.println("Branding expenses percentage: "+ brandingPer+" %");
		
		travelPer = (travel/totalExpenses)*100;
		System.out.println("Travel expenses percentage: "+ travelPer+" %");
		
		foodPer = (food/totalExpenses)*100;
		System.out.println("Food expenses percentage: "+ foodPer+" %");
		
		logisticsPer = (logistics/totalExpenses)*100;
		System.out.println("logistics expenses percentage: "+ logisticsPer+" %");
		
		
		
		

		
		
	}
}
