import java.util.HashMap;
import java.util.Scanner;
public class Avengers {

    public static HashMap<Integer, String> judul = new HashMap<>();
    public static HashMap<Integer, String> rilis = new HashMap<>();
    public static HashMap<Integer, String> durasi = new HashMap<>();
    public static HashMap<Integer, String> genre = new HashMap<>();
    public static HashMap<Integer, String> sinopsis = new HashMap<>();
    public static HashMap<Integer, String> cast = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Avenger
        judul.put(1, "Avenger : Endgame");
        rilis.put(1, "24 April 2019");
        durasi.put(1, "3 jam 1 menit");
        genre.put(1, "Adventure, Sci-Fi, Action");
        sinopsis.put(1, "Melanjutkan Avenger infinity war, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones dan memusnahkan 50% semua makhluk hidup di alam semesta");
        cast.put(1, "Robert Downey Jr., Chris Evan, Mark Ruffalo");
        // spiderman
        judul.put(2, "Spiderman : Far From Home");
        rilis.put(2, "3 juli 2019");
        durasi.put(2, "2 jam 9 menit");
        genre.put(2, "Adventure, Sci-Fi, Action");
        sinopsis.put(2, "Peter Parker tengah mengunjungi Eropa untuk liburan panjang bersama teman-temannya. Selama di Eropa Peter harus menghadapi banyak musuh");
        cast.put(2, "Tom Hollan, Samuel L. Jackson, Zendaya");
        // Venom
        judul.put(3, "Venom");
        rilis.put(3, "5 oktober 2018");
        durasi.put(3, "1 jam 52 menit");
        genre.put(3, "Adventure, Sci-Fi, Action");
        sinopsis.put(3, "Seorang jurnalis, Eddie Brock ingin melakukan sebuah investasi kasus terhadap penemuan yang dipimpin oleh Dr. Carlton Drake");
        cast.put(3, "Tom Hardy, Michelle Williams, Riz Ahmed, Scott Haze, Reid Scott");
        // Thor
        judul.put(4, "Thor : Ragranok");
        rilis.put(4, "25 oktober 2017");
        durasi.put(4, "2 jam 10 menit");
        genre.put(4, "Adventure, Sci-Fi, Action");
        sinopsis.put(4, "Dipenjara, Thor yang hebat menemukan dirinya dalam sebuah kontes gladiator yang mematikan melawan Hulk. Thor harus berjuang bertahan hidup dan mencegah Hela yang sangat kuat.");
        cast.put(4, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

        String pilihanUser;
        boolean listLanjutkan = true;
        String a = "";
        while (listLanjutkan) {
            System.out.println("Favorite Movie");
            cetak("a");
            System.out.print("(d)Detail (s)Search (a)Add (r)Remove (e)Exit");

            System.out.println(">");
            pilihanUser = sc.next();
            int n;
            switch (pilihanUser) {
                case "d":
                    n = sc.next();
                    detailMovie(n);
                    System.out.println();
                    break;
                case "s":
                    String search = sc.next();
                    searchMovie(search);
                    break;
                case "a":
                    System.out.println("Tambah Movie");
                    n = sc.next();
                    addMovie(n);
                    break;
                case "r":
                    System.out.println("Hapus Movie");
                    n = sc.next();
                    removeMovie(n);
                    break;
                case "e":
                    listLanjutkan = false;
                
                default :
                System.out.println("\n input anda tidak dapat ditemukan");
            }

        }
    }

    static void cetak(String a) {
        for (int i = 0; i < judul.size(); i++) {
            System.out.println(judul.keySet().toArray()[i]);
            System.out.println(judul.get(judul.keySet().toArray()[i]));

        }
    }

    static void detailMovie (int n) {
        System.out.println("Detail Movie : ");
        System.out.println("Judul\t\t:" + judul.get(n));
        System.out.println("Rlis\t\t:" + rilis.get(n));
        System.out.println("Durasi\t\t" + durasi.get(n));
        System.out.println("Genre\t\t:" + genre.get(n));
        System.out.println("sinopsis\t\t:" + sinopsis.get(n));
        System.out.println("Cast\t\t:" + cast.sinopsis.get(n));
    }

    static void addMovie(int n) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Judul");
        String title = sc.next();
        System.out.println("Rilis");
        String release = sc.next();
        System.out.println("Durasi");
        String duration = sc.next();
        System.out.println("Genre");
        String genre = sc.next();
        System.out.println("Sinopsois");
        String sinops = sc.next();
        System.out.println("Cast");
        String casting = sc.next();

        judul.put(n, title);
        rilis.put(n, release);
        durasi.put(n, duration);
        genre.put(n, genre);
        sinopsis.put(n, sinops);
        cast.put(n, casting);
    }

    static void removeMovie(int n) {
        judul.remove(n);
        rilis.remove(n);
        durasi.remove(n);
        genre.remove(n);
        sinopsis.remove(n);
        cast.remove(n);
    }

    static void searchMovie (String search) {
        System.out.println("Hasil pencarian dari-" + search + " : ");
        for (Integer i = 1; i<= judul.size(); i++) {
            System.out.print(judul.keySet().toArray()[i-1] + " ");
            System.out.println(judul.get(judul.keySet().toArray()[i-1]));
        }

    }
} 