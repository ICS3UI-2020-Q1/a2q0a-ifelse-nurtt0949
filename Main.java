import java.util.Scanner;


/**
 *
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
   Scanner input = new Scanner(System.in);

   //define minimum age
   final int MIN_DRIVER_AGE = 16;
   
   //prompt user to enter arguments
   System.out.println("Please enter your age:");

   //get the age from the user
   int age = input.nextInt();

  //determine if they can drive
  if(age >= MIN_DRIVER_AGE){
 
 //tell them they can drive
 System.out.println("You can legally drive");

  } else {

  //not old enough
  System.out.println("Sorry, you can't legally drive");


  }  
  }
}
