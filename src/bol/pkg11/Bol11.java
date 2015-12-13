package bol.pkg11;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Bol11 {

    public static void main(String[] args) {
        long time_start, time_end;
        JOptionPane.showMessageDialog(null, "ESCRIBE A SEGUINTE FRASE: A documentacion e todo aquel\nconxunto de manuais impresos ou en formato dixital\nque explique unha aplicacion informatica.\nNOTA: Preme enter para rematar");
        time_start = System.currentTimeMillis();

        JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE: A documentacion e todo aquel\nconxunto de manuais impresos ou en formato dixital\nque explique unha aplicacion informatica.");

        time_end = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "TARDACHES " + ((time_end - time_start) / 1000) + " segundos en escribir la frase.");
    
    }
    
}
