import java.util.Scanner;
  public class Scanners{
  public static void main(String[] args){
 Scanner input= new Scanner(System.in);
  int age = 0;
  
  System.out.println("please enter your age.");
  age=input.nextInt();
  
  if (age>=18){
    System.out.println("You can vote");
  }
  else{
    System.out.println("You cannot vote yet.");
  }
  
  
  
  }
}