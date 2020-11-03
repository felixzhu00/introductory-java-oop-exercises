import java.util.Scanner;
public class Lab18Part2 {
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int n = 0; n < m.length; n++) {
			sum += m[n][n];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double[][] m = new double[4][4];
		
		System.out.println("Enter a 4-by-4 matrix row by row:");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				m[i][j] = stdin.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
		
		
		
	}
}
