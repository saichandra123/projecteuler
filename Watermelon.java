import java.util.Scanner;

public class Watermelon {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the weight of watermelon");
	int weight = sc.nextInt(),result;
	if(weight%2==0) {
		result = weight/2;
		System.out.println("I got "+result+" and my sibling got "+result);
		for(int i=1;i<weight;i++) {
			for(int j=1;j<=weight;j++) {
				int temp = i+j;
				if(temp==weight) {
					System.out.println(i+" "+j);
				}
			}
		}
	}else
		System.out.println("Please select the even weightage one");
	
	
	sc.close();
	
	
}
}
