import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TugasModul{
    public static void main(String[] args) throws IOException{//menghandle io Exception
        System.out.println("Ketik Latihan");
        Scanner n = new Scanner(System.in);
        boolean benar = true;
        //bernilai null agar tdk terjadi IOException
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        String fileNama = n.nextLine()+".txt";
        //membaca String filenama
        fr = new FileReader(fileNama);
        //membaca sebuah bilangan atau karakter sehingga bilangan tersebut dapat dimanfaatkan untuk sebuah program
        br = new BufferedReader(fr);
        String s;
        //menyimpan nilai file yg ada di dalamnya
        String readFile = "";
        //membaca perbaris yg tidak bernilai nol
        while ((s = br.readLine())!= null){
            //mencatat ke String readfile dari file
            readFile = (readFile + s) + "\n";
        }
        if (fr != null){
            fr.close();
        }
        if (br != null){
            br.close();
        }
        try{
            //untuk berapa kali inputan
            System.out.println("masukkan berapa kali anda masukkan data");
            int tambah = n.nextInt();
            String nama[] = new String [tambah];
            String nim[] = new String [tambah];
            int angkatan[] = new int [tambah];
            //mencatat perulangan nama, nim, tahun;
            for (int i = 0; i < tambah; i++){
                System.out.println("masukan nama");
                nama[i] = n.next().replace("-", " ");
                System.out.println("masukkan nim");
                nim[i] = n.next();
                System.out.println("masukkan angkatan");
                angkatan[i] = n.nextInt();
            }
            //untuk menulis membuat file
            fw = new FileWriter(fileNama);
            //menulis kedalam file
            pw = new PrintWriter(fw);
            //method menulis ke file
            pw.print(readFile);
            //mencetak semua isi di array
            for (int i = 0; i < tambah; i++){
                //panjangnya sesuai nomor
                pw.printf("| %-20s | %-10s | %-8d |\n", nama[i], nim[i], angkatan[i]);
            }
            pw.println("+----------------------+------------+----------+");
            if (fw != null){
                fw.close();
            }
            if (pw != null){
                pw.close();
            }
        }catch(Exception e){
            benar = false;
        }finally{
            System.out.println();
            if (benar == true){
                System.out.println("Berhasil");
            }else{
                System.out.println("Gagal");
            }
        }
        n.close();
    }
}