import java.util.Scanner;
class String02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        int panjang = kata.length();

        String kata1 = kata.replace(" ", "").toUpperCase();
        String kata2 = kata1.substring(0, (panjang - 1)/2);

        //polindrom
        String kataBalik = "";
        for (int i = 0; i < kata2.length()- 1; i++) {
            kataBalik = kata2.charAt(i) + kataBalik;
        }
        // hexa
        int hexa = panjang*panjang;
        char simbol;
        // ?=huruf != angka
        if (kataBalik.charAt(0)>65 && kataBalik.charAt(0)<91) {
            simbol = '?';
        } else {
            simbol = '!';
        }
        //%x = hexa dan %o=octal dan %c = char dan %s = string
        System.out.printf("#%x%s%s%o%c", hexa, kata2, kataBalik, panjang, simbol);

    }
}