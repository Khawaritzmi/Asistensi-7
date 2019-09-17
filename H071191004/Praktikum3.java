import java.util.Scanner;
class Praktikum3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kapal");
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (90 > a && a > b){
          double d=Math.tan(Math.toRadians(a))*h;
          double e=Math.tan(Math.toRadians(b))*h;
          double panjang = d-e;
          System.out.printf("panjang kapal = %.1f m",panjang);

        }
    }
}