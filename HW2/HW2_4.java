import java.util.Scanner;
public class HW2_4 {
	public static double[][] multiplyMaxtrix(double[][] a,  double[][] b){
		
		double[][] c = new double[3][3];
		double sum;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				sum = 0;
				for(int k = 0; k < 3; k++){
					sum += a[i][k]*b[k][j];
				}
				c[i][j] = ((int)(sum*10)/10.0); 
			}
		}
					
		return c;

		
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		
		System.out.print("Enter matrix1: ");
		for(int i = 0; i < 9; i++) {
			int row = i/3;
			int col = i%3;
			a[row][col] = stdin.nextDouble();
		}	
		
		System.out.print("Enter matrix2: ");
		for(int i = 0; i < 9; i++) {
			int row = i/3;
			int col = i%3;
			b[row][col] = stdin.nextDouble();
		}
		
		double[][] c = multiplyMaxtrix(a,b);
		
		System.out.println("Multiplication of the matrices is:");
		for(int i =0; i < 3; i++) {
			for(int j =0; j < 3; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
