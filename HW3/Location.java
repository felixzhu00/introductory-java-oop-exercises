public class Location {
	public static void bubbleSort(double[] a) {  
        double temp;  
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
	public static double[][] sortRows(double[][] m){
		for(int i = 0; i < m.length; i++) {
			bubbleSort(m[i]);
		}
		return m;
	}
}

