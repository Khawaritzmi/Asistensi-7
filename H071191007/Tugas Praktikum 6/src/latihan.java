import java.util.Scanner;
class latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        int panjang = kata.length();

        String kata1 = kata.replace(" ", "").toUpperCase();
        String kata2 = kata1.substring(0, (panjang-1)/2);

        //polindrom
        String kataBalik = "";
        for (int i = 0; i < kata2.length()-1;i++) {
            kataBalik = kata2.charAt(i) + kataBalik;
        }
        // hexa
        int hexa = panjang*panjang;
        char simbol;
        
        if (kataBalik.charAt(0)>65 && kataBalik.charAt(0)<91) {
            simbol = "?";
        } else {
            simbol = "!";

            System.out.printf("#%x%s%s%o%c", hexa,kata2, kataBalik, panjang, simbol);
        }

    }
}