import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
		double firstVelocity;
		double secondVelocity;
		double time;
		double averageAcceleration;
		
		Scanner stdin = new Scanner(System.in);		
		
		System.out.println("Enter 𝑣0");
		firstVelocity = stdin.nextDouble();
		System.out.println("Enter 𝑣1");
		secondVelocity = stdin.nextDouble();
		System.out.println("Enter 𝑡 ");
		time = stdin.nextDouble();
		
		/*
		System.out.println("Enter 𝑣0, 𝑣1 and 𝑡 : ");
		firstVelocity = stdin.nextDouble();
		secondVelocity = stdin.nextDouble();
		time = stdin.nextDouble();
		*/
		
		averageAcceleration = (secondVelocity - firstVelocity)/time;
		System.out.println("The average acceleration is " + averageAcceleration);
	}

	

}
