import java.util.Scanner;

public class Runrate {

	public static void main(String[] args) {
		float currentrunrate,remainingOvers,requiredrunrate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of overs");
		int overs = sc.nextInt();
		System.out.println("Enter targeted runs");
		int target = sc.nextInt();
		System.out.println("Enter overs bowled ");
		int currentOvers = sc.nextInt();
		System.out.println("Enter runs scored ");
		int score = sc.nextInt(),remainingRuns;
		sc.close();
		
		
		
		currentrunrate= score/currentOvers;
		
		remainingOvers = overs-currentOvers;
		remainingRuns  = target-score;
		
		requiredrunrate = remainingRuns/remainingOvers;
		System.out.println("CurrentRate "+ currentrunrate);
		System.out.println("RequiredRunrate "+ requiredrunrate);
		
		
	}
}
