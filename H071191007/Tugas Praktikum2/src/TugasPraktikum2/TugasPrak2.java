package TugasPraktikum2;
import java.util.Scanner;
class TugasPrak2 {
    public static void main(String[] args) {
        Scanner mi = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar ");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan menu yang di inginkan");
        int menu = mi.nextInt();

        if (menu == 1) {
            System.out.println(" ** pilih bangun datar **");
            System.out.println("1. Persegi ");
            System.out.println("2. Persegi Panjang ");
            System.out.println("3. Segitiga ");
            System.out.println("4. Lingkaran ");
            System.out.println("5. Jajar Genjang ");
            System.out.println("6. Trapesium ");
            System.out.println("7. Belah Ketupat ");
            System.out.println("8. Layang-Layang ");
            System.out.println(" input angka sesuai dengan nomor bangun datar yang diinginkan ");
            System.out.println(" ");
            int bangun = mi.nextInt();

            if (bangun == 1) {
                System.out.println("input panjang");
                int panjang = mi.nextInt();
                System.out.println("input lebar");
                int lebar = mi.nextInt();
                double luas = panjang*lebar;
                System.out.println("Luas persegi = " + luas);

            } else if (bangun == 2) {
                System.out.println("input panjang");
                int panjang = mi.nextInt();
                System.out.println("input lebar");
                int lebar = mi.nextInt();
                double luas = panjang*lebar;
                System.out.println("Luas persegi panjang = " + luas);

            } else if (bangun == 3) {
                System.out.println("input alas");
                int alas = mi.nextInt();
                System.out.println("input tinggi");
                int tinggi = mi.nextInt();
                double luas = alas*tinggi/2;
                System.out.println("Luas segitiga = " + luas);

            } else if (bangun == 4) {
                System.out.println("input jari-jari");
                int jari = mi.nextInt();
                double luas = Math.PI * Math.pow(jari, 2);
                System.out.printf("Luas lingkaran =" + " %2.f ", luas);

            } else if (bangun == 5) {
                System.out.println("input alas");
                int alas = mi.nextInt();
                System.out.println("input tinggi");
                int tinggi = mi.nextInt();
                double luas = alas*tinggi;
                System.out.println("Luas Jajar genjang = " + luas);

            } else if (bangun == 6) {
                System.out.println("input sisi1");
                int sisi1 = mi.nextInt();
                System.out.println("input sisi2");
                int sisi2 = mi.nextInt();
                System.out.println("input tinggi");
                int tinggi = mi.nextInt();
                double luas = ((sisi1 + sisi2) * tinggi/2);
                System.out.println("Luas Trapesium = " + luas);
                
            } else if (bangun == 7) {
                System.out.println("input diagonal1");
                int diagonal1 = mi.nextInt();
                System.out.println("input diagonal2");
                int diagonal2 = mi.nextInt();
                double luas = (diagonal1 * diagonal2)/2;
                System.out.println("Luas Belah Ketupat = " + luas);

            } else if (bangun == 8) {
                System.out.println("input diagonal1");
                int diagonal1 = mi.nextInt();
                System.out.println("input diagonal2");
                int diagonal2 = mi.nextInt();
                double luas = (diagonal1 * diagonal2)/2;
                System.out.println("Luas Layang-layang = " + luas);

        if (menu == 2) {
            System.out.println("** pilih bangun ruang **");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Limas");
            System.out.println("4. Prisma ");
            System.out.println("5. Kerucut");
            System.out.println("6. Tabung");
            System.out.println("7. Bola");
            int ruang = mi.nextInt();

            if (ruang == 1) {
                System.out.println("input panjang");
                int panjang = mi.nextInt();
                System.out.println("input lebar");
                int lebar = mi.nextInt();
                System.out.println("input tinggi");
                int tinggi = mi.nextInt();
                double volume = panjang * lebar * tinggi;
                System.out.println("Volume Balok = " + volume);

            } else if (ruang == 2) {
                System.out.println("sisi1");
                int sisi1 = mi.nextInt();
                System.out.println("sisi2");
                int sisi2 = mi.nextInt();
                System.out.println("input sisi3");
                int sisi3 = mi.nextInt();
                double volume = sisi1 * sisi2 * sisi3;
                System.out.println("Volume Kubus = " + volume);

            } else if (ruang == 3) {
                System.out.println("input luas alas");
                int luasAlas = mi.nextInt();
                System.out.println("input tinggi");
                int tinggi = mi.nextInt();
                double volume = (luasAlas * tinggi)/3;
                System.out.println("Volume limas = " + volume);

            } else if (ruang == 4) {
                System.out.println("input panjang");
                int panjang = mi.nextInt();
                System.out.println("input lebar");
                int lebar = mi.nextInt();
                System.out.println("input tinggi");
                int tinggi = mi.nextInt();
                double volume = (panjang * lebar * tinggi)/2;
                System.out.println("Volume Prisma = " + volume);

            } else if (ruang == 5) {
                System.out.println("input jari-jari");
                double r = mi.nextInt();
                System.out.println("input tinggi");
                int tinggi = mi.nextInt();
                double PI = 3.14;
                double volume = (PI * Math.pow (r, 2) * tinggi)/3;
                System.out.printf("Volume tabung = " + "%.2f" , volume);

            } else if (ruang == 6) {
                System.out.println("input jari-jari");
                double r = mi.nextInt();
                double PI = 3.14;
                double volume = (PI * Math.pow (r, 3) * 4)/3;
                System.out.printf("Volume Bola = " + "%.2f" , volume);
            }
                
            } 
            }

        }

        

    }
}