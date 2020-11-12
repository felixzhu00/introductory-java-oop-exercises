import java.util.Scanner;
public class Lab21Part1 {
	public static int largestIndex(int[] a) {
		int maxIndex = 0;
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
				maxIndex = i;
				
			}
		}
		return maxIndex;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int[][] m = new int[4][4];
		
		int[] sumR = {0,0,0,0};
		int[] sumC = {0,0,0,0};
		
		for(int i =0; i < 4; i++) {
			for(int j =0; j < 4; j++) {
				m[i][j] = (int)(Math.random()*2);
				System.out.print(m[i][j] + " ");
				if(m[i][j] == 1) {
					sumR[i]++;
					sumC[j]++;
				}
			}
			System.out.println();
		}
		System.out.println("The largest row index: " + largestIndex(sumR));
		System.out.println("The largest column index: " + largestIndex(sumC));
	}
}
