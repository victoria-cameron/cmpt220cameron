//file: Problem_5_12.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: lab 3
//due date: February 23, 2017
//version: 1.0


public class Problem_5_12{
  public static void main(String[] args) {
    //Create n
    int n = 0;

    //create while n^2 is less than 12000 continue, equal to?
    //Create a while tally for n to keep growing
    while ((Math.pow (n,2)) <= 12000){
      n++;

    }

    //Print result
    System.out.println("The smallest interger n such that n^2 is greater than 12,000: " + n);

  }
}
