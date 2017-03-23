//file: Driver_lab3.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 3
//due date: February 23, 2017
//version: 1.0

import java.util.Scanner;
public class Driver_lab3{

  public static void main(String[] args) {
      try {
        BufferedReader reader = new BufferedReader(new FileReader("sample.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("sample.ans"));
        String line = reader.readLine();
        while(!line.equals(0+"")){
          String[] att = line.split(" ");
          double x1 = Double.parseDouble(att[0]);
          double y1 = Double.parseDouble(att[1]);
          double x2 = Double.parseDouble(att[2]);
          double y2 = Double.parseDouble(att[3]);
          double p = Double.parseDouble(att[4]);
          double result = Math.pow(Math.pow(Math.abs(x1-x2), p) + Math.pow(Math.abs(y1-y2), p), 1/p);
          System.out.println(result+"");
          line = reader.readLine();
          writer.write(result+"");
          writer.newLine();
        }
        writer.close();
        reader.close();
      }
        catch (IOException e) {
        System.out.println("error");
        // TODO Auto-generated catch block
      }
    }
}
