import java.util.Scanner;
class Praktikum3 {
    public static void main(String[] args) {

        Scanner ar = new Scanner(System.in);
        // h = ketinggian menara
        // a = sudut elevasi terhadap ujung depan kapal
        // b = sudut elevasi terhadap ujung belakang kapal

        double h = ar.nextInt();
        double a = ar.nextInt();
        double b = ar.nextInt();
        
        double sudut = Math.tan(Math.toRadians(a));
        double alas = sudut*h;
        double sudut1 = Math.tan(Math.toRadians(b));
        double alas1 = sudut1*h;
        double hasil = alas-alas1;

        System.out.printf("Panjang kapal : %.1f m" , hasil);
    }
}