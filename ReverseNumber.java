import java.util.Scanner;
public class ReverseNumber{
  public static void main (String[] args){
      int number, lastDigit, reverse = 0;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter any positive integer: ");     
     number = input.nextInt();
      do {
         lastDigit = number % 10;
         reverse = (reverse * 10) + lastDigit;
         number = number / 10;
      } while (number > 0);
      System.out.println("That number  reversed is " + reverse);
      
      input.close(); 
  }
}
