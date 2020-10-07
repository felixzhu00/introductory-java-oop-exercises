import java.util.Scanner;

public class HW1_2 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a five digit integer:");
		int pal = stdin.nextInt();

		while((int) (Math.log10(pal) + 1) != 5){
			System.out.println("Error, that is not an 5 digit integer please enter a new integer:");
			pal = stdin.nextInt();
		}
		
		if(pal/10000 == pal%10 && (pal/1000) %10 == (pal%100) /10) {
			System.out.println("This a Palindrome!");
		}else {
			System.out.println("This not a Palindrome!");
		}
		
		

	}

}
