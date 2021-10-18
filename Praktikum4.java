import java.util.Scanner;
class Praktikum4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        
        try {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        if(a>0){
            positif++;
        }else if (a<0){
            negatif++;
        }
        if(a%2!=0){
            ganjil++;
        }else{
            genap++;
        }
        if(b>0){
            positif++;
        }else if (b<0){
            negatif++;
        }
        if(b%2!=0){
            ganjil++;
        }else{
            genap++;
        }
        if(c>0){
            positif++;
        }else if(c<0){
            negatif++;
        }
        if(c%2!=0){
            ganjil++;
        }else{
            genap++;
        }
        if(d>0){
            positif++;
        }else if(d<0){
            negatif++;
        }
        if(d%2!=0){
            ganjil++;
        }else{
            genap++;
        }
        if(e>0){
            positif++;
        }else if(e<0){
            negatif++;
        }
        if(e%2!=0){
            ganjil++;
        }else{
            genap++;
        }
        System.out.printf("%d angka genap\n",genap);
        System.out.printf("%d angka ganjil\n",ganjil);
        System.out.printf("%d angka positif\n",positif);
        System.out.printf("%d angka negatif\n",negatif);
    
    } catch (Exception e) {
        System.out.println("inputan tidak valid");
    }
}
}