import java.util.Scanner;

public class HW1_1 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		double s1,s2,s3;
		
		System.out.println("Enter the Value for Side 1:");
		s1 = stdin.nextDouble();
		System.out.println("Enter the Value for Side 2:");
		s2 = stdin.nextDouble();
		System.out.println("Enter the Value for Side 3:");
		s3 = stdin.nextDouble();
		
		
		if((s1*s1) + (s2*s2) == (s3*s3)) {
			System.out.println("Input sides represent a right triangle!");
		}else if((s3*s3) + (s2*s2) == (s1*s1)) {
			System.out.println("Input sides represent a right triangle!");
		}else if((s3*s3) + (s1*1) == (s3*s3)) {
			System.out.println("Input sides represent a right triangle!");
		}else {
			System.out.println("Input sides do not represent a right triangle!");
		}
			
		
		

	}

}
