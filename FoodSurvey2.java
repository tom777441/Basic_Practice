import java.util.Scanner;

public class FoodSurvey2{
  public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   int response=0, counter = 0, r1=0, r2=0, r3=0,flag=0;
   flag = input.nextInt();
   while (flag != -1){       
     System.out.print("�䨧�G��J1,�H�J�ο�J2,������J3(�@�p5��):"); 
     response = input.nextInt();
     if (response == 1){ r1++ ;}
     else if (response == 2){ r2++;}
     else if (response == 3){ r3++;}  
     counter++;
     flag = input.nextInt();
   }
  System.out.println("�䨧�G�H�� " + r1 + "\n(2)�H�J�ΤH��" + r2 + "\n(3)�����H��" + r3);
  System.out.println("�벼�H�� " + counter);

  System.out.printf("�䨧�G��v %.2f",(counter !=0 ? (double)r1/counter : 0)); //����r/counter������0
  System.out.printf("\n�H�J�Τ�v %.2f",(counter !=0 ? (double)r2/counter : 0));
  System.out.printf("\n������v: %.2f",(counter !=0 ? (double)r3/counter : 0));
  
  input.close(); 
  }
}
