//file: Problem_1_3.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 1
//due date: January 26, 2017
//version: 1.0
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem_1_3{
  public static void main(String[] args) throws ParseException{
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
    Date date1 = sdf.parse("03/04/2017");
    Date birthday = sdf.parse("03/04/2017");

    if (date1.compareTo(birthday) > 0)
      System.out.println ("Bro, your birthday passed");
    else if (date1.compareTo(birthday) < 0)
      System.out.println ("I also see that your birthday is comming soon");
    else if (date1.compareTo(birthday) == 0)
      System.out.println ("Its your birthday today!");

  }

}