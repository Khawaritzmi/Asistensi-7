import java.util.Scanner;
public class lab5{
    public static void main(String[] args) {
        double d = 0;
        double e = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("tinggi menara : ");
        double a = n.nextDouble();
        System.out.print("sudut elevasi ujung depan : ");
        double b = n.nextDouble();
        System.out.print("sudut elevasi ujung belakang : ");
        double c = n.nextDouble();
        if (b<90 && c<b){
            d = Math.tan(Math.toRadians(b))*a;
            e = Math.tan(Math.toRadians(c))*a;
            double panjang = d - e;
            System.out.printf("Panajang Kapal adalah %.1f m" , panjang);
        }
        System.out.println("error");
    }
}