import java.util.Scanner;

public class Lab11Part2 {
	public static double summation(int a) {
		double sum = 0;
		while (a > 0) {
			sum += (a/(a+1.0));
			a--;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter i:");
		int i = stdin.nextInt();
		double temp;
		System.out.println("i\tm(i)");
		for(int x = 0; x < i+1; x++) {
			System.out.print(x + "\t");
			System.out.printf("%.4f", summation(x));
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
