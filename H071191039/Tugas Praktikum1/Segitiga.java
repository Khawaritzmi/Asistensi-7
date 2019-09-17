

import java.util.Scanner;
public class Segitiga {

    public static void main(String[] args) {
         Scanner tugas= new Scanner (System.in);
        System.out.println("masukkkan alas =");
        double alas=tugas.nextDouble();
        System.out.print.ln("masukkan tinggi =");
        double tinggi=tugas.nextDouble();

        double hasil= (alas*tinggi*0.5);
        System.out.println("luas segitiga %.2f m/ n",hasil);
    }
       
    }
}