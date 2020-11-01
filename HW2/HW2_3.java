import java.util.Scanner;
public class HW2_3 {
	public static String[] bubbleSort(String[] x) {
		
		String[] a = x;
		
		for(int i = 0; i < a.length-1; i++) {
			for(int j = 0; j < a.length-1-i; j++) {
				if(a[j].compareTo(a[j+1]) > 0) {
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			a[i] = a[i].replaceAll(",", "");
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Enter 10 strings: ");
		String x = stdin.nextLine();
		String[] a = x.replaceAll(", ", "-").split("-");
		System.out.println("Sorted strings: ");
		
		String[] b = bubbleSort(a);
		
		for(int i = 0; i < b.length; i++) {
			System.out.print( b[i]+ ", ");
		}
		
		
		
		
		
		
		
		
	}
}
