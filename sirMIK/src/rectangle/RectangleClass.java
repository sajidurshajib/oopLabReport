package rectangle;

public class RectangleClass {
	private double length;
	private double width;
	
	public RectangleClass() {
		this.length = 1;
		this.width = 1;
	}
	
	public RectangleClass(double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	public double getArea() {
		double arr = length * width;
		return arr;
	}
	
	public double getPerimeter() {
		double peri = 2 * (length + width);
		return peri;
	}
}
