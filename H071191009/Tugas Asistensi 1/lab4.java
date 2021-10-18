import java.util.Scanner;
public class lab4{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int detik,menit,secon,jam;
        
        System.out.print("masukkan detik : ");
       
        detik = n.nextInt();
        jam = detik /3600;
        menit = (detik % 3600) /60;
        secon = (detik % 3600) %60;
    
        System.out.printf("%02d : %02d : %02d ",jam, menit, secon);
    }
}