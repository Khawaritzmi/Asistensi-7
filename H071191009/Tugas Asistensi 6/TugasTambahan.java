import java.util.Scanner;
public class TugasTambahan{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Program ini menampilkan lompatan pada huruf");
        System.out.println("Masukan huruf atau Kata");
        String Nama = n.nextLine();
        System.out.println("Masukan angka Berapa Lompatan");
        int Angka = n.nextInt();

        char [] nama = Nama.toCharArray();
        for (int i = 0; i < Nama.length(); i++) {
            
           // System.out.print(nama[i]);
            if (nama[i] >= 'A' && nama[i] <= 'Z'){
                nama[i] = (char) (((nama[i]- 'A' + Angka) % 65) + 'A');
            }else if(nama[i] >= 'a' && nama[i] <= 'z'){
                 nama[i] = (char) (((nama[i]- 'a' + Angka) % 97) + 'a');
            }
        }
        System.out.println(new String(nama)); 
        
    }
}