import java.util.Scanner;
class Praktek_3{
    public static void main(String[] args) {
        double d=0;
        double e=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Tinggi menara : ");
        double h = sc.nextDouble();
        System.out.print("Sudut elevasi ujung depan : ");
        double a = sc.nextDouble();
        System.out.print("Sudut elevasi ujung belakang : ");
        double b = sc.nextDouble();
        
        if(a<90 && b<a){
            d=Math.tan(Math.toRadians(a))*h;
            e=Math.tan(Math.toRadians(b))*h;
            
            double panjang = d-e;
            System.out.printf("Panjang kapal adalah %.1f m", panjang);

            
        }
        
      
    }

}


    
