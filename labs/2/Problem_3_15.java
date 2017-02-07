import java.util.Scanner; 
public class Problem_3_15{
  public static void main(String[] args) { 
  // Generate a lottery number 
    int originalLottery = (int)(Math.random() * 1000); 
    
    // Prompt the user to enter a guess 
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter your lottery pick (three digits): "); 
    int playerGuess = input.nextInt(); 

    System.out.println("The lottery number is " + originalLottery);

    int lottery = originalLottery; 
    int guess = playerGuess;

    // Get digits from lottery 
    int lotteryDigit1 = lottery % 10;
    lottery = lottery / 10;
    int lotteryDigit2 = lottery % 10;
    lottery = lottery / 10;
    int lotteryDigit3 = lottery % 10;
    lottery = lottery / 10; 

    // Get digits from guess 
    int guessDigit1 = guess % 10;
    guess = guess / 10;
    int guessDigit2 = guess % 10;
    guess = guess / 10;
    int guessDigit3 = guess % 10;
    guess = guess / 10; 
 
	
    // Check the guess 
	if (playerGuess == originalLottery) 
      System.out.println("Exact match: you win $10,000");
	else if (guessDigit2 == lotteryDigit1 
      ||guessDigit3 == lotteryDigit1 
      && guessDigit1 == lotteryDigit2
      ||guessDigit3 == lotteryDigit2
      && guessDigit1 == lotteryDigit3
      || guessDigit2 == lotteryDigit3)	  
      System.out.println("Match two digits: you win $3,000"); 
    else if (guessDigit1 == lotteryDigit1 
      || guessDigit1 == lotteryDigit2 
      || guessDigit1 == lotteryDigit3
      || guessDigit2 == lotteryDigit1 
      || guessDigit2 == lotteryDigit2
      || guessDigit2 == lotteryDigit3
      || guessDigit3 == lotteryDigit1
      || guessDigit3 == lotteryDigit2
      || guessDigit3 == lotteryDigit3) 
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println ("Sorry, no match");
  }
}