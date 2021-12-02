import java.util.Scanner;

public class NumberofTurns {

	public static void main(String[] args) {
		int target =100,points=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=target;i++) {
			System.out.println("Enter the turn" +i);
			int turn = sc.nextInt();
			
			points+=turn;
			if(points>=target) {
				System.out.println("Scored points :"+points);
				System.out.println("No of turns: "+ i);
				break;
			}
		}
		sc.close();
		
	}
}
