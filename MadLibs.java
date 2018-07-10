
/**
 * Write a description of class MadLibs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
*/
import java.util.Scanner;
public class MadLibs
{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String noun1, noun2, noun3, noun4, noun5, noun6;
        String adj1, adj2, adj3, adj4, adj5, adj6;
        String verb1, verb2, verb3, verb4, verb5;
        
        System.out.println("Please enter a noun");
        noun1 = input.nextLine();
        noun2 = input.nextLine();
        noun3 = input.nextLine();
        noun4 = input.nextLine();
        noun5 = input.nextLine();
        noun6 = input.nextLine();
        System.out.println("Please enter a verb");
        verb1 = input.nextLine();
        verb2 = input.nextLine();
        verb3 = input.nextLine();
        verb4 = input.nextLine();
        verb5 = input.nextLine();
        System.out.println("Please enter a adjective");
        adj1 = input.nextLine();
        adj2 = input.nextLine();
        adj3 = input.nextLine();
        adj4 = input.nextLine();
        adj5 = input.nextLine();
        adj6 = input.nextLine();
        
        
        
        
        
        System.out.printf("Every %s we %s to a bush %s far away", noun1, verb1, noun2);
        System.out.printf("Not just any %s farm, a %s bush %s.", adj1, adj2, noun3);
        System.out.printf("My dad and I %s onto the %s to %s for the perfect %s.", verb2, noun4, verb3, noun5);
        System.out.printf("Some people like them %s and %s and some like them %s and fat.", adj3, adj4, adj5);
        System.out.printf("We are searching for a tall and %s one.'Over there! I exclaim, 'Dad it's over there!", adj6);
        System.out.printf("Off we %sed, saw in hand to %s this year's %s down.", verb4, verb5, noun6);
        System.out.printf("Yay we got our Hannukah Bush finally");
}
}
