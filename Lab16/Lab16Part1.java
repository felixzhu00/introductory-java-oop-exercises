import java.util.Scanner;

public class Lab16Part1 {
	public static char[] returnScore(String[] x) {
		char[] re = new char[x.length];
		int[] a = new int[x.length];
		int best = 0;
		for(int i = 0; i < x.length; i++) {
			a[i] = Integer.parseInt(x[i]);
			if(a[i] > best) {
				best = a[i];
			}
		}
		for(int i = 0; i < x.length; i++) {
			if(a[i] >= best - 10) {
				re[i] = 'A';
			}else if(a[i] >= best - 20){
				re[i] = 'B';
			}else if(a[i] >= best - 30){
				re[i] = 'C';
			}else if(a[i] >= best - 40){
				re[i] = 'D';
			}else {
				re[i] = 'F';
			}
		}
		return re;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int x = stdin.nextInt();
		System.out.print("Enter " + x + " scores: ");
		stdin.nextLine(); // reset stdin
		String score = stdin.nextLine();
		String[] scores = score.split(" ");
		
		char[] letter = returnScore(scores);
		
		for(int i = 0; i < letter.length; i++) {
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + letter[i]);
		}
	}
}
