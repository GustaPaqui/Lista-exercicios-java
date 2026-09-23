import javax.swing.*;

public class LT01_ESTREP33 {
    public static void main (String[] args){
        int N;
        N =Integer. parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        double fra = 0;
        for (int i=1; i<=N; i++){
            fra= fra +(1.0/i);
        }
        JOptionPane.showMessageDialog(null, "A soma da série é: "+fra);
    }
}
