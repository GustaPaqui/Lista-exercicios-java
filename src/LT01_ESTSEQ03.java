import javax.swing.*;

public class LT01_ESTSEQ03 {
    public static void main (String args[]){
        int base, altura;
        double área;
        base = Integer.parseInt(JOptionPane.showInputDialog("Qual a base do Triangulo? "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Qual é a altura do Triangulo? "));
        área = (base*altura) / 2;
        JOptionPane.showMessageDialog(null, "A área do Triangulo é : "+área);
    }
}
