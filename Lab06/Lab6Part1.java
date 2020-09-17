import java.util.Scanner;

public class Lab6Part1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		System.out.println("Enter a point with two coordinates: ");
		double x = stdin.nextDouble();
		double y = stdin.nextDouble();
		if (10 >= Math.sqrt(x*x + y*y)) {
			System.out.println("Point ("+ x +", " + y + ") is in the circle");
		}else {
			System.out.println("Point ("+ x +", " + y + ") is not in the circle");
		}
	}

}
