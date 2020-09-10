import java.util.Scanner;

public class Lab4Part2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double w;
		double s;
		System.out.println("Please enter weight:");
		w = stdin.nextDouble();
		if (w <= 0) {
			System.out.println("Invalid Input.");
		} else if (w > 20) {
			System.out.println("The package cannot be shipped.");
		} else {
			s = 0;
			if (w <= 1) {
				s = 3.50;
			} else if (w <= 3) {
				s = 5.50;
			} else if (w <= 10) {
				s = 8.50;
			} else if (w <= 20) {
				s = 10.50;
			}
			System.out.println("Shipping cost would be " + s + " dollar.");
		}

	}

}
