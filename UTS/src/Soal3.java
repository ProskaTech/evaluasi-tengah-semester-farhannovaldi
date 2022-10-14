import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
public class Soal3 {
    public static void main(String[] args) {
        int nomor;
        String a;
        a = JOptionPane.showInputDialog("Masukkan angka : ");
        nomor = Integer.parseInt(a);
        if (nomor > 0) {
            JOptionPane.showMessageDialog(null, "Angka " + nomor + " merupakan Bilangan Positif");
        } else
            JOptionPane.showMessageDialog(null, "Angka " + nomor + " merupakan Bilangan Negatif");
    }
}