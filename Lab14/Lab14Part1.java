import java.util.Scanner;

public class Lab14Part1 {
	public static double deviation(double[] x) {	
		double sum = 0;
		for(int i =0; i < x.length; i++) {
			sum +=Math.pow((x[i]-mean(x)), 2);
		}
		
		return Math.round(Math.sqrt(sum/(x.length-1))*100000.0)/100000.0;
	}
	public static double mean(double[] x) {
		int counter = 0;
		double sum = 0;
		for(int i =0; i < x.length; i++) {
			sum += x[i];
			counter++;
		}
		return Math.round(sum/counter*100.0) / 100.0;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		double[] a = new double[10];
		
		System.out.println("Enter 10 numbers : ");
		for(int i = 0; i < 10; i++) {
			a[i] = stdin.nextDouble();
		}
		System.out.println("The mean is " + mean(a));
		System.out.println("The standard deviation is " + deviation(a));
		
			
			
			
		
		
		
		
		
	}
}
