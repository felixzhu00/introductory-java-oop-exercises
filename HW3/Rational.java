public class Rational {
	private int num;
	private int den;
	
	Rational(){
		num = 0;
		den = 1;
	}
	Rational(int a, int b){
		num = a;
		den = b;
		simplify();
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	public static Rational addRat(Rational a, Rational b) {
		return new Rational((a.num * b.den) + (b.num * a.den), a.den * b.den);
	}
	
	public static Rational subRat(Rational a, Rational b) {
		return new Rational((a.num * b.den) - (b.num * a.den), a.den * b.den);
	}
	
	public static Rational multiRat(Rational a, Rational b) {
		return new Rational(a.num * b.num,a.den * b.den);
	}
	
	public static Rational divRat(Rational a, Rational b) {
		return new Rational(a.num * b.den,a.den * b.num);
	}
	
	public String toString() {
		return num + "/" + den;
	}
	
	public void simplify() {
		int gcf = 0;
		for(int i = 2; i <= Math.max(num, den); i++) {
			if(num%i == 0 && den%i == 0) {
				gcf = i;
			}
		}
		if(gcf != 0) {
			num = num/gcf;
			den = den/gcf;
		}
	}
	
	
	
}
