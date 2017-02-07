import java.util.Scanner;
public class Problem_3_8{
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    //get numbers from user
    System.out.print ("Enter three intergers: ");
    int numb1 = input.nextInt();
	int numb2 = input.nextInt();
    int numb3 = input.nextInt();

    int numbX = 0; //I am using this as a placeholder because I dont want to love stored values
    //sort the numbers in incresing order
    if (numb2 < numb1 || numb3 < numb1){
      if (numb2 < numb1){		  
        numbX = numb1;
        numb1 = numb2;
        numb2 = numbX;
      }
      if (numb3 < numb1){
        numbX = numb1;
        numb1 = numb3;
        numb3 = numbX;
      }
    if (numb3 < numb2){
      numbX = numb2;
      numb2 = numb3;
      numb3 = numbX;	  
	}
    //print the numbers in their new order
    System.out.print (numb1 + " " + numb2 + " " + numb3);
    }
  }
}   