import java.util.Scanner;
public class Tambahan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai =");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            if(x > y){
                System.out.printf("Titik %d,%d berada pada Kuadran IV",x,y);
            }else if(y > x){
                System.out.printf("Titik %d,%d berada pada Kuadran III",x,y);
            }else{
                System.out.printf("Titik %d,%d berada pada garis x = y",x,y);
            }
        }else if(y > 0 && x < 0){
            if(y > -x){
                System.out.printf("Titik %d,%d berada pada Kuadran II",x,y);
            }else if(y < -x){
                System.out.printf("Titik %d,%d berada pada Kuadran I",x,y);
            }else{
                System.out.printf("Titik %d,%d berada pada garis -x = y");
            }
        }else if(x < 0 && y < 0){
            if(-x > -y){
                System.out.printf("Titik %d,%d berada pada Kuadran VIII",x,y);
            }else if(-y > -x){
                System.out.printf("Titik %d,%d berada pada Kuadran VII",x,y);
            }else{
                System.out.printf("Titik %d,%d berada pada garis -y = -x");
            }
        }else if(y < 0 && x > 0){
            if(-y > x){
                System.out.printf("Titik %d,%d berada pada Kuadran VI",x,y);
            }else if(-y < x){
                System.out.printf("Titik %d,%d berada pada Kuadran V",x,y);
            }else{
                System.out.printf("Titik %d,%d berada pada garis x = -y");
            }
        }
    }
}