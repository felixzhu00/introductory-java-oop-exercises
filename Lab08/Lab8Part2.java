import java.util.*;

public class Lab8Part2 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String temp = "";

		System.out.print("Enter the first city:");
		String first = stdin.nextLine();
		System.out.print("Enter the second city:");
		String second = stdin.nextLine();
		System.out.print("Enter the third city:");
		String third = stdin.nextLine();

		if (first.compareTo(second) > 0) {
			temp = second;
			second = first;
			first = temp;

		}
		if (second.compareTo(third) > 0) {
			temp = third;
			third = second;
			second = temp;

		}
		if (first.compareTo(second) > 0) {
			temp = second;
			second = first;
			first = temp;

		}
		
		System.out.println("The three cities in alphabetical order are " + first + " " + second + " " + third);
		
		
	}

}
