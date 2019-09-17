import java.util.Scanner;
class Praktikum2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan detik = ");
        int detik = sc.nextInt();
        int jam = detik/3600;
        detik = detik%3600;
        int menit = detik/60;
        detik = detik%60;
        System.out.printf("%02d : %02d : %02d" ,detik,menit,jam);
    }
}