
/**
 * Write a description of class RockPaperSkizzors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperSkizzors
{
    public static void main(String[] args){
         String userPlay;
         String compPlay = "";
        int compInt;
         boolean run = true;
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        
        System.out.println("Welcome to rock, paper, scissors!");
        compInt = generator.nextInt(3)+1;
        
        switch (compInt){
            case 1:
                compPlay = "rock";
                break;
                case 2:
                compPlay = "paper  ";
                break;
                case 3:
                compPlay = "skizzorz";
                break;
                
       }
      do{
       System.out.println("Enter your play (rock, paper, or skizzorz)");
       userPlay = input.next();
       System.out.printf("Computer play is %s", compPlay);
    
         if(userPlay.equals(compPlay)){
         System.out.println("It's a tie!");
       }
      
       else if(userPlay.equals("rock")){
         if(compPlay.equals("skizzors"))
        System.out.println("Rock beats skizzorz; you win");
        else if(compPlay.equals("paper"))
        System.out.println("Paper beats Rock; you lose");
       }
       else if(userPlay.equals("skizzorz")){
        if(compPlay.equals("rock"))
        System.out.println("Rock beats skizzorz; you lose");
        else if(compPlay.equals("paper"))
        System.out.println("skizzorz beats paper; you win");
       }

       else if(userPlay.equals("paper")){
         if(compPlay.equals("skizzorz"))
        System.out.println("skizzorz beats paper; you lose");
        else if(compPlay.equals("rock"))
        System.out.println("Paper beats Rock; you win");
       }
       else{
          System.out.println("invalid user input.");
        }
        System.out.println("Play again?(true or false)");
        run = input.nextBoolean();
        
    }while(run==true);
    input.close();
    System.exit(0);
    }
 }
