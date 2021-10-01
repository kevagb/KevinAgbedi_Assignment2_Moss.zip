//Kevin Agbedi
//CRN:22381
// Professor Rob Alexander
import java.util.Scanner;

public class RandomNumberGuesser {

        public static void main(String[] args){
                // TODO Auto-generated method stub
                int randNum, nextGuess, highGuess, lowGuess;
                String resp;
                char response = 0;
                System.out.println("The Random Number Guesser Game!");
                
                Scanner keyboard= new Scanner (System.in);
                
                RNG rng= new RNG();
                
                do {
                lowGuess=1; //lowest guess user can enter
                highGuess=100;//highest guess user can enter
                randNum=RNG.rand();
                RNG.resetCount();
                System.out.println("Enter your first guess");//Prompt user to enter first guess
                nextGuess= keyboard.nextInt();
                  
                do {
                if (nextGuess>randNum) {   
                        if(RNG.inputValidation(nextGuess, lowGuess, highGuess))
                   {
                       if(nextGuess<=randNum && (randNum-nextGuess)<(randNum-lowGuess))
                       {
                           lowGuess=nextGuess;
                           
                       }
                       if(nextGuess>=randNum && (nextGuess-randNum)<(highGuess-randNum))
                       {
                           highGuess=nextGuess;
                       }
                   }
                        
                System.out.println("Number of guesses is "+rng.getCount());  //Displays number of attempts guessing         
                System.out.println("Your guess is too high"); // displays if guess is too high
                highGuess=nextGuess;                                      
                System.out.println("Enter your next guess between "+lowGuess+" and "+highGuess);// gives user new range to guess from
                nextGuess= keyboard.nextInt();
                } 
                else if (nextGuess<randNum) { 
                        if(RNG.inputValidation(nextGuess, lowGuess, highGuess))
                   {
                       if(nextGuess<=randNum && (randNum-nextGuess)<(randNum-lowGuess))
                    {
                           lowGuess=nextGuess;
                       }
                       if(nextGuess>=randNum && (nextGuess-randNum)<(highGuess-randNum))
                    {
                           highGuess=nextGuess;
                       }
                   }
                        
                System.out.println("Number of guesses is "+rng.getCount());        
                System.out.println("Your guess is too low"); //displays if guess is too low
                lowGuess=nextGuess;     
                System.out.println("Enter your next guess between "+lowGuess+" and "+highGuess);// new range of numbers based on user input
                nextGuess= keyboard.nextInt();
                }
                }while (nextGuess!=(randNum));
                
                if(RNG.inputValidation(nextGuess, lowGuess, highGuess))
        {
            if(nextGuess<=randNum && (randNum-nextGuess)<(randNum-lowGuess)){
                lowGuess=nextGuess;
            }
            if(nextGuess>=randNum && (nextGuess-randNum)<(highGuess-randNum))
            {
                highGuess=nextGuess;
            }
        }

                System.out.println("Number of guesses is "+rng.getCount());
                System.out.println("Congradulations, you guessed correctly \n Try again (y or n)");// gives user choice to play again or quit    
                resp=keyboard.next();
                response=resp.charAt(0);
                
                while (response != 'Y' && response != 'y' && response != 'N' && response != 'n')
        {       System.out.print("Please enter Yes or No: ");
                        resp=keyboard.nextLine();
                        response=resp.charAt(0);}
                
                }while (response=='Y' || response=='y');
                System.out.println("Thank you for playing");
                System.out.println("Programmer: Kevin Agbedi");
                }

}