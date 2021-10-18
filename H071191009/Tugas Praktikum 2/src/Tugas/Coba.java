package Tugas;
import java.util.*;
public class Coba{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        try{
            int genap = 0;
            int ganjil = 0;
            int positif = 0;
            int negatif = 0;
            System.out.println("masukan bilangan =");

            int a = n.nextInt();
            int b = n.nextInt();
            int c = n.nextInt();
            int d = n.nextInt();
            int e = n.nextInt();
            if (a > 0 && a % 2 == 0){
                positif++;
                genap++;
            }else if (a > 0 && a % 2 == 1){
                positif++;
                ganjil++;
            }else if (a < 0 && a % 2 == 0){
                negatif++;
                genap++;
            }else if (a < 0 && a % 2 == 1){
                negatif++;
                ganjil++;
            }else{
                genap++;
            }
            if (b > 0 && b % 2 == 0){
                positif++;
                genap++;
            }else if (b > 0 && b % 2 == 1){
                positif++;
                ganjil++;
            }else if (b < 0 && b % 2 == 0){
                negatif++;
                genap++;
            }else if (b < 0 && b % 2 == 1){
                negatif++;
                ganjil++;
            }else{
                genap++;
            }
            if (c > 0 && c % 2 == 0){
                positif++;
                genap++;
            }else if (c > 0 && c % 2 == 1){
                positif++;
                ganjil++;
            }else if (c < 0 && c % 2 == 0){
                negatif++;
                genap++;
            }else if (c < 0 && c % 2 == 1){
                negatif++;
                ganjil++;
            }else{
                genap++;
            }
            if (d > 0 && d % 2 == 0){
                positif++;
                genap++;
            }else if (d > 0 && d % 2 == 1){
                positif++;
                ganjil++;
            }else if (d < 0 && d % 2 == 0){
                negatif++;
                genap++;
            }else if (d < 0 && d % 2 == 1){
                negatif++;
                ganjil++;
            }else{
                genap++;
            }
            if (e > 0 && e % 2 == 0){
                positif++;
                genap++;
            }else if (e > 0 && e % 2 == 1){
                positif++;
                ganjil++;
            }else if (e < 0 && e % 2 == 0){
                negatif++;
                genap++;
            }else if (e < 0 && e % 2 == 1){
                negatif++;
                ganjil++;
            }else{
                genap++;
            }
            System.out.println("Angka Bilangan Genap = "+ genap);
            System.out.println("Angka Bilangan Ganjil = "+ ganjil);
            System.out.println("Angka Bilangan positif = "+ positif);
            System.out.println("Angka Bilangan Negatif = "+ negatif);
        }catch(Exception X){
            System.out.println("inputan tidak valid");
        }
    }
}