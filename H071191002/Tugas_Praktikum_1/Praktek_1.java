import java.util.Scanner;
class Praktek_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa lama perjalanan ? : ");
        int waktu = sc.nextInt();
        System.out.print("Kecepatan rata-rata (km/jam) : ");
        int kecepatan = sc.nextInt();

        double penggunaanBensin = (double)waktu*kecepatan/14 ;

        System.out.printf("Bensin terpakai adalah %.3f L", penggunaanBensin);
    }
}