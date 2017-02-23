//Victoria Cameron read number inputs and display the positives
//negitives and averages of the inputs, program ends with 0

import java.util.Scanner;
public class Problem_5_1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //declare the counter for the positives negitives and total
    int pos = 0;
    int neg = 0;
    int cou = 0;
    int tot = 0;

    // get an interger or 0, if interger exit
    System.out.print("Enter an integer, the input ends if it is 0: ");
    int number = input.nextInt();

    if (number == 0){
      System.out.println ("No number entered except 0.");
      System.exit(1);
    }

    //do while for the number
    do{
      if (number > 0)
        pos += 1;
      else if (number < 0)
        neg += 1;
      tot += number;
      cou += 1;
      number = input. nextInt();
    } while (number != 0);

    //calculate the average
    float ave = tot / cou;

    //Display the result
    System.out.println(
      "The number of positive is " + pos +
      "\nThe number of negatives is " + neg +
      "\nThe total is total " + tot +
      "\nThe average is " + ave);

  }
}



