import java.util.Scanner;

public class Lab3Part1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("Enter a degree in Celsius:");
		double celsius = stdin.nextDouble();
		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}

}
