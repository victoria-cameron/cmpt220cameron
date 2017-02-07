import java.util.Scanner;
public class Problem_3_11{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  
    //get the month and year from user (2 inputs?)
    System.out.print ("Enter the month as an interger: ");
    int month = input.nextInt();
	System.out.print ("Enter the year as a four digit interger: ");
    int year = input.nextInt();
    // print the month year and number of days

    switch (month){
      case 1: System.out.print ("January " + year + " had 31 days."); break;
      case 2: 
      if (year % 4 == 0){
        System.out.print ("February " + year + " had 29 days.");
      }
      else 
        System.out.print ("February " + year + " had 28 days.");
  
  
  
  
    }
  }
}  