import java.util.*;
public class TugasModul{
    static Scanner n = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> favMovie = new HashMap<>();
        //memasukkan dan mengubah nilai elemen pada HashMap menggunakan kode put atau replace
        favMovie.put("judul", new ArrayList<>());
        favMovie.put("rilis", new ArrayList<>());
        favMovie.put("durasi", new ArrayList<>());
        favMovie.put("genre", new ArrayList<>());
        favMovie.put("sinopsis", new ArrayList<>());
        favMovie.put("cast", new ArrayList<>());
        String film = "n";
        //mengembalikan boolean hasil perbandingan dengan objek () dengan mengabaikan dengan objek () dengan mengabaikan case sensitive
        while (film.equalsIgnoreCase("n")) {
            tampilkan(favMovie);
            System.out.println("Anda harus Add film terlebih dahulu");
            System.out.println(" (d)Detail  (s)Search   (a)Add  (r)Remove");
            String pilih = n.next();
            switch (pilih) {
                case "s":
                    String  cari = n.next();
                    System.out.printf(cari(cari, favMovie));
                    System.out.println("berhenti? (y/n");
                    film = n.next();
                    break;
                case "d":
                    int detail = n.nextInt()-1;
                    detail(favMovie, detail);
                    System.out.println("berhenti? (y/n)");
                    film = n.next();
                    break;
                case "a":
                    add(favMovie);
                    tampilkan(favMovie);
                    System.out.println("berhenti? (y/n)");
                    film = n.next();
                    break;
                case "r":
                    int hapus = n.nextInt();
                    remove(favMovie, hapus);
                    tampilkan(favMovie);
                    System.out.println("berhenti? (y/n");
                    film = n.next();
                    break;

                default:
                    System.out.println("berhenti? (y/n)");
                    film = n.next();
                    break;
            }
        }
    }
    //memasukkan dan mengubah nilai elemen pada HashMap menggunakan kode put atau replace
    static void tampilkan (HashMap<String, ArrayList<String>> favMovie){
        ArrayList<String> judul = favMovie.get("judul");
        System.out.println("favourite movie");
        for (int i = 0; i < judul.size(); i++) {
            System.out.println(i+1 + ". " + judul.get(i));
        }
    }
    static void detail(HashMap<String, ArrayList<String>> favMovie, int i){
        
        System.out.println("judul    : " + favMovie.get("judul").get(i));
        System.out.println("rilis    : " + favMovie.get("rilis").get(i));
        System.out.println("durasi   : " + favMovie.get("durasi").get(i));
        System.out.println("genre    : " + favMovie.get("genre").get(i));
        System.out.println("sinopsis : " + favMovie.get("sinopsis").get(i));
        System.out.println("cast     : " + favMovie.get("cast").get(i));
    }
    static void add (HashMap<String, ArrayList<String>> favMovie){
        n.nextLine();
        System.out.println("judul: ");
        String title = n.nextLine();
        System.out.println("rilis: ");
        String realease = n.nextLine();
        System.out.println("durasi");
        String duration = n.nextLine();
        System.out.println("genre: ");
        String jenre = n.nextLine();
        System.out.println("sinopsis: ");
        String synopsis = n.nextLine();
        System.out.println("cast: ");
        String casting = n.nextLine();
        //mendapatkan nilai elemen berdasarkan () cara HashMap get()
        //menambahkan nilai add cara ArrayList
        favMovie.get("judul").add(title);
        favMovie.get("rilis").add(realease);
        favMovie.get("durasi").add(duration);
        favMovie.get("genre").add(jenre);
        favMovie.get("sinopsis").add(synopsis);
        favMovie.get("cast").add(casting);
    }
    static String cari (String masuk, HashMap<String, ArrayList<String>> favMovie){
        ArrayList<String> judul = favMovie.get("judul");
        String out = "hasil ("+ masuk +")\n";
        for (int i = 0; i < judul.size(); i++) {
            String movie = judul.get(i);
            for (int j = 0; j < movie.length(); j++) {
                if(j+masuk.length() <= movie.length()){
                    if(masuk.equalsIgnoreCase(movie.substring(j,j+masuk.length()))){
                        out = out + String.format(i+1 + ", " +movie + "\n");
                        break;
                    }
                }
                else{
                    continue;
                }
            }
        }
        return out;
    }
    static void remove(HashMap<String, ArrayList<String>> favMovie, int k){
                favMovie.get("judul").remove(k);
                favMovie.get("rilis").remove(k);
                favMovie.get("durasi").remove(k);
                favMovie.get("sinopsisl").remove(k);
                favMovie.get("genre").remove(k);
                favMovie.get("cast").remove(k);
        
            }   
}