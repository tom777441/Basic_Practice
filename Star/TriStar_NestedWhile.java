package Star;
import javax.swing.*;
public class TriStar_NestedWhile{
   public static void main(String args[]){
     String output="";
     int row, i = 0, j = 0;
     row = Integer.parseInt(JOptionPane.showInputDialog("�аݧA�n�L�X��"
     		+ "�P�P(�Ĥ@��@�ӡB�ĤG���ӡA�l������)?"));
            		   while(i < row){
            		         j = 0;
            		        while(j <= i){
            		               output = output + "* ";
            		               j++;
            		        }
            		        output += "\n";
            		        i++;
            		    }						     
            		    JOptionPane.showMessageDialog(null,  //component parent
            		    		output,	 //content
            		    		"Nested While",  //title      
            		                  JOptionPane.INFORMATION_MESSAGE);//type
            		   System.exit(0);
            		 }
   }
