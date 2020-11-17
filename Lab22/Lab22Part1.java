public class Lab22Part1 {
	public static void bubbleSort(int[] a) {  
        int temp;  
        for(int i=0; i < a.length; i++){  
        	for(int j=1; j < (a.length-i); j++){  
        		if(a[j-1] > a[j]){  
        			temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;  
                }               
             }  
         }  
  
    }
	public static void sort(int[][] m) {
		int [] a = new int [m.length];
		
		int sum; 
		for(int i = 0; i < m.length; i++) {
			sum = 0;
			for(int j = 0; j < m[0].length; j++) {
				sum += m[i][m[0].length-1-j] * Math.pow(10, j);
			}
			a[i] = sum;
		}
		
		bubbleSort(a);

		for(int i = 0; i < m.length; i++) {
			int number = a[i];
			int j = 0;
			while (number > 0) {
			    m[i][m[0].length-1-j++] = number % 10;
			    number = number / 10;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int [][]m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
		
		sort(m);
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
