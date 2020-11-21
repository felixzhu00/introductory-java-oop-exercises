public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	Complex(){
		realPart = 0;
		imaginaryPart = 0; 
	}
	Complex(double a,double b){
		realPart = a;
		imaginaryPart = b;
	}
	
	public double getReal() {
		return realPart;
	}
	public double getImag() {
		return imaginaryPart;
	}
	
	public static Complex addCom(Complex a, Complex b) {
		return new Complex(a.realPart + b.realPart, a.imaginaryPart + b.imaginaryPart);
	}
	public static Complex subCom(Complex a, Complex b) {
		return new Complex(a.realPart - b.realPart, a.imaginaryPart - b.imaginaryPart);
	}
}
