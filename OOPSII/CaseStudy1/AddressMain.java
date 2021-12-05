package oops2assignment;

import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Address address = new Address();
		System.out.println("Enter Address Line 1");
		address.setAddressLine1(sc.next());
		System.out.println("Enter Address Line 2");
		address.setAddressLine2(sc.next());
		System.out.println("Enter the City Name");
		address.setCity(sc.next());
		System.out.println("Enter the State Name");
		address.setState(sc.next());
		System.out.println("Enter the Pincode");
		address.setPincode(sc.nextInt());
		sc.close();
		
		System.out.println("The Address Details are \n"+address);
		
	}
}
