import java.util.Scanner; 
public class Problem_4_5{
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    //Get the number of sides
    System.out.print("Enter the number of sides: ");
    double n = input.nextDouble();

    //Get the length of sides
    System.out.print("Enter the length of the sides: ");
	double s = input.nextDouble();

    //Calculate area [n * s^2 / (4 * tan(3.14 / n))]
    double a = ((n * Math.pow(s,2)) / (4 * Math.tan(Math.PI / n)));

    //print area
    System.out.println("The area of the polygon is: " + a + ".");
  }
}