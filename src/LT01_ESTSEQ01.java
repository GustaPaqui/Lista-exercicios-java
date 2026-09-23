import javax.swing.JOptionPane;

public class LT01_ESTSEQ01 {
    public static void main (String args[]) {
        double lado, area;
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado: "));
        area = Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "Área: "+area);
    }
}
