public class TestRectangle {
	public static void main(String[] args) {
	Rectangle r1 = new Rectangle(4,40);
	Rectangle r2 = new Rectangle(3.5,35.9);
	
	System.out.println("Rectangle 1\nwidth: " + r1.getWidth() + " height: " + r1.getHeight() + " area: " + r1.getArea() + " perimeter: " + r1.getPerimeter());
	System.out.println("Rectangle 2\nwidth: " + r2.getWidth() + " height: " + r2.getHeight() + " area: " + r2.getArea() + " perimeter: " + r2.getPerimeter());
	
	}
}
