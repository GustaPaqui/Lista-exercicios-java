import javax.swing.*;

public class LT01_ESTREP31 {
    public static void main(String args[]) {

        for (int i=10; i<151; i++) {
           int quad = (int) Math.pow(i, 2);
           System.out.println( "O quadrado de "+i+" é :"+quad);
        }
    }
}
