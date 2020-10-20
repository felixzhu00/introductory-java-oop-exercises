import java.util.Scanner;

public class Lab14Part2 {
	public static int[] eliminateDuplicate(int[] list) {
		boolean distinct;
		int[] a = new int[list.length];
		int counter = 0;
		
		
		for(int i = 0; i < list.length; i++) {
			distinct = true;
			for(int j = 0; j< a.length; j++) {
				if(list[i] == a[j]) {
					distinct = false;
				}
			}
			if(distinct){
				a[counter] = list[i];
				counter++;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int[] a = new int[10];
		
		System.out.println("Enter 10 numbers : ");
		for(int i = 0; i < 10; i++) {
			a[i] = stdin.nextInt();
		}
		
		
		
	
		int[] b = eliminateDuplicate(a);
		
		
		
		System.out.println("The distinct numbers are: ");
		for(int j = 0; j < b.length; j++) {
			if(b[j] != 0) {
				System.out.print(b[j] + " ");
			}
			
		}
		
		
	}
}
