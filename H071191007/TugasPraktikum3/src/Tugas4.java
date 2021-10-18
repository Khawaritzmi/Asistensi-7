import java.util.Scanner;
class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam = 0;
        int menit = 0;
        int detik = 0;
        float derajat;
        // 1 derajat = 240 detik
        while(sc.hasNextFloat()) {
            derajat = sc.nextFloat();
            if (derajat >= 0 && derajat < 360) {
            float x = derajat * 240;
            int i = (int) x;
            jam = (i/3600) + 6;
                if (jam > 23) {
                    jam-= 24;
                } else {
                    jam+= 0;
                }
            menit = (i%3600)/60;
            detik = (i%3600)%60;
            System.out.println("");
            if (i >= 0 && i < 14400) {
                System.out.println("Selamat pagi");
            } else if (i >= 14400 && i < 28800) {
                System.out.println("Selamat siang");
            } else if (i >= 28800 && i < 45000) {
                System.out.println("Selamat sore");
            } else if (i >= 45000 && i < 79200) {
                System.out.println("Selamat malam");
            } else {
                System.out.println("Selamat pagi");
            }
                System.out.printf("%02d : %02d : %02d\n",jam, menit,detik);
            } else {
                System.out.println("Tidak valid");
            }
        }

    }
}