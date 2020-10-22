import java.util.Scanner;

public class Lab15Part1 {
	public static int[] merge(int[] list1, int[] list2) {
		
		int len = list1.length + list2.length;
		int[] a = new int[len];
		
	
		for(int i = 0; i < list1.length; i++) {
			a[i] = list1[i];
		}
		
		for(int i = 0; i < list2.length; i++) {
			a[list2.length+i+1] = list2[i];
		}
		
		boolean isSorted = false;
		int temp;
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < a.length-1; i++) {
				if(a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					isSorted = false;
				}
			}
		}
		
		return a;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Enter list1 size and contents: ");
		int x = stdin.nextInt();
		int[] a = new int[x];
		for(int i = 0; i < x; i++) {
			a[i] = stdin.nextInt();
		}
		
		System.out.println("Enter list2 size and contents: ");
		int y = stdin.nextInt();
		int[] b = new int[y];
		for(int i = 0; i < y; i++) {
			b[i] = stdin.nextInt();
		}
		
		
		
		System.out.print("List1 is ");
		for(int e: a) {
			System.out.print(e + " ");
		}
		System.out.print("\nList2 is ");
		for(int e: b) {
			System.out.print(e + " ");
		}
		
		
		
		int[] c = merge(a,b);
		System.out.print("\nThe merged list is ");
		for(int e: c) {
			System.out.print(e + " ");
		}
		

	}
}
