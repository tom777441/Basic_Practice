import javax.swing.JOptionPane;
   public class Dialog{
      public static void main(String arg[]){
        int age = 0;

        String input = JOptionPane.showInputDialog("�A���~��?");
        //�r���ഫInt
        age = Integer.parseInt(input);

        if (age >=18)
        { JOptionPane.showMessageDialog( null, "�A�O���~�H�I","�T��", 2 ); }
        else
        { JOptionPane.showMessageDialog( null, "�T��i�J�I","�T��", 0 ); }

      System.exit(0);
     }
   }
