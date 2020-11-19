import java.util.Scanner;
public class Lab23Part2 {
	// Part 2 method (Binary to Decimal)
	public static int bin2Dec(String binaryString) {
		int len = binaryString.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += (binaryString.charAt(len - 1 - i) - '0') * Math.pow(2, i);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		String x = stdin.nextLine();
		System.out.println("The decimal equivalent is: " + bin2Dec(x));
		
	}
}
