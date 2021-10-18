package TugasPraktikum;
import java.util.Scanner;
class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.println("**Menu**");
            System.out.println("1. Mencari Luas Bangun Datar");
            System.out.println("2. Mencari Volume Bangun Ruang");
            System.out.print("Input angka sesuai dengan menu yang diinginkan : ");
            int bangun = sc.nextInt();

            switch(bangun){
                case 1 :
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah ketupat");
                System.out.println("8. Layang-layang");
                System.out.print("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
                int datar = sc.nextInt();

                switch(datar){
                    case 1 :
                    System.out.println("Input panjang sisi : ");
                    double sisi=sc.nextDouble();
                    double luas = Math.pow(sisi, 2);
                    System.out.printf("Luas persegi = %.1f", luas);
                    break;

                    case 2 :
                    System.out.println("Input Panjang");
                    double panjang = sc.nextDouble();
                    System.out.println("Input Lebar");
                    double lebar = sc.nextDouble();
                    luas = panjang*lebar;
                    System.out.printf("Luas persegi panjang = %.1f", luas);
                    break;

                    case 3 :
                    System.out.println("Input Alas");
                    double alas = sc.nextDouble();
                    System.out.println("Input Tinggi");
                    double tinggi = sc.nextDouble();
                    luas=(alas*tinggi)/2;
                    System.out.printf("Luas persegi panjang = %.1f", luas);
                    break;

                    case 4 :
                    System.out.println("Input jari-jari");
                    double jariJari = sc.nextDouble();
                    luas = Math.PI*Math.pow(jariJari, 2);
                    System.out.printf("Luas persegi panjang = %.1f", luas);
                    break;
                }
            }
    }
}
