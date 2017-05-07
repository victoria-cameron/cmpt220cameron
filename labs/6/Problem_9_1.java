public class Problem_9_1{
/** Main method */
  public static void main(String[] args) {
    //Make the two rectangles (4.40) (3.5,35.9)
    Rectangle rectangle = new Rectangle(4, 40);
    Rectangle rectangle1 = new Rectangle(3.5, 35.9);

    // Display the width, height, area, and perimeter of rectangle
    System.out.println("\n First Rectangle");
    System.out.println("-------------");
    System.out.println("Width: " + rectangle.width);
    System.out.println("Height: " + rectangle.height);
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());

    // Display the width, height, area, and perimeter of rectangle2
    System.out.println("\n Second Rectangle");
    System.out.println("-------------");
    System.out.println("Width: " + rectangle1.width);
    System.out.println("Height: " + rectangle1.height);
    System.out.println("Area: " + rectangle1.getArea());
    System.out.println("Perimeter: " + rectangle1.getPerimeter());
  }
}