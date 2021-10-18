import java.util.Scanner;
class Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hari = sc.nextInt();
        
        }
        public static int myDay(int a) {
        Scanner a = new Scanner(System.in);
        int tahun = a / 365;
        a = a % 365;
        int bulan = a / 30;
        a = a % 30;

        System.out.println(tahun + " tahun");
        System.out.println(bulan + " bulan");
        System.out.println(a + " hari");

        return a;
    }
}