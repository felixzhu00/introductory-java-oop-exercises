public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon a = new RegularPolygon();
		RegularPolygon b = new RegularPolygon(6,4);
		RegularPolygon c = new RegularPolygon(10,4,5.6,7.8);
	
		System.out.println("Polygon A\nPerimeter: " + a.getPerimeter() + "\nArea: " + a.getArea());
		System.out.println("Polygon B\nPerimeter: " + b.getPerimeter() + "\nArea: " + b.getArea());
		System.out.println("Polygon C\nPerimeter: " + c.getPerimeter() + "\nArea: " + c.getArea());
	}
}
