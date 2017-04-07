//file: Problem_1_3.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 1
//due date: January 26, 2017
//version: 1.0
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Problem_1_3{
  public static void main(String[] args) throws ParseException{

    String date = String.valueOf(day2);
    String months = String.valueOf(month2);
    String year = "2017";
    String birthdayThisYear = date + " " + months +" "+ year;

    String pattern = "dd MM yyyy";
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    String today = new SimpleDateFormat(pattern).format(new Date());

    if (today.compareTo(birthdayThisYear) > 0)
      year = "2018";
      String birthdayNextYear = date + " " + months + " " + year;


    try {
        Date date1 = myFormat.parse(today);
        Date date2 = myFormat.parse(birthdayThisYear);
        long diff = date2.getTime() - date1.getTime();
        diff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        System.out.println ("Days: " + diff);
    }
    catch (ParseException e) {
        e.printStackTrace();
    }

  }

}