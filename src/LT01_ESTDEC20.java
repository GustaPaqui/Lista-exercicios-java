import javax.swing.*;

public class LT01_ESTDEC20 {
    public static void main(String[] args) {
        int a, b, c;
        double delta, raiz1, raiz2;
        a = Integer.parseInt(JOptionPane.showInputDialog("Qual o coeficiente A? "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Qual o coeficiente B? "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Qual o coeficiente C? "));
        delta = (Math.pow(b, 2)) - (4 * a * c);
        if (delta > 0) {
            raiz1 = (-b + (Math.sqrt(delta))) / (2 * a);
            raiz2 = (-b - (Math.sqrt(delta))) / (2 * a);
            JOptionPane.showMessageDialog(null, "Possui duas raizes reais, a primeira é:" + raiz1 + " Ja a segunda é:" + raiz2);
        } else if(delta==0) {
            raiz1 = (-b + (Math.sqrt(delta))) / (2 * a);
            JOptionPane.showMessageDialog(null, "Possui uma raiz real, sendo ela: " + raiz1);
        }
        else {
            JOptionPane.showMessageDialog(null, "A equação não possui raizes reais, o valor de delta é "+delta);
        }
    }
}
