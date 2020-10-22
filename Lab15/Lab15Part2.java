import java.util.Scanner;

public class Lab15Part2 {
	public static int[] reverse(int[]a) {
		int temp;
		for(int i = 0; i < a.length/2; i++) {
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter 10 number");
		
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = stdin.nextInt();
		}

		
		reverse(a);
		
		for(int e : a) {
			System.out.print(e + " ");
		}
		
		
		
		
	}
}
