import javax.swing.*;

public class LT01_ESTDEC18 {
    public static void main(String[] args) {
        int a, b, dif;
        a = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro numero? "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo numero? "));
        if (a > b) {
            dif = a - b;
            JOptionPane.showMessageDialog(null, "A diferença dos valores é: " + dif + " O maior valor é " + a);
        } else {
            dif = b - a;
            JOptionPane.showMessageDialog(null, "A diferença dos valores é: " + dif + " O maior valor é " + b);
        }
    }
}

