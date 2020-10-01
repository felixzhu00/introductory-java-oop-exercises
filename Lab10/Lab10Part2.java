import java.util.Scanner;

public class Lab10Part2 {
	public static void main(String[] args) {
		int sum;
		System.out.println("The four numbers are:");
		for(int i = 1; i < 10000; i++) {
			sum = 0;
			for(int j = 1; j< i; j++) {
				if(i%j == 0) {
					sum += j; 
				}
			}
			if (i == sum) {
				System.out.println(sum);
			}
		}
		
		
		
		
		
		
		
	}

}
