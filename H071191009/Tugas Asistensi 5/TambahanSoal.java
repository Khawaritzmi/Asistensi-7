import java.util.*;
class TambahanSoal{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("program ini menentukan volume bangun ruang atau datar");
        System.out.println("volume bangun datar atau volume bangun ruang ? Tentukan pilihanmu sekarang");
        System.out.println("Input 1 atau 2");
        int pilih = n.nextInt();
        if (pilih == 1){
            System.out.println("Oke, selanjutnya masukan nilai bangun datar mu !! DAN BIARKAN SAYA BEKERJA !!!");
            int a = n.nextInt();
            int b = n.nextInt(); 
            int c = n.nextInt(); 
            luasPersegi(a, b);
            Double.valueOf(luasSegitiga(a, b));
            Double.valueOf(luasTrapesium(a, b, c));
            luasPersegiPanjang(a, b);
            luasJajarGenjang(a, c);
            Double.valueOf(luasLayangLayang(a, b));
            Double.valueOf(luasBelahKetupat(a, b));
        System.out.println("luas bangun datar Anda");
        System.out.println("***********************************");
        System.out.println("luas persegi = " + luasPersegi(a, b));
        System.out.println("luas segitiga = " + luasSegitiga(a, b));
        System.out.println("luas trapesium = " + luasTrapesium(a, b, c));
        System.out.println("luas persegi panjang = " + luasPersegiPanjang(a, b));
        System.out.println("luas jajar genjang = " + luasJajarGenjang(a, c));
        System.out.println("luas layang layang = " + luasLayangLayang(a, b));
        System.out.println("luas belah ketupat = " + luasBelahKetupat(a, b));
        System.out.println("selamat, anda mendapatkan jawaban anda");
        System.out.println();

        }else if (pilih == 2){
            System.out.println("Oke, selanjutnya masukan nilai bangun ruang mu !! DAN BIARKAN SAYA BEKERJA !!!");
            int a = n.nextInt();
            int b = n.nextInt(); 
            int c = n.nextInt(); 
            System.out.println("masukkan nilai Pi");
            double Pi = n.nextDouble();
            volumeKubus(a);
            volumeBalok(a, b, c);
            volumeLimas(a, c);
            volumeTabung(Pi, b, c);
            volumePrisma(a, c);
            volumeKerucut(Pi, b, c);
            volumeBola(Pi, b);
            System.out.println("volume bangun ruang Anda");
        System.out.println("*************************************");
        System.out.println("volume kubus = " + volumeKubus(a));
        System.out.println("volume balok = " + volumeBalok(a, b, c));
        System.out.println("volume limas = " + volumeLimas(a, c));
        System.out.println("volume prisma = " + volumePrisma(a, c));
        System.out.println("volume tabung = " + volumeTabung(Pi, b, c));
        System.out.println("volume kerucut = " + volumeKerucut(Pi, b, c));
        System.out.println("volume bola = " + volumeBola(Pi, b));
        System.out.println("selamat, anda mendapatkan jawaban anda");
        System.out.println();
        }      
    }
    static int luasPersegi(int a, int b){
        return a*b;
    }
    static Double luasSegitiga(int a, int b){
        return Double.valueOf((a*b)/2);
    }
    static Double luasTrapesium(int a, int b , int c){
        return Double.valueOf((a+b)*c/2);
    }
    static int luasPersegiPanjang(int a, int b){
        return a*b;
    }
    static int luasJajarGenjang(int a, int c){
        return a*c;
    }
    static Double luasLayangLayang(int a, int b){
        return Double.valueOf((a*b)/2);
    }
    static Double luasBelahKetupat(int a, int b){
        return Double.valueOf((a*b)/2);
    }
    static int volumeKubus(int a){
        return a*a*a;
    }
    static int volumeBalok(int a, int b, int c){
        return a*b*c;
    }
    static Double volumeLimas(int a, int b){
        return Double.valueOf((a*b)/3);
    }
    static Double volumePrisma(int a, int b){
        return Double.valueOf(a*b);
    }
    static Double volumeTabung(Double a, int b, int c){
        return Double.valueOf(a*b*b*c);
    }
    static Double volumeKerucut(Double a,int b,int c){
        return  Double.valueOf((a*b*b*c)/3);
    }
    static Double volumeBola(Double a, int b){
        return Double.valueOf((a*b*b*b*4)/3);
    }
        // System.out.println(c);
    }