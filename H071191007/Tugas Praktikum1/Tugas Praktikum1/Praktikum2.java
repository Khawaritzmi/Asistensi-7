import java.util.Scanner;
class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int detik, menit, jam;
        detik = sc.nextInt();

        jam = detik/3600;
        menit = (detik%3600)/60; 
        detik = (detik%3600)%60;
     

        System.out.printf("%02d : %02d : %02d", jam,menit,detik);
    }
}