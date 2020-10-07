import java.util.Scanner;

public class HW1_3 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int i = stdin.nextInt();

		System.out.println("Is " + i + " divisible by 5 and 6? " + (i%5 == 0 && i%6 == 0));
		System.out.println("Is " + i + " divisible by 5 or 6? " + (i%5 == 0 || i%6 == 0));
		System.out.println("Is " + i + " divisible by 5 or 6, but not both? " + ((i%5 == 0 && i%6 == 0) || (i%5 == 0 || i%6 == 0)));
		
		
	}

}
