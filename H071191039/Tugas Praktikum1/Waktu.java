import java.util.Scanner;
public class Waktu {

    public static void main(String[] args) {
        Scanner Waktu = new Scanner (System.in);

        int jam,menit,detik;
        System.out.println("input detik =");
        detik = Waktu.nextInt();
        jam = detik/3600;
        detik = detik-(jam*3600);
        menit = detik/60;
        detik = detik-(menit*60);

        System.out.printf("%02d:%02d:%02d" ,jam,menit,detik);
    }

}