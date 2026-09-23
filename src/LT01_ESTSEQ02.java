import javax.swing.*;

public class LT01_ESTSEQ02 {
    public static void main (String args[]){
        double Salario, Reajuste;
        Salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do Salario desse funcionario? "));
        Reajuste = Salario * 1.15;
        JOptionPane.showMessageDialog(null, "O Reajuste foi para: "+Reajuste);
    }
}
