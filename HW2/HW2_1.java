import java.util.Scanner;
public class HW2_1 {
	public static boolean isPalindrome(String x) {
		String original = x.replaceAll("\\s", "").toLowerCase();
		String flip = "";
	
		for(int i = original.length()-1; i >= 0 ; i--) {
			flip += original.charAt(i); 
		}

		return original.equals(flip);
		
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String x = stdin.nextLine();
		System.out.println("Input string " + x + " is" +  (isPalindrome(x)? "": " NOT") + " a palindrome");
	}
}
