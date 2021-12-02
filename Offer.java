import java.util.Scanner;

public class Offer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First product price");
		float p1 = sc.nextFloat();
		System.out.println("Enter the Second product price");
		float p2 = sc.nextFloat();
		System.out.println("Enter the Third product price");
		float p3 = sc.nextFloat(),totalCost,offer1,lowestProduct;
		
		sc.close();
		totalCost = p1+p2+p3;
		
		offer1=(20*totalCost)/100;
		System.out.println("Offer1  amount saving "+offer1);
		
		if(p1<p2 && p1<p3) {
			lowestProduct =p1;
		}
		else if(p2<p1 && p2<p3) {
			lowestProduct = p2;
		}
		else
			lowestProduct = p3;
		
		System.out.println("Offer2 amount saving "+lowestProduct);
		
		if(lowestProduct>offer1) {
			System.out.println("Offer 2 is beneficial for customer");
		}else
		System.out.println("Offer 1 is beneficial for customer");
	}

}
