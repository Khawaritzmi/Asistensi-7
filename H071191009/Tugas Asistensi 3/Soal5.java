import java.util.Scanner;
public class Soal5{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int jam = 0;
        int menit = 0;
        int detik = 0;
        double derajat;
        while (true){
            derajat = n.nextDouble();
            if (derajat >= 0 && derajat < 360){
                //86.400 detik(24jam)/360
                //1 derajat = 240 detik
            double x = derajat*240;
            int a = (int)x;
            jam = (a / 3600) + 6;
                if(jam > 23){
                    jam -= 24;
                }else{
                    jam += 0;
                }
            menit = (a % 3600) / 60;
            detik = (a % 3600) % 60;
            System.out.println(" ");
            if (a >= 0 && a < 14400){
                System.out.println("selamat pagi");
            }else if (a >= 14400 && a < 28800){
                System.out.println("selamat siang");
            }else if (a >= 28800 && a < 45000){
                System.out.println("selamat sore");
            }else if (a >= 45000 && a < 79200){
                System.out.println("selamat malam");
            }else{
                System.out.println("selamat pagi");
            }
                System.out.printf("%02d : %02d : %02d\n",jam, menit, detik);
            }else{
                System.out.println("inputan tidak cocok");
            }
        }
    }
}