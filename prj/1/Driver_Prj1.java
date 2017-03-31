//file: Driver_Prj1.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Project 1
//due date: March 30, 2017
//version: 1.0

import java.util.Scanner;
public class Driver_Prj1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Get the lengths of the 2 arrays
    int lengthOne = input.nextInt();
    int lengthTwo = input.nextInt();

    // Create arrays of the users input
    double[] listOne = new double[lengthOne];
    for (int i = 0; i < listOne.length; i++) {
      listOne[i] = input.nextDouble();
    }

    double[] listTwo = new double[lengthTwo];
    for (int i = 0; i < listTwo.length; i++){
      listTwo[i] = input.nextDouble();
    }

    //Print the result of the convolution
    //double[] convolved = convolveVectors (listOne, listTwo);
    //for (int i = 0; i < lengthTwo; i++){
    System.out.print ((convolveVectors (listOne, listTwo) + " "));
    //}

  }

  //convolveVectors will perform all needed operations on lists
  public static double[] convolveVectors (double[] vFirst, double[] vSecond){
    double[] vResult = new double[((vFirst.length + vSecond.length) - 1)];
    for (int idx = 0; idx < vResult.length; idx++){
      for (int shift = 0; shift < vSecond.length; shift++){
        if (((idx - shift) >= 0) && ((idx - shift < vFirst.length)))
          vResult[idx] += vFirst[idx - shift] * vSecond[shift];

      }
    }
    return vResult;
  }
}


