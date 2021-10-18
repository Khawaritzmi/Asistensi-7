package TugasPraktikum2;
import java.util.Scanner;
class TugasPrak01 {
    public static void main(String[] args){
    Scanner ra = new Scanner(System.in);
    int genap = 0;
    int ganjil = 0;
    int positif = 0;
    int negatif = 0;

    try {
    int a = ra.nextInt();
    int b = ra.nextInt();
    int c = ra.nextInt();
    int d = ra.nextInt();
    int e = ra.nextInt();

    genap = (a % 2 == 0 ? 1 : 0) + (b % 2 == 0 ? 1 : 0) + (c % 2 == 0 ? 1 : 0) + (d % 2 == 0 ? 1 : 0) + (e % 2 == 0 ? 1 : 0);
    ganjil = (a % 2 == 1 ? 1 : 0) + (b % 2 == 1 ? 1 : 0) + (c % 2 == 1 ? 1 : 0) + (d % 2 == 1 ? 1 : 0) + (e % 2 == 1 ? 1 : 0);
    positif = (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0) + (d > 0 ? 1 : 0) + (e > 0 ? 1 : 0);
    negatif = (a < 0 ? 1 : 0) + (b < 0 ? 1 : 0) + (c < 0 ? 1 : 0) + (d < 0 ? 1 : 0) + (e < 0 ? 1 : 0);

        System.out.println(genap + " Angka genap");
        System.out.println(ganjil + " Angka ganjil");
        System.out.println(positif + " Angka positif");
        System.out.println(negatif + " Angka negatif");

        } catch (Exception y) {
            System.out.println("Inputan tidak valid");

        } finally {
            System.out.println("");

        }



    }


}