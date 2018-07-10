
/**
 * Write a description of class MoonWeight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MoonWeight
{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a weight in pounds");
    double weight = input.nextDouble();
    weight = weight/6;
    System.out.println("That would be " + weight + "pounds.");
    
 }
}