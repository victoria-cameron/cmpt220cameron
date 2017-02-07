import java.util.Scanner;
public class GradeCalc{
  public static void main (String [] args){
    System.out.println ("Please enter the following as Percentage...");
    Scanner input = new Scanner(System.in);
    
    //Midterm Grade %20
    System.out.print ("midterm exam: ");
    double midterm = input.nextDouble();
    midterm = midterm * .20; 
	
    //Final exam %20
    System.out.print ("final exam: ");
    double finals = input.nextDouble ();
    finals = finals * .20;

    //Projects %20
    System.out.print ("projects: ");
    double project = input.nextDouble();
    project = project * .20;

    //Homework and labs %40
    System.out.print ("homework and labs: ");
    double homework = input.nextDouble();
    homework = homework * .40;

    //Add, multiply, print result
    double total = 0; 
    total = midterm + finals + project + homework;
    total = total * 100;
   
    if (total >= 95)
      System.out.print ("Your final  grade is: A");
	else if (total >= 90)
      System.out.print ("Your final  grade is: A-");
    else if (total >= 87)
      System.out.print ("Your final  grade is: B+");
    else if (total >= 83)
      System.out.print ("Your final  grade is: B");
    else if (total >= 80)
      System.out.print ("Your final  grade is: B-");
    else if (total >= 77)
      System.out.print ("Your final  grade is: C+");
    else if (total >= 73)
      System.out.print ("Your final  grade is: C");
    else if (total >= 70)
      System.out.print ("Your final  grade is: C-");
    else if (total >= 65)
      System.out.print ("Your final  grade is: D+");
    else if (total >= 60)
      System.out.print ("Your final  grade is: D");
    else
      System.out.print ("Your final  grade is: F");
   
  }
}
	  
	
	
	
	
	
	
	
