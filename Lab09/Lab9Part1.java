import java.util.Scanner;

public class Lab9Part1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the phone number : ");
		String x = stdin.nextLine();
		System.out.println("Formatted phone number : (" + x.substring(0,3) + ")" + x.substring(3,6) + "-" + x.substring(6,10));
		
		
		
	}

}
