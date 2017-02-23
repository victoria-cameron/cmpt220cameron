//Victoria Cameron changing listing 2.10 to  read all of the cents

import java.util.Scanner;
public class Problem_4_26{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print ("Enter an amount, for example 11.56: ");
    String amount = input.nextLine();

    //get dollars
    String doll = amount.substring (0, amount.indexOf('.'));

    //get cents
    int cent = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

    //split quarters, dimes, nickels, and pennies
    int quar = cent / 25;
    cent %= 25;

    int dime = cent / 10;
    cent %= 10;

    int nick = cent / 5;
    cent %= 5;

    int pene = cent;

    //Print results
    System.out.println ("Your amount " +amount+ " consists of");
    System.out.println("    " + doll + " dollars ");
    System.out.println("    " + quar + " quarters ");
    System.out.println("    " + dime + " dimes ");
    System.out.println("    " + nick + " nickels ");
    System.out.println("    " + pene + " Pennies ");


  }
}