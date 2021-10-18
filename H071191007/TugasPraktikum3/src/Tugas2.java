import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int j = 0; j <= y; j++) {
            System.out.printf(j + " ");
            if (j % x == 0) {
                System.out.println();
            }
        }
    }
}