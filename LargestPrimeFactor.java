import java.util.Scanner;

public class LargestPrimeFactor {

	  
	 public static void main(String[] args) {  
	  Scanner input = new Scanner(System.in);  
	  System.out.println("Enter a number?");  
	  double number = input.nextDouble();  
	  double result = largestPrimeFactor(number);  
	  System.out.println("The result is " + result);  
	 }  
	 public static double largestPrimeFactor(double n) {  
	  if (n <= 1) {  
	   return 0;  
	  } else {  
	   int div = 2;  
	   while (div < n) {  
	    if (n % div != 0) {  
	     div++;  
	    } else {  
	     n = n / div;  
	     div = 2;  
	    }  
	   }  
	   return n;  
	  }  
	 }  
}
