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
 
    int win = 0;
    // Check the guess 
	if (playerGuess == originalLottery) 
      win = 1;
      
	else if (guessDigit2 == lotteryDigit1 
      ||guessDigit3 == lotteryDigit1 
      && guessDigit1 == lotteryDigit2
      ||guessDigit3 == lotteryDigit2
      && guessDigit1 == lotteryDigit3
      || guessDigit2 == lotteryDigit3)	
      win = 2;	  
       
    else if (guessDigit1 == lotteryDigit1 
      || guessDigit1 == lotteryDigit2 
      || guessDigit1 == lotteryDigit3
      || guessDigit2 == lotteryDigit1 
      || guessDigit2 == lotteryDigit2
      || guessDigit2 == lotteryDigit3
      || guessDigit3 == lotteryDigit1
      || guessDigit3 == lotteryDigit2
      || guessDigit3 == lotteryDigit3) 
      win = 3;
      
    else
      win = 4;
      
	  
    switch (win){
      case 1: System.out.println("Exact match: you win $10,000"); break;
      case 2: System.out.println("Match two digits: you win $3,000"); break;
      case 3: System.out.println("Match one digit: you win $1,000"); break;
      case 4: System.out.println ("Sorry, no match"); break;
	}
  }
}