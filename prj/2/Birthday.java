
//file: Birthday.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Project 2
//due date: May, 2017
//version: 0.4

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.io.*;
import java.util.concurrent.TimeUnit;


public class Birthday{
  int month = 1;
  int date = 1;
  int year = 1900;
  int a = 0;
  int b = 0;
  int c = 0;
  long diff = 1;
  String yourBirthday = new String("ERROR");
  String writtenMonth = new String("ERROR");
  String weekday = new String("ERROR");
  String birthdayThisYear = new String ("ERROR");
  String pattern = "dd MM yyyy";
  SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
  String today = new SimpleDateFormat(pattern).format(new Date());
  String daysTill = new String ("ERROR");
  //Constructor
  public Birthday(){
  }
  //Turns the number into the string of what month you were born.
  public void monthWriten (int month){
    if (month == 0)
        writtenMonth = "January";
      else if (month == 1)
        writtenMonth = "February";
      else if (month == 2)
        writtenMonth = "March";
      else if (month == 3)
        writtenMonth = "April";
      else if (month == 4)
        writtenMonth = "May";
      else if (month == 5)
        writtenMonth = "June";
      else if (month == 6)
        writtenMonth = "July";
      else if (month == 7)
        writtenMonth = "August";
      else if (month == 8)
        writtenMonth = "September";
      else if (month == 9)
        writtenMonth = "October";
      else if (month == 10)
        writtenMonth = "November";
      else if (month == 11)
       writtenMonth = "December";
  }

  //returns the day of the week you were born
  public void dayOfTheWeek(int year1, int day1, int month1){
    //Teller for leap year
    if (year1%4 == 0){
      if (month1 == 0)
        a = 0;
      else if (month1 == 1)
        a = 3;
      else if (month1 == 2)
        a = 4;
      else if (month1 == 3)
        a = 0;
      else if (month1 == 4)
        a = 2;
      else if (month1 == 5)
        a = 5;
      else if (month1 == 6)
        a = 0;
      else if (month1 == 7)
        a = 3;
      else if (month1 == 8)
        a = 6;
      else if (month1 == 9)
        a = 1;
      else if (month1 == 10)
        a = 4;
      else if (month1 == 11)
        a = 6;
    else
      if (month1 == 0)
        a = 1;
      else if (month1 == 1)
        a = 4;
      else if (month1 == 2)
        a = 4;
      else if (month1 == 3)
        a = 0;
      else if (month1 == 4)
        a = 2;
      else if (month1 == 5)
        a = 5;
      else if (month1 == 6)
        a = 0;
      else if (month1 == 7)
        a = 3;
      else if (month1 == 8)
        a = 6;
      else if (month1 == 9)
        a = 1;
      else if (month1 == 10)
        a = 4;
      else if (month1 == 11)
        a = 6;
    }
    year1 -= 1900;
    b = year1 / 4;
    c = year1 + b + day1 + a;
    c = c%7;
    if (c == 1)
      weekday = "Sunday";
    else if (c == 2)
      weekday = "Monday";
    else if (c == 3)
      weekday = "Tuesday";
    else if (c == 4)
      weekday = "Wednesday";
    else if (c == 5)
      weekday = "Thursday";
    else if (c == 6)
      weekday = "Friday";
    else if (c == 7)
      weekday = "Saturday";
  }

  //compares your birthday to today to tell if your birthday has passed
  public void whensBirthday(int year2, int month2, int day2) throws ParseException{
    month2 = month2 + 1;
    String date = String.valueOf(day2);
    String months = String.valueOf(month2);
    String year = "2017";
    birthdayThisYear = date + " " + months + " " + year;
    String newYear = "2018";
    //if (today.compareTo(birthdayThisYear) > 0)
      //birthdayThisYear = date + " " + months + " " + newYear;
    try {

      Date date1 = myFormat.parse(today);
      Date date2 = myFormat.parse(birthdayThisYear);
      long diff = date2.getTime() - date1.getTime();
      diff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
      daysTill = "You always have a birthday comming. You've got " +
        diff + " days till your next special day!";
    }
    catch (ParseException e) {
      e.printStackTrace();
    }
  }
}