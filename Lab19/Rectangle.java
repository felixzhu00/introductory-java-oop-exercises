class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2*(width + height);
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
}
