import java.util.Scanner;
import java.util.Random;
class Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    public static String generateSerial (int n, int m) {
        String str = "";
        Random ra = new Random();
        int acak;
            for (int i =0; i < n; i++) {
                for (int j = 0; j < m; j++){
                    acak = ra.nextInt(10);
                    str+= String.valueOf(acak);
                }
                str+= i==n-1? " " : "-";
            }
            return str;
    }
}