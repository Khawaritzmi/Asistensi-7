import java.util.Scanner;
class Tugas3 {
    public static void main(String[] args) {
        Scanner ra = new Scanner(System.in);
        System.out.print("Bilangan fibonacci = ");
        int a = ra.nextInt();
        long n0 = 0;
        long n1 = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(n0 + " ");
            long n = n0 + n1;
            n0 = n1;
            n1 = n;
        }
    }
}