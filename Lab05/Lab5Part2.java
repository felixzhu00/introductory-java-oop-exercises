import java.util.Scanner;

public class Lab5Part2 {

	public static void main(String[] args) {
		double cost;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double distance = stdin.nextDouble();
		System.out.println("Enter Miles per gallon: ");
		double mpg = stdin.nextDouble();
		System.out.println("Enter price per gallon: ");
		double ppg = stdin.nextDouble();
		
		cost = (Math.round(distance/mpg *ppg*100.0)) / 100.0;
		
		System.out.println("The cost of driving is: " + cost);
		
		
		
		
		

	}

}
