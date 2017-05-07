public class Rectangle {
	double width;	// Width of rectangle
	double height;	// Height of rectangle

	//constructor
	Rectangle() {
		width = 1;
		height = 1;
	}

	// A constructor that makes new rectangles with inputs
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	//Calculate area
	double getArea() {
		return width * height;
	}
	//Calculate perimeter
	double getPerimeter() {
		return 2 * (width + height);
	}
}