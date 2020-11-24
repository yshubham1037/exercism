import java.util.Scanner;
public class Exercise4{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the year");
		int year = scan.nextInt();
		boolean leap = false;
	
		
		if (year%4==0){
			if(year%100==0){
				if(year%400==0){
					leap = true;

				}
			}
		}
		else leap = false;

		if(leap=true){
			System.out.println("it is a leap year");
		}
		else System.out.println("not a leap year");

		
	}
}