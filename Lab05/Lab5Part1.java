import java.util.Scanner;

public class Lab5Part1 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a three-digit (positive) integer: ");
		int pal = stdin.nextInt();
		
		while((int) (Math.log10(pal) + 1) != 3 || pal < 0){
			System.out.println("Error, that is not an 3 digit (positive) integer please enter a new integer:");
			pal = stdin.nextInt();
		}
		
		if(pal/100 == pal%10) {
			System.out.println(pal + " is a palindrome");
		}else {
			System.out.println(pal + " is not a palindrome");
		}
		
		

	}

}
