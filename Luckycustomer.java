import java.util.Scanner;

public class Luckycustomer  {
	
	public static void main(String[] args) throws IllegalArgumentException {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the date");
	int date = sc.nextInt();
	System.out.println("Enter the billno");
	int billno = sc.nextInt();
	sc.close();
	int temp=billno%10;
	int temp1=billno%100;
	
	if(date>31)  {
		throw new IllegalArgumentException(" Date is out of range");
	}
	
	if(date<=9 )
	{
	   if(date==temp && billno%date==0)
	   {
	       System.out.println("lucky customers");
	   }
	   else{
	   System.out.println("unlucky customers");
	   }
	}
	else if((date>9 || date<=31)) 
	{
	   if(date == temp1 && billno%date==0)
	   {
	       System.out.println("lucky customers");
	   }
	   else{
	   System.out.println("unlucky customers");
	   }
	}

	else{
	   System.out.println("unlucky  customers");
	}
	}
}


