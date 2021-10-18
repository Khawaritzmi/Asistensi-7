import java.util.Scanner;
public class Tugas02FinalH071191002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input ordo matrix A : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrixA [][] = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrixA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input ordo matrix B : ");
        int o = sc.nextInt();
        int p = sc.nextInt();
        int matrixB [][] = new int[o][p];
        for(int i = 0; i<o; i++){
            for(int j=0; j<p; j++){
                matrixB[i][j]=sc.nextInt();
            }
        }

        if(n==p){
        System.out.println("Matriks Hasil");
        int[][] hasilAxB = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                int x = 0;
                for (int k = 0; k < o; k++) {
                    x += matrixA[i][k] * matrixB[k][j];
                }
                hasilAxB[i][j] = x;
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<p;j++){
                System.out.print(hasilAxB[i][j]+ " ");
            }
            System.out.println();
        }
        
        }else{
            System.out.println("Tidak bisa dikalikan");
        }

        if(o==m){
            System.out.println("Matriks Hasil");
            int[][] hasilBxA = new int[o][m];
            for (int i = 0; i < o; i++) {
                for (int j = 0; j < m; j++) {
                    int x = 0;
                    for (int k = 0; k < n; k++) {
                        x += matrixA[i][k] * matrixB[k][j];
                    }
                    hasilBxA[i][j] = x;
                }
            }
            for(int i=0; i<n;i++){
                for(int j=0; j<p;j++){
                    System.out.print(hasilBxA[i][j]+ " ");
                }
                System.out.println();
            }
            
            }else{
                System.out.println("Tidak bisa dikalikan");
                
        }
    }
    
}