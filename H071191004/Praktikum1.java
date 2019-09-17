import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lama perjalanan = ");
        int waktu = sc.nextInt();
        System.out.print("kecepatan (km/jam) = ");
        int kecepatan = sc.nextInt();

        double bensin = (double) (waktu*kecepatan)/14;
        System.out.printf("penggunaan bensin %.3f", bensin );

    }
}