import java.util.Scanner;
class Looping2 {
    public static void main(String[] args) {
        Scanner ri = new Scanner(System.in);
        System.out.print("Masukkan bilangan faktorial = ");
            int n = ri.nextInt();
            int hasil = 1;
            for (int i = n; i >= 1; i--) {
                hasil = hasil * i;
                if (i == 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " * ");
                }
            }
            System.out.print(" = " + hasil);
    } 
}