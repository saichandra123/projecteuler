import java.util.Scanner;

public class Denomination {
	
	public static void main(String[] args) {
	int amount=0, one=0, two=0, five=0, ten=0, fifty=0, hundred=0;
	 System.out.println("Enter the amount");
	 Scanner sc=new Scanner(System.in);
	 amount=sc.nextInt();
	 sc.close();
	 if(amount>=100)
	    {
	        hundred = amount/100;
	        amount = amount%100;
	    }

	    if(amount>=50)
	    {
	        fifty = amount/50;
	        amount = amount%50;
	    }

	    if(amount>=10)
	    {
	        ten = amount/10;
	        amount = amount%10;
	    }
	    if(amount>=5)
	    {
	        five = amount/5;
	        amount= amount%5;
	    }
	    if(amount>=2)
	    {
	        two = amount/2;
	        amount = amount%2;
	    }
	    if(amount>=1)
	    {
	        one = amount;
	    }

System.out.println("Number of notes to be returned"+(hundred+fifty+ten+five+two+one));

}
}
		
	


