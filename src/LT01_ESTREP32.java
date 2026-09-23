import javax.swing.*;

public class LT01_ESTREP32 {
    public static void main (String[] args){
        int n;
        n =Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        long fat=1;
        for (int i=1;i<=n; i++){
            fat = fat * i;

        }
        JOptionPane.showMessageDialog(null,"O fatorial de "+n+" é: "+fat);
    }
}
