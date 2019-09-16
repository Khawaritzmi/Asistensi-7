import java.util.Scanner;
class Praktikum1 {
    public static void main(String[] args) {
        Scanner ra = new Scanner(System.in);
        int WaktuTempuh = ra.nextInt();
        int kecepatan = ra.nextInt();
        double efisiensi =14;
        double hasil = (kecepatan * WaktuTempuh)/efisiensi;

        System.out.printf("Bensin yang digunakan : %.3f L" , hasil);

    }
}