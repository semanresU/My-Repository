
/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Loops
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean run = true;
        
        while(run==true){
    System.out.println("Please enter a number to count up to:");
    int limit = input.nextInt();
    
    for(int i=0; i<=limit; i++){
        System.out.println(i+" ");
        
        
    }
    System.out.println();
    System.out.println("Do you want to continue running the program(True or False)");
    run = input.nextBoolean();
    }
}
}