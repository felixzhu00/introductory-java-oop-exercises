import java.util.Scanner;

public class Lab4Part1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		double a;
		double b;
		double c;
		System.out.println("Enter a, b, c :");
		a = stdin.nextDouble();
		b = stdin.nextDouble();
		c = stdin.nextDouble();

		double x = (b * b) - (4 * a * c);
		double r1 = (-b + Math.pow(x, .5)) / 2 * a;
		double r2 = (-b - Math.pow(x, .5)) / 2 * a;
		if (x > 0) {
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		} else if (x == 0) {
			System.out.println("The equation has one root " + r1);
		} else {
			System.out.println("The equation has no real roots.");
		}

	}

}
