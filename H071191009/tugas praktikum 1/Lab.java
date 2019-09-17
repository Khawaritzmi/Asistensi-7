import java.util.*;
public class Lab{
    public static void main(String[] args) {
        int waktu, kecepatan;
        double bensin, efisiensi, jarak;
        Scanner n = new Scanner(System.in);
        
        efisiensi = 14;
        waktu = n.nextInt();
        kecepatan = n.nextInt();
        jarak = kecepatan * waktu;
        bensin = jarak /efisiensi;
       
        System.out.printf("%s%.3f%s" , "bensin yanag digunakan :",bensin,"L");
    }
}