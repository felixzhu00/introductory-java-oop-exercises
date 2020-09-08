import java.util.Scanner;

public class Lab3Part2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("Enter the amount of water in kilograms: ");
		double m = stdin.nextDouble();
		System.out.println("Enter the initial temperature: ");
		double i = stdin.nextDouble();
		System.out.println("Enter the final temperature: ");
		double f = stdin.nextDouble();

		double q = m * (f - i) * 4184;
		System.out.println("The energy needed is " + q);
	}

}
