import javax.swing.*;

public class LT01_ESTREP35 {
    public static void main (String[] args){
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor? "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor? "));
        int menor = Math.min(a,b);
        int maior = Math.max(a,b);
        int soma = 0;

        for (int i = menor;i<=maior; i++){
            if (i% 2 !=0){
                soma = soma + i;
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("Soma dos impares: "+soma);
    }
}
