import javax.swing.JOptionPane;
import java.util.Random;
public class Guess{
     public static void main(String args[]){
	String input="";
	int guess = 0, answer=0;
    Random r = new Random();
	answer =1+r.nextInt(42);

              input= JOptionPane.showInputDialog("���ͼƦr1~42!" 
                           +"\n�ЧA�q�@�q? ");
              guess=Integer.parseInt(input);		
                           do {
                        	     if (guess < answer){		
                        	        guess = Integer.parseInt(JOptionPane.showInputDialog(null,     
                        	                     "���O " + guess + ", �A�j�@�I", "" + answer, 
                        	                      JOptionPane.INFORMATION_MESSAGE));
                        	    }  
                        	    else if (guess > answer){
                        	        guess = Integer.parseInt(JOptionPane.showInputDialog(null,     
                        	                     "���O " + guess + ", �A�p�@�I", "" + answer, 
                        	                      JOptionPane.INFORMATION_MESSAGE));
                        	    }	  	
                        	 } while (guess != answer);
                           JOptionPane.showMessageDialog(null, "�A�u�}����!! ",                      
                                   "�q��F�A���׬O" + answer , 
                                    JOptionPane.INFORMATION_MESSAGE);
                       	    
                           System.exit(0);
                          }
                       }
