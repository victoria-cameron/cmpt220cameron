//Victoria cameron 4.15 keypads thing

import java.util.Scanner;
public class Problem_4_15{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //get a number fromm the user
    System.out.print ("Enter a letter: ");
    String in = input.nextLine();
    char l = in.charAt(0);
    l = Character.toLowerCase(l);


    //see where on the keys that number falls
    int key = 0;
    if (Character.isLetter(l)){
      if (l >= 'w')
        key = 9;
      if (l >= 't' && l <= 'v')
        key = 8;
      if (l >= 'p' && l <= 's')
        key = 7;
      if (l >= 'm' && l <= 'o')
        key = 6;
      if (l >= 'j' && l <= 'l')
        key = 5;
      if (l >= 'g' && l <= 'i')
        key = 4;
      if (l >= 'd' && l <= 'f')
        key = 3;
      if (l >= 'a'&& l<='c')
        key = 2;
    //print the key that it relates to
      System.out.println("The corresponding number is " + key);
    }
    else
      System.out.println(in + "is an invalid input.");
  }
}
