import java.util.Scanner;

public class Lab6Part2 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the number of sides : ");
		int side = stdin.nextInt();
		System.out.println("Enter the side : ");
		double width = stdin.nextDouble();
		double answer = (side * width * width )/(4*Math.tan(Math.PI/side));
		System.out.println("The area of the polygon is " + answer);
	}

}
