//Victoria Cameron Find the cost of touition for the next 10 years and then
//the total cost of tuition for the next four years after that (Total cost)


public class Problem_5_7{
  public static void main(String[] args) {

    //Declare variables
    int totalT = 0; //11 - 14
    int tuition = 10000; //Base tuition
    int tenthY = 0;

    //create the for loop and get the total tuition after 10 years 11-14?
    for (int year = 1; year <= 14; year++){
      tuition += (tuition * .05);

      if (year > 10)
        totalT += tuition;

      if (year == 10)
        tenthY = tuition;
    }

    //get tenth year tuition (^^)

    //print total tuition for 10 years and the four years

    System.out.println("Tuition in ten years: $" + tenthY);

    System.out.println("Total cost for four years' worth of tuition" +
      " after the tenth year: $" + totalT);
  }
}