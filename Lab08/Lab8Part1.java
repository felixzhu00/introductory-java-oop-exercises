import java.util.Scanner;

public class Lab8Part1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Average of Ten Random Generated Integers:");
		double sum = 0;
		
		for(int i = 0; i < 10; i++) {
			sum += (int)(Math.random()*100);
		}
		
		System.out.println(sum/10);
		
		
		
		
		
		
		
		
		
	}

}
