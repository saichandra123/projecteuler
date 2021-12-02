import java.util.Scanner;

public class Winconsin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary amount");
		int sal = sc.nextInt(), temp;
		sc.close();

		for (int i = 10; i < sal; i++) {
			temp = (80 * i) + 50 * (i - 10);

			if (sal - temp >= 0 && sal - temp < 130) {
				System.out.println("Weekday Hours " + i);
				System.out.println("Weekend Hours " + (i - 10));
			}
		}

	}
}
