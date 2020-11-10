public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	RegularPolygon(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = x;
	}
	public void setNumber(int n) {
		this.n = n;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setCordX(double x) {
		this.x = x;
	}
	public void setCordY(double y) {
		this.y = y;
	}
	public int getNumber(){
		return n;
	}
	public double getSide(){
		return side;
	}
	public double getCordX(){
		return x;
	}
	public double getCordY(){
		return y;
	}
	public double getPerimeter() {
		return (n*side);
	}
	public double getArea(){
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
}