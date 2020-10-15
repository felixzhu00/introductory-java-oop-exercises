import java.util.Scanner;

public class Lab13Part1 {
	public static double area(double side) {
		return Math.pow(side,2)*5/(4*(Math.tan(Math.PI/5)));
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the side:");
		double side = stdin.nextDouble();
		System.out.println("The area of the pentagon is " + area(side));
	}
}
