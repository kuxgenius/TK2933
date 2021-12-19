package Lab3A;

class Rectangle {
	private double width, height;
	
	public Rectangle() {
		width = 0.0;
		height = 0.0;
	}
	
	public void setWidth(double x) {
		this.width = x;
	}
	
	public void setHeight(double y) {
		this.height = y;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (height + width) * 2;
	}
}
