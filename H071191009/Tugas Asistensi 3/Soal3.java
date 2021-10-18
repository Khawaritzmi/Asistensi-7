import java.util.Scanner;
public class Soal3{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("masukan nilai = ");
        
        int N = n.nextInt();
        int a = 0;
        int b = 1;
        
        for(int i = 0; i < N; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

        }        
    }
}