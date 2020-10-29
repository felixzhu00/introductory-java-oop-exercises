import java.util.Scanner;

public class Lab17Part2 {
	public static boolean isMarkovMatrix(double[][] m) {

		double sum;
		for (int i = 0; i < m.length; i++) {
			sum = 0;
			for (int j = 0; j < m[0].length; j++) {
				if (m[j][i] < 0) {
					return false;
				}
				sum += m[j][i];
			}
			if (sum != 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		double[][] a = new double[3][3];
		String[][] b = new String[3][3];

		for (int i = 0; i < 3; i++) {
			b[i] = stdin.nextLine().replaceAll("\t", " ").split(" ");
			for (int j = 0; j < b[i].length; j++) {
				a[i][j] = Double.parseDouble(b[i][j]);
			}
		}

		System.out.println("It is" + (isMarkovMatrix(a) ? "" : " not") + " a Markov matrix");

	}
}
