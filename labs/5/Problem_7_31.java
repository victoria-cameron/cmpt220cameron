//file: Problem_7_31.java
//author: Victoria Cameron
//course: CMPT 220
//assignment:lab 5
//due date: March 3, 2017
//version: 1.0


import java.util.Scanner;

public class Problem_7_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// get user input for 2 lists
		System.out.print("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		System.out.print("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		// Merge lists
		int[] mergeList = merge(list1, list2);

		// Display the merged list
		System.out.print("The merged list is");
		for (int e: mergeList) {
			System.out.print(" " + e);
		}
		System.out.println();
	}

	// merge combines the lists and merges them
	public static int[] merge(int[] list1, int[] list2)  {
		int[] newList = new int[list1.length + list2.length];

		for (int i = 0; i < list1.length; i++)
			newList[i] = list1[i];

		for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
			newList[j] = list2[i];
		}
    //Use seprate code to sort the merged list
		sort(newList);

		return newList;
	}

	// sort will change this into accending order
	public static void sort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
			int minIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min;
			}
		}
	}
}