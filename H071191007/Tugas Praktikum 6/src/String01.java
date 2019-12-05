import java.util.Scanner;
class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int alphab = 0;
        int alphaf = 0;

        for (int i = 0;i < word.length();i++) {
            if (word.toLowerCase().charAt(i) == 'f') {
                alphaf++;
            } else if (word.toLowerCase().charAt(i) == 'b') {
                alphab++;
            }
            if (alphaf == 0 && alphab == 0) {
                System.out.println(word);
            } else {
                for (int j = 0; j < alphaf; j++) {
                    System.out.print("fizz");
                }
                for (int j = 0; j < alphab; j++) {
                    System.out.print("buzz");
                }
            }
        }
    }
}