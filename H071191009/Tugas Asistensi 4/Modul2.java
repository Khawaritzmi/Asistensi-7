import java.util.Scanner;
public class Modul2{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("program ini menentukan perkalian dua matriks");
        System.out.println("masukkan dua matriks anda");
        int i = n.nextInt();
        int j = n.nextInt();
        int k = n.nextInt();
        if (i < 1 || j < 1 || k < 1){
            return;
        }
        int a[][] = new int[i][j];
        int b[][] = new int[j][k];
        for (int l = 0; l < i; l++){
            for (int m = 0; m < j; m++){
                a[l][m] = n.nextInt();
            }
        }
        for (int l = 0; l < j; l++){
            for (int m = 0; m < k; m++){
                b[l][m] = n.nextInt();
            }
        }
        for (int l = 0; l < i; l++){
            for (int m = 0; m < k; m++){
                int sum = 0;
                for (int o = 0; o < j; o++){
                    sum += a[l][o] * b[o][m];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}