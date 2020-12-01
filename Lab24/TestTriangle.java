import java.util.Scanner;
public class TestTriangle {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the 3 side of the triangle: ");
		double x = stdin.nextDouble();
		double y = stdin.nextDouble();
		double z = stdin.nextDouble();
		System.out.print("Enter a color for the triangle: ");
		String c = stdin.next();
		System.out.print("Is the triangle filled: ");
		boolean f = stdin.nextBoolean();
		
		Triangle a = new Triangle(x,y,z);
		a.setColor(c);
		a.setFilled(f);
		
		System.out.println("\n" + a.toString());
		System.out.println("Area: " + a.getArea() + " Perimeter: " + a.getPerimeter());
		System.out.println("Color: " + a.getColor() + " isFilled: " + a.isFilled());
		
	}
}
