package Star;
import java.util.Scanner;
public class Star{
   public static void main(String args[]){
      int row;
      Scanner input = new Scanner(System.in);
      System.out.print("�аݧA�n�L�X��P�P(�Ĥ@��@�ӡB�ĤG���ӡA�l������)?");
      row = input.nextInt();
      
      //���T��
      for(int i=1; i<= row; i++){
           for (int j = 1; j <= i; j++){ System.out.print("*"); }
           System.out.println();
      }
      System.out.println("----------------------------------------------");
      
      //�ˤT��
      for(int i=row; i>= 1; i--){
          for (int j = 1; j <= i; j++){  System.out.print("*"); }
          System.out.println();
        }

      System.out.println("-----------------------------------------------");
      
      //���k��-�ˤT��
      for(int i=0; i<row; i++){
          for(int j=1; j<=row; j++) {  
                System.out.print(j<=i ? " " : "*"); 
          }
          System.out.println();
    }
      System.out.println("-----------------------------------------------");
      
      //���k��-���T��   
      for(int i=row; i>0; i--){
            for(int j=1; j<=row; j++){System.out.print(j<i ? " " : "*");
            }		
            System.out.println();
      }
      input.close();  }
}
