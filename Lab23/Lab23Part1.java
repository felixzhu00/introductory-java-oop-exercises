import java.util.Scanner;
public class Lab23Part1 {
	// Part 1 method (Decimal to Binary)
	public static String dec2Bin(int value) {
		String con = "";
		String temp = "";
		if(value == 0) {
			return "0";
		}
		while (value > 0) {
			temp += String.valueOf(value % 2);
			value = value / 2;
		}
		char[] re = temp.toCharArray();
		for (int i = re.length - 1; i >= 0; i--) {
			con += re[i];
		}
		return con;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a decimal number:");
		int x = stdin.nextInt();
		System.out.println("The binary equivalent is: " + dec2Bin(x));

	}
}
