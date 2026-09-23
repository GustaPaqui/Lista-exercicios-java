import javax.swing.*;

public class LT01_ESTDEC19 {
   public static void main (String [] args){
       Double a, b;
       a=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do primeiro numero? "));
       b=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do segundo numero? "));
       if (a>b){
           JOptionPane.showMessageDialog(null, "O maior valor é: "+a);
       }
       else {
           JOptionPane.showMessageDialog(null, "O maior valor é: "+b);
       }
   }
}
