import javax.swing.*;

public class LT01_ESTSEQ04 {
    public static void main (String args[]){
        double Celcius, F;
        Celcius =Double.parseDouble(JOptionPane.showInputDialog("Qual a temperatura em gruas Celcius? "));
        F = (9*Celcius+160)/5;
        JOptionPane.showMessageDialog( null, "A temperatura em Fahrenheit é: "+F);
    }
}
