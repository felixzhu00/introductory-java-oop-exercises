import java.util.Scanner;

public class Lab16Part2 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		String y = stdin.nextLine();
		String[] a = y.split(" ");
		int[] b = new int[a.length-1];
		
		for(int i = 0; i < a.length-1; i++) {
			b[i]  = Integer.parseInt(a[i]);
		}
		
		for(int i = 0; i < b.length-1; i++) {
			for(int j = 0; j < b.length-1-i; j++) {
				if(b[j] > b[j+1]) {
					int temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
		}
		
		int counter;
		for(int i = 0; i < b.length; i+= counter) {
			counter = 1;
			System.out.print(b[i] + " occurs ");
			for(int j = i+1; j < b.length; j++) {
				if(b[i] == b[j]) {
					counter++;
				}
			}
			if(counter == 1) {
				System.out.print(counter + " time\n");
			}else {
				System.out.print(counter + " times\n");
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
