import java.util.Scanner;
public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
		double a = stdin.nextDouble();
		double b = stdin.nextDouble();
		double c = stdin.nextDouble();
		double d = stdin.nextDouble();
		double e = stdin.nextDouble();
		double f = stdin.nextDouble();
		
		LinearEquation equ = new LinearEquation(a,b,c,d,e,f);
		
		if(equ.isSolvable())
			System.out.println("X is " + equ.getX() + " and y is " + equ.getY());
		else
			System.out.println("The equation has no solutions.");
		
		
		
	}
}
