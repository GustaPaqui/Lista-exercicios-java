import javax.swing.*;

public class LT01_ESTSEQ05 {
    public static void main (String args[]){
        int A, B, C;
        double Delta, Raiz1, Raiz2;
        A =Integer.parseInt(JOptionPane.showInputDialog("QUal o valor de A?"));
        B =Integer.parseInt(JOptionPane.showInputDialog("QUal o valor de B?"));
        C =Integer.parseInt(JOptionPane.showInputDialog("QUal o valor de C?"));
        Delta = ((Math.pow(B, 2)) - 4 * A * C);
        Raiz1 = (-B + Math.sqrt(Delta))/(2 * A);
        Raiz2 = (-B - Math.sqrt(Delta))/(2 * A);
        JOptionPane.showMessageDialog(null, "O valor da primeira Raiz é:"+Raiz1);
        JOptionPane.showMessageDialog(null, "O valor da segunda Raiz é:"+Raiz2);
    }
}
