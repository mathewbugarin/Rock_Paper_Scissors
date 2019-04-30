/** this program will simulate a game of Rock, Paper, Scissors. The program
   is divided into separate methods that perform specific tasks: randomize, 
   getInput, calcWinner, and tiedGame. The program will randomly choose rock, paper, or
   scissors and then calculate the winner based on the decision of the user.
   If the game concludes to a draw, the program will loop.**/

import java.util.Scanner;  

public class Rock_Paper_Scissors
{
   public static void main(String[] args)
   {
      int replay = 1;                           //initialized replay value to 1
      while (replay == 1)                       //program will loop if replay == 1
      {
         int randNum = 3;                       //constant for the max value for the computers choice
         int compVal = randomize(randNum);      //initialized compVal to int method randomize
         int userVal = getInput();              //initialized userVal to int method getInput
         replay = calcWinner(compVal, userVal); //replay is initialized in int method calcWinner to decide the winner
         if (compVal == userVal)                //if-statement only will run IF computer and user chose the same value
         {
            replay = tiedGame();                //replay is re-initialized to 1 in int method tiedGame
         }
      }
   }      
   public static int randomize(int random)   //int method that will get a random value from 1 to 3 for compVal
   {

      int randVal = (int)(Math.random() * random + 1);         //initialize randVal to a random value from 1 to 3
      return randVal;                                          //this will be the computers choice. Rock = 1, Paper = 2
   }                                                           //Scissors = 3

   public static int getInput()              //int method that will get the users input and converts it to a value from 1 to 3
   {
      int userVal = 0;
      Scanner input = new Scanner(System.in);                  //initialized Scanner class
      System.out.print("Choose rock, paper, or scissors?(ALL LOWERCASE): ");
      String choice = input.nextLine();                        //prompt user to input "rock", "paper", or "scissors"
      if (choice.equals("rock"))
      {  
         userVal = 1;                                          //if-statements will initialize a value based on the users
      }                                                        //choice. Rock = 1, Paper = 2, Scissors = 3.
      else if (choice.equals("paper"))
      {
         userVal = 2;
      }
      else if (choice.equals("scissors"))                      //chose.equals() will determine the value based on the users
      {                                                        //choice
         userVal = 3;
      }
      else
      {
         System.out.println("ERROR: Check for spelling, spaces, and lower-casing.");
         System.out.println("ERROR: Please choose 'rock', 'paper', or 'scissors'.");
      }
      return userVal;                                          //return the users value
   }
          
   public static int calcWinner(int comp, int user)            //int method that will decide who is the winner
   {
      if (comp < user)                                         //a list of if-statements based on if users value > computers value
      {
         if (comp == 1 && user == 2)                                 //if-statement if user chose "paper" and computer chose
         {                                                           //1(rock)
            System.out.println("Computer chose Rock.");
            System.out.println("Paper wraps rocks. Paper wins!");
            System.out.println("You win!");
         }
         else if (comp == 1 && user == 3)                            //if-statement if user chose "scissors" and computer chose
         {                                                           //1(rock)
            System.out.println("Computer chose Rock.");
            System.out.println("Rock smashes scissors. Rock wins!");
            System.out.println("Computer wins!");
         }
         else if (comp == 2 && user == 3)                            //if-statement if user chose "scissors" and computer chose
         {                                                           //2(paper)
            System.out.println("Computer chose paper.");
            System.out.println("Scissors cuts paper. Scissor wins!");
            System.out.println("You win!");
         }
      }
      if (user < comp)                                               //a list of if-statements based on if users value < computers value                            
      {
         if (user == 1 && comp == 2)                                 //if-statement if user chose "rock" and computer chose
         {                                                           //2(paper)
            System.out.println("Computer chose Paper.");
            System.out.println("Paper wraps rocks. Paper wins!");
            System.out.println("Computer Wins!");
         }
         else if (user == 1 && comp == 3)                            //if-statement if user chose "rock" and computer chose
         {                                                           //3(scissors)
            System.out.println("Computer chose Scissors.");
            System.out.println("Rock smashes Scissors. Rock wins!");
            System.out.println("You win!");
         }
         else if (user == 2 && comp == 3)                            //if-statement if user chose "paper" and computer chose
         {                                                           //3(scissor)
            System.out.println("Computer chose Scissors.");
            System.out.println("Scissors cuts papers. Scissors wins");
            System.out.println("Computer Wins!");                    //all statements will display a winner unless the user
         }                                                           //and computer chose the same choice
      }
      int replay = 0;                                                //replay value is changed to 0 to prevent loop
      return replay;                                                 //returned replay value
   }
   public static int tiedGame()                                      //int method that will ONLY run IF compVal == userVal                                            
   {
      System.out.println("Its a tie!");                                    //displays that the game is a tie
      System.out.println("You must play again.");
      int replay = 1;                                                      //replay value is changed back to 1
      return replay;                                                       //returned replay value
   }
}   