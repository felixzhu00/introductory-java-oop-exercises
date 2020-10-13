import java.util.Scanner;

public class Lab12Part1 {
	public static void displayPattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int k = n-i; k > 0;k--) {
				System.out.print("\t");
			}
			
			for(int j = i; j > 0; j--) {
				System.out.print(j + "\t");	
			}
			
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the integer:");
		displayPattern(stdin.nextInt());
		
		
	}
}
