import javax.swing.*;

public class LT01_ESTREP34 {
    public static void main (String[] args){
        int n, mult;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));

        for(int i=1; i<11; i++){
            mult= i * n;
            System.out.println(n+" x "+i+" = "+mult);
        }
    }
}
