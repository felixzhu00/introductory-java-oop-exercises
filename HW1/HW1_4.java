import java.util.Scanner;

public class HW1_4 {

	public static void main(String[] args) {
		String output = "";
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the encrypted message:");
		String encryotedMessage = stdin.nextLine();
		
		for(int i = 0; i < encryotedMessage.length(); i+=2) {
			output += encryotedMessage.charAt(i);
		}
		
		System.out.println("The message is: \n" + output);
	}

}
