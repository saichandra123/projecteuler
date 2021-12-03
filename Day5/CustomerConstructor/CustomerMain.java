import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer details");
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the Email");
		String email = sc.next();
		System.out.println("Enter the Type");
		String type = sc.next();
		System.out.println("Enter the Location");
		String location = sc.next();
		sc.close();
		
		Customer customer = new Customer(name,email,type,location);
		customer.display();
		
		
	}
}
