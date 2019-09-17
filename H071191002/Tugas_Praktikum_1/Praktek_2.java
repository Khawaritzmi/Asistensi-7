import java.util.Scanner;
class Praktek_2{
    public static void main(String[] args) {
        int detik, menit,jam;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan detik : ");
        detik = input.nextInt();
        
        jam = detik/3600;
        menit = (detik%3600)/60;
        detik = (detik%3600)%60;
        
            System.out.printf("%02d : %02d : %02d",jam,menit,detik);

    }
}