public class TestMyInteger {
	public static void main(String[] args) {
		MyInteger a = new MyInteger(8);
		MyInteger b = new MyInteger(13);
		
		System.out.println("Value: " + a.getValue());
		System.out.println("Even: " + a.isEven());
		System.out.println("Odd: " + a.isOdd());
		System.out.println("Prime: " + a.isPrime());
		System.out.println();
		
		System.out.println("Value: " + b.getValue());
		System.out.println("Even: " + MyInteger.isEven(b));
		System.out.println("Odd: " + MyInteger.isOdd(b));
		System.out.println("Prime: " + MyInteger.isPrime(b));
		System.out.println();
		
		System.out.println("a equals 8:" + a.equals(8));
		System.out.println("a equals b:" + a.equals(b));
		
		
	}
}
