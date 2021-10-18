import java.util.Scanner;
class Praktikum5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" menu ");
        System.out.println("Input angka sesuai dengan menu yang diinginkan :");
        System.out.println("1. mencari luas bangun datar");
        System.out.println("2. mencari volume bangun ruang");

        int bangundatar = sc.nextInt();

        switch(bangundatar){
            case 1 :
            System.out.println("input angka sesuai dengan nomor bangun datar yang diinginkan :");
            System.out.println("1. persegi");
            System.out.println("2. persegi panjang");
            System.out.println("3. segitiga");
            System.out.println("4. lingkaran");
            System.out.println("5. jajar genjang");
            System.out.println("6. trapesium");
            System.out.println("7. belah ketupat");
            System.out.println("8. layang-layang");
        
            case 2 : 
            System.out.println("input angka sesuai dengan nomor bangun datar yang diinginkan :");
            System.out.println("1. kubus");
            System.out.println("2. balok");
            System.out.println("3. limas");
            System.out.println("4. prisma");
            System.out.println("5. tabung");
            System.out.println("6. bola");
            
        
            int datar = sc.nextInt();
        switch(datar){
            case 1 :
            System.out.println("panjang sisi : ");
            double sisi = sc.nextDouble();
            double luas = Math.pow(sisi,2);
            System.out.printf("luas persegi = %1f",luas);
            break;
            case 2 :
            System.out.println("input panjang");
            double panjang = sc.nextDouble();
            System.out.println("input lebar");
            double lebar = sc.nextDouble();
            luas = panjang*lebar;
            System.out.printf("luas persegi panjang = %.1f",luas);
            break;
            case 3 :
            System.out.println("input alas");
            double alas = sc.nextDouble();
            System.out.println("input tinggi");
            double tinggi = sc.nextDouble();
            luas = alas*tinggi/2;
            System.out.printf("luas segitiga = %.2f",luas);
            break;
            case 4 :
            System.out.println("input jari jari");
            double jarijari = sc.nextDouble();
            luas = Math.PI*Math.pow(jarijari,2);
            System.out.printf("luas lingkaran = %.2f",luas);
            break;
            case 5 :
            System.out.println("input alas");
            double a = sc.nextDouble();
            System.out.println("input tinggi");
            double b = sc.nextDouble();
            luas = a*b;
            System.out.printf("luas jajar genjang = %.2f",luas);
            break;
            case 6 :
            System.out.println("sisi a");
            double c = sc.nextDouble();
            System.out.println("sisi b");
            double d = sc.nextDouble();
            System.out.println("tinggi");
            double e = sc.nextDouble();
            luas = (c+d)*e/2;
            System.out.printf("luas trapesium = %.2f",luas);
            break;
            case 7 :
            System.out.println("diagonal 1");
            double f = sc.nextDouble();
            System.out.println("diagonal 2");
            double g = sc.nextDouble();
            luas = f*g/2;
            System.out.printf("luas belah ketupat = %.2f",luas);
            break;
            case 8 :
            System.out.println("diagonal 1");
            double h = sc.nextInt();
            System.out.println("diagonal 2");
            double i = sc.nextInt();
            luas = h*i/2;
            System.out.printf("luas layang-layang = %.2f",luas);
            break;
            }
            

                int ruang = sc.nextInt();
            switch(ruang){
                case 1 :
                double sisi = sc.nextInt();
                System.out.println("input sisi");
                double j = Math.pow(sisi, 3);
                System.out.println("volume kubus = %.1f"+sisi);
                break;
                case 2 :
                System.out.println("panjang");
                double k = sc.nextDouble();
                System.out.println("lebar");
                double l = sc.nextDouble();
                System.out.println("tinggi");
                double m = sc.nextDouble();
                double volume = k*l*m;
                System.out.println("volume balok = "+volume);
                break;
                case 3 :
                System.out.println("input luas alas");
                int n = sc.nextInt();
                System.out.println("input tinggi");
                int o = sc.nextInt();
                double p = (n * o)/3;
                System.out.println("Volume limas = " + n);
                break;
                case 4 :
                System.out.println("input panjang");
                int panjang = sc.nextInt();
                System.out.println("input lebar");
                int lebar = sc.nextInt();
                System.out.println("input tinggi");
                int tinggi = sc.nextInt();
                double q = (panjang * lebar * tinggi)/2;
                System.out.println("Volume Prisma = " + q);
                break;
                case 5 :
                System.out.println("input jari-jari");
                double r = sc.nextInt();
                System.out.println("input tinggi");
                int t = sc.nextInt();
                double PI = 3.14;
                double u = (PI * Math.pow (r, 2) * t)/3;
                System.out.printf("Volume tabung = " + "%.2f" , u);
                break;
                case 6 :
                System.out.println("input jari-jari");
                double R = sc.nextInt();
                double Phi = 3.14;
                double v = (Phi * Math.pow (R, 3) * 4)/3;
                System.out.printf("Volume Bola = " + "%.2f" , v);


                
            }



        

        }
    }
}
