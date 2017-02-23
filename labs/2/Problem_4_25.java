//file: Problem_4_25.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 2
//due date: February 9, 2017
//version: 1.0

public class Problem_4_25{
  public static void main(String[] args) {

    //create three uppercase letters
    int j1 = 65 + (int)(Math.random() * (90 - 65));
    int j2 = 65 + (int)(Math.random() * (90 - 65));
    int j3 = 65 + (int)(Math.random() * (90 - 65));

    //create four random numbers
    int k1 = (int)(Math.random() * 10);
    int k2 = (int)(Math.random() * 10);
    int k3 = (int)(Math.random() * 10);
    int k4 = (int)(Math.random() * 10);

    //print the plate number
    System.out.println("" + (char)(j1) + ((char)(j2)) + ((char)(j3)) +
        k1 + k2 + k3 + k4);
  }
}