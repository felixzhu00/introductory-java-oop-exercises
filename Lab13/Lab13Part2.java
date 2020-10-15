public class Lab13Part2 {
	public static void main(String[] args) {
		System.out.println("Twin Primes:");
		int counter;
		for(int i = 1; i <= 1000; i++) {
			counter = 0;
			for(int j = i; j >= 1; j--) {
				if(i%j == 0) {
					counter++;	
				}
			}
			if(counter == 2) {
				for(int k = i; k <= 1000; k++) {
					counter = 0;
					for(int l = k; l >= 1; l--) {
						if(k%l == 0) {
							counter++;
						}
					}
					if(counter == 2 && i+2 == k) {
						System.out.println("("+ i + ", " + k + ")");
					}	
				}
			}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
