import java.util.Scanner;

public class Lab12Part2 {
	public static void reverse(int n) {
		int some = 0;
		int counter = 1;
		int len = Integer.toString(n).length();
		while(n > 0) {
			some += (n%10) * Math.pow(10, len - counter);
			n /= 10;
			counter++;
		}
		System.out.println(some);
		
		
		
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the integer:");
		reverse(stdin.nextInt());
		

		
		
		
	}
}
