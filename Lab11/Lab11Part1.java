import java.util.Scanner;

public class Lab11Part1 {
	public static int count(String str, char a) {
		int counter = 0;
		for(int i =0 ; i < str.length();i++) {
			if((str.charAt(i)) == a)
				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = stdin.nextLine();
		System.out.println("Enter a Character:");
		char a = stdin.next().charAt(0);
		System.out.println(count(str , a));
		
		
		
	}

}
