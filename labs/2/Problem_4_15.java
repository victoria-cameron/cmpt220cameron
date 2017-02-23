//Victoria cameron 4.15 keypads thing

import java.util.Scanner;
public class Go_Code{
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
      if (l == "w" || "x" || "y" || "z")
        key = 9;
      if (l == "t" || "u" || "v")
        key = 8;
      if (l == "p" || "q" || "r" || "s")
        key = 7;
      if (l == "m" || "n" || "o")
        key = 6;
      if (l == "j" || "k" || "l")
        key = 5;
      if (l == "g" || "h" || "i")
        key = 4;
      if (l == "d" || "e" || "f")
        key = 3;
      if (l == "a" || "b" || "c")
        key = 2;
    //print the key that it relates to
      System.out.println("The corresponding number is " + key);
    }
    else
      System.out.println(in + "is an invalid input.");
  }
}
