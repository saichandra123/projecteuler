package oopscustomercasestudy4;

import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Customer customer = null;
		Address address = null;

		 Scanner sc = new Scanner(System.in);
			customer = new Customer();
			address = new Address();

			System.out.println("Enter the name");
			customer.setName(sc.next());

			System.out.println("Enter the street");
			address.setStreet(sc.next());

			System.out.println("Enter the city");
			address.setCity(sc.next());

			System.out.println("Enter the pincode");
			address.setPincode(sc.nextInt());
			
			sc.close();

			customer.setAddress(address);

			System.out.println(customer);
}
}
