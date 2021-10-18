import java.util.Scanner;
class Modul2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int [][] matriksA = new int [i][j];
        int [][] matriksB = new int [j][k];

        for (int a = 0; a < i;a++) {
            for (int b = 0;b < j;b++) {
                matriksA [a][b] = sc.nextInt();
            }
        }
        for (int b = 0; b < j;b++) {
            for (int c = 0; c < k;c++) {
                matriksB [b][c] = sc.nextInt();
            }
        }
        for (int a = 0; a < i;a++) {
            for (int c = 0; c < k; c++) {
                int hasil = 0;
                for (int b = 0; b < j; b++) {
                    hasil += matriksA[a][b]*matriksB[b][c];
                }System.out.print(hasil + " ");
            }System.out.println();
        }
    }
} 