public class Lab18Part1 {
	public static void main(String[] args) {
		int[] counts = new int[10];
		
		int temp;
		for(int i = 0; i < 100; i++) {
			temp = (int)(Math.random()*10);
			counts[temp]++;
		}
		
		for(int j = 0; j < 10 ;j++ ) {
			System.out.println("There is " + counts[j] +  "\t" + j +"s");
		}
	}
}
