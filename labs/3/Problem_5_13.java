//file: Problem_5_13.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 3
//due date: February 23, 2017
//version: 1.0


public class Problem_5_13{
  public static void main(String[] args) {
    //It will look like 5.12 but will use the cube root finds one less than 1200
    //Create n
    int n = 0;

    //create while n^3 that stays below 12000
    //Create a while tally for n to keep growing
    while ((Math.pow (n + 1,3)) < 12000){
      n++;

    }

    //Print result
    System.out.println("The largest interger n such that n^3 is less than 12,000: " + n);

  }
}

