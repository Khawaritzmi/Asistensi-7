package TugasPraktikum;
import java.util.Scanner;
class Tugas03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();

        double total =Math.pow(x,2)+Math.pow(y,2);

        if(total<25){
            System.out.println("Berada di dalam lingkaran A,B, dan C");
        }else if(total==25){
            System.out.println("Berada di tepi lingkaran A");
        }else if(total<144 && total>25){
            System.out.println("Berada di dalam lingkaran B dan C, tetapi diluar lingkaran A");
        }else if(total==144){
            System.out.println("Berada di tepi lingkaran B");
        }else if(total<400 && total >144){
            System.out.println("Berada di dalam lingkaran C, tetapi diluar lingkaran A dan B");
        }else if(total==400){
            System.out.println("Berada di tepi lingkaran C");
        }else{
            System.out.println("Berada di luar lingkaran A,B, dan C");
        }
    }
}
