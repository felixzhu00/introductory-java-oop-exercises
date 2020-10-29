import java.util.Scanner;
public class Lab17Part1 {
	public static int[] locateLargest(double[][] a) {
		int[] cord = new int[2];
		
		
		double temp = a[0][0];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(a[i][j] > temp) {
					temp = a[i][j];
					cord[0] = i;
					cord[1] = j;
				}
			}
		}
		
		return cord;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");

		String enter = stdin.nextLine();
		
		String[] rc = enter.split(" ");
		
		int x = Integer.parseInt(rc[0]);
		int y = Integer.parseInt(rc[1]);
		System.out.println("Enter the array: ");
		double[][] a = new double[x][y];
		String[][] b = new String[x][y];
		
		for(int i = 0; i < x; i++) {
			b[i] = stdin.nextLine().replaceAll("\t", " ").split(" ");
			for(int j = 0; j < b[i].length; j++) {
				a[i][j] = Double.parseDouble(b[i][j]);
			}
		}
		
		System.out.println("The location of the largest element is at (" + locateLargest(a)[0] + ", " + locateLargest(a)[1] + ")");
		
		
		
		
		
		
	}
}
