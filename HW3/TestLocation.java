import java.util.Scanner;
public class TestLocation {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		double[][] a = new double[3][3];
		
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
			a[i][j] = stdin.nextDouble();
			}
		}
		
		double[][] b = Location.sortRows(a);

		System.out.println("The row-sorted array is:");
		for(int k= 0; k < b.length; k++) {
			for(int j = 0; j < b[0].length; j++) {
			System.out.print(b[k][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
