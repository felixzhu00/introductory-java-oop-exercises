import java.util.Scanner;

public class Lab9Part2 {
	public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			System.out.print("Enter the phone number : ");
			String x = stdin.nextLine();
			
			if(x.charAt(3) != '-' && x.charAt(8) != '-')
				System.out.println(x + " is an invalid social security number");
			else
				System.out.println(x + " is an valid social security number");
				System.out.println();
		
		
		
		
		
	}

}
