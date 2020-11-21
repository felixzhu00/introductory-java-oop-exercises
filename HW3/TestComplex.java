import java.util.Scanner;
public class TestComplex {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter real part of the first complex number: ");
		double one = stdin.nextDouble();
		System.out.print("Enter imaginary part of the first complex number: ");
		double two = stdin.nextDouble();
		System.out.print("Enter real part of the second complex number: ");
		double three = stdin.nextDouble();
		System.out.print("Enter imaginary part of the second complex number:");
		double four = stdin.nextDouble();
		
		Complex a = new Complex(one,two);
		
		Complex b = new Complex(three,four);

		System.out.println("First complex number is: (" + a.getReal() + ", " + a.getImag() + ")");
		System.out.println("Second complex number is: (" + b.getReal() + ", " + b.getImag() + ")");
		
		Complex c = Complex.addCom(a,b);
		Complex d = Complex.subCom(a,b);
		
		System.out.println("Addition of the complex numbers is: (" + c.getReal() + ", " + c.getImag() + ")");
		System.out.println("Subtraction of the complex numbers is: (" + d.getReal() + ", " + d.getImag() + ")");
	}
}
