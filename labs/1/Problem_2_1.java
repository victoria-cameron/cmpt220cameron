public class Problem_2_1{
  public static void  main(String[] args){
	  //display welcome
	  System.out.println ("Welcome to the Celsius to Fahrenheit converter");
	  //receive temp
	  System.out.print ("Enter a temprature to convert to Fahrenheit");
	  double celsius =  input.nextDouble();
	  // convert temp
	  double fahrenheit = (9.0 / 5) * celsius + 32;
	  //show new temp
	  System.out.println (celsius + "Celsius is" + fahrenheit + "Fahrenheit")
  }
}