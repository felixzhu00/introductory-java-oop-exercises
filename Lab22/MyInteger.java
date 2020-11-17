public class MyInteger {
	private int value;
	
	MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		return value%2 == 0;
	}
	public boolean isOdd() {
		return value%2 == 1;
	}
	public boolean isPrime() {
		int counter = 0;
		for(int i = 1; i < value; i++) {
			if(value%i == 0) {
				counter++;
			}
		}
		if(counter == 1) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}
	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}
	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}
	public boolean equals(int a) {
		return a == value;
	}
	public boolean equals(MyInteger a) {
		return a.value == this.value;
	}
}
