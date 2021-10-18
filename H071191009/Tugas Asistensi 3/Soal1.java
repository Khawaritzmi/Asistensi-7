import java.util.Scanner;
public class Soal1{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("masukan nilai");
        int a = 0;
        int b = 0;
        int x = n.nextInt();
        int y = n.nextInt();

        if(x > y){
            a = x;
            b = y;
        }else if (x < y){
            a = y;
            b = x;
        }
        for(int i = b; i <= a; i++){
            if(i % 2 == 0 && i < 0){
                System.out.printf("%d genap negatif\n", i);
            }else if(i % 2 != 0 && i < 0){
                System.out.printf("%d ganjil negatif\n", i);
            }else if(i % 2 == 0 && i == 0){
                System.out.printf("%d Nol\n", i);
            }else if(i % 2 != 0 && i > 0){
                System.out.printf("%d ganjil positif\n", i);
            }else if(i % 2 == 0 && i > 0){
                System.out.printf("%d genap positif\n", i);
            }
        }
    }
}