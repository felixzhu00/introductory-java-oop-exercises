import java.util.Scanner;
public class TestRational {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter numerator for the first rational number: ");
		int num1 = stdin.nextInt();
		System.out.print("Enter a non-zero denominator for the first rational number: ");
		int den1 = stdin.nextInt();
		while(den1 == 0) {
			System.out.println("Error, Enter a non-zero denominator:");
			den1 = stdin.nextInt();
		}
		System.out.print("Enter numerator for the second rational number: ");
		int num2 = stdin.nextInt();
		System.out.print("Enter a non-zero denominator for the second rational number: ");
		int den2 = stdin.nextInt();
		while(den2 == 0) {
			System.out.println("Error, Enter a non-zero denominator:");
			den1 = stdin.nextInt();
		}
		
		Rational a = new Rational(num1,den1);
		Rational b = new Rational(num2,den2);
		
		System.out.println("First rational number is: " + a.toString());
		System.out.println("Second rational number is: " + b.toString());
		
		Rational c = Rational.addRat(a,b);
		Rational d = Rational.subRat(a,b);
		Rational e = Rational.multiRat(a, b);
		Rational f = Rational.divRat(a, b);
		
		System.out.println("Addition of the rational numbers is: " + c.toString());
		System.out.println("Subtraction of the rational numbers is: " + d.toString());
		System.out.println("Multiplication of the rational numbers is: " + e.toString());
		System.out.println("Division of the rational numbers is: " + f.toString());
		
	}
}
