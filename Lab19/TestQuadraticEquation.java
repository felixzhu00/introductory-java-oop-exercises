import java.util.Scanner;
public class TestQuadraticEquation {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a, b, c :");
		double x  = stdin.nextDouble();
		double y  = stdin.nextDouble();
		double z  = stdin.nextDouble();
		QuadraticEquation a = new QuadraticEquation(x,y,z);
	
		if(a.getDiscriminant() > 0) {
			System.out.println("The equation has two roots " + a.getRoot1() + " and " + a.getRoot2());
		}else if(a.getDiscriminant() == 0) {
			System.out.println("The equation has one roots " + a.getRoot1());
		}else {
			System.out.println("The equation has no roots ");
		}
		
		
		
		
		
		
	}
}
