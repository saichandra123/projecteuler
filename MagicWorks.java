
import java.util.Scanner;
public class MagicWorks {
public static void main(String[] args) {
int peoplesWatchedShow1;
float ratingsShow1;
int peoplesWatchedShow2;
float ratingsShow2;
int peoplesWatchedShow3;
float ratingsShow3;
float overallAverageRating;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of people who watched show 1");
peoplesWatchedShow1=sc.nextInt();
System.out.println("Enter the average rating for show 1");
ratingsShow1=sc.nextFloat();
System.out.println("Enter the number of people who watched show 2");
peoplesWatchedShow2=sc.nextInt();
System.out.println("Enter the average rating for show 2");
ratingsShow2=sc.nextFloat();
System.out.println("Enter the number of people who watched show 3");
peoplesWatchedShow3=sc.nextInt();
System.out.println("Enter the average rating for show 3");
ratingsShow3=sc.nextFloat();
sc.close();
overallAverageRating=(((peoplesWatchedShow1*ratingsShow1)+(peoplesWatchedShow2*ratingsShow2)+(peoplesWatchedShow3*ratingsShow3))/(peoplesWatchedShow1+peoplesWatchedShow2+peoplesWatchedShow3));
System.out.println("The overall average rating for the show is "+overallAverageRating);
	}
}