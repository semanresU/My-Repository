
/**
 * Write a description of class Random here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class RandomNumber
{
  
    public static void main(String[] args){
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int limit;
        while(run == true){
            System.out.println("What range do you want your number to be in? 1 to ");
        limit = input.nextInt();
            int RanNum = generator.nextInt(10)+1;
        
        
        System.out.printf("Your random number: %d", RanNum);
        System.out.println("Do you want to enter another random number?");
        run = input.nextBoolean();
   }
}
}
