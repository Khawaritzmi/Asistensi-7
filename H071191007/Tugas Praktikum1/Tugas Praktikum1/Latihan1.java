import java.util.Scanner;
class Latihan1 {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = 0;
        int m = 110;
        try {
            if (m/n == 0) {
                System.out.println(m%n);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.print(n+ " Finally ");
        }
            System.out.println("done!");
    }
}