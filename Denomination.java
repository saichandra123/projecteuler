import java.util.Scanner;

public class Denomination {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount to be returned ");
		int n = sc.nextInt();
		sc.close();
		 int n1,n2,n3,n4,n5,n6;
		 
		 n1=n/100;  
		 n=n%100;
		
         n2=n/50;
         n=n%50;
         
		 n3=n/10;
		 n=n%10;
		 
		 n4=n/5; 
		 n=n%5;
         n5=n/2;
         n=n%2;
         n6=n;
		 
		
		System.out.println(n1+n2+n3+n4+n5+n6);
		
		
		}
		
	}


