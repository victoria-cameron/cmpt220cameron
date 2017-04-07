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

    int day = 1;
    int month = 12;
    String year = "2017";
    String date = String.valueOf(day);
    String months = String.valueOf(month);

    String birthdayThisYear = date + " " + months +" "+ year;

    String pattern = "dd MM yyy";
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    String today = new SimpleDateFormat(pattern).format(new Date());
    String inputString2 = birthdayThisYear;

    try {
        Date date1 = myFormat.parse(today);
        Date date2 = myFormat.parse(inputString2);
        long diff = date2.getTime() - date1.getTime();
        diff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        System.out.println ("Days: " + diff);
    } catch (ParseException e) {
        e.printStackTrace();
    }

  }

}