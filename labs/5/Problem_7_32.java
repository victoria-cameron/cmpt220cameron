//file: Problem_7_32.java
//author: Victoria Cameron
//course: CMPT 220
//assignment:lab 5
//due date: March 3, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_7_32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //get uuser input and make the array
    System.out.print("Enter list:");
    int[] list1 = new int[input.nextInt()];
    for (int i = 0; i < list1.length; i++) {
     list1[i] = input.nextInt();
    }

    //Use partition to sort list
    partition(list1);


    //Print list
    System.out.print("After the partition, the list is ");

    for (int i = 0; i < list1.length; i++) {
     System.out.print(list1[i] + " ");
    }

  }

  //Partition will sort with a pivot number: all numbers lower below; higher above
  public static int partition(int[] list) {
    int partitionList = list[0];
    int partitionLength = 0;
    int partLength = list.length-1;

    while(partitionLength < partLength) {

    //swap partition and the next item
     if(partitionList>list[partitionLength+1]) {
      list[partitionLength] = list[partitionLength+1];
      list[partitionLength+1] = partitionList;
      partitionLength++;
     }
    //move the item to the end of the list
    else {
      int temp = list[partLength];
      list[partLength]=list[partitionLength+1];
      list[partitionLength+1] = temp;
      partLength--;

     }
    }

    return partitionLength;
  }
}