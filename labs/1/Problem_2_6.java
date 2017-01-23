import java.util.Scanner;
public class Problem_2_6{
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    //get the number
    System.out.print ("Enter a number between 0 and 1000: ");
    int number = input.nextInt();
    //separate the intergers
    int ones = number % 10;
    number = number / 10;
    int tens = number % 10;
    number = number / 10;
    int hund = number % 10;
    number = number / 10;
    int sum = hund + tens + ones;
    //show result
    System.out.println ("The sum of the digits is " + sum);
  }
}

    