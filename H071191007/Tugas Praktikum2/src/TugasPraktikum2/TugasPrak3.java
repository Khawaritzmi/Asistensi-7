package TugasPraktikum2;
import java.util.Scanner;
class TugasPrak3 {
    public static void main(String[] args) {
        Scanner ri = new Scanner(System.in);
        System.out.println("input x");
        int x = ri.nextInt();
        System.out.println("input y");
        int y = ri.nextInt();
        int a = 25;
        int b = 144;
        int c = 400;
        
        double i = ((Math.pow(x, 2)) + (Math.pow(y, 2)));
        if (i < a) {
            System.out.println("Berada didalam lingkaran A");
        } else if (i < b) {
            System.out.println("Berada didalam lingkaran B");
        } else if (i < c) { 
            System.out.println("Berada didalam lingkaran C");
        }
           
        }
    }
 