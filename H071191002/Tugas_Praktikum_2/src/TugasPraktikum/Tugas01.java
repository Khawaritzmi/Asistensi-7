package TugasPraktikum;
import java.util.Scanner;
class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;

        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
            input.close();

            if(a>0){
                positif++;
            } else if (a<0){
                negatif++;
            }
            if(a%2!=0){
                ganjil++;
            }else{
                genap++;
            }
            if(b>0){
                positif++;
            } else if (b<0){
                negatif++;
            }
            if(b%2!=0){
                ganjil++;
            }else{
                genap++;
            }
            if(c>0){
                positif++;
            } else if (c<0){
                negatif++;
            }
            if(c%2!=0){
                ganjil++;
            }else{
                genap++;
            }
            if(d>0){
                positif++;
            } else if (d<0){
                negatif++;
            }
            if(d%2!=0){
                ganjil++;
            }else{
                genap++;
            }
            if(e>0){
                positif++;
            } else if (e<0){
                negatif++;
            }
            if(e%2!=0){
                ganjil++;
            }else{
                genap++;
            }
            System.out.printf("%d Angka Genap\n",genap);
            System.out.printf("%d Angka Ganjil\n",ganjil);
            System.out.printf("%d Angka Positif\n",positif);
            System.out.printf("%d Angka Negatif\n",negatif);
        } catch (Exception e) {
            System.err.println("Inputan tidak valid");
        }
    }
}
