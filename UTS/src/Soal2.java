import java.util.Scanner;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
public class Soal2 {
    public static void main(String[] args) {
        int i, j, k, x;
        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris : ");
        x = dataMasuk.nextInt();
        for (i = x; i >= 1; i--) {
            for (j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2 * i); k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (i = 1; i <= x; i++) {
            for (j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}