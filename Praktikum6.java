import java.util.Scanner;
    class Praktikum6{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("x = ");
            int x = sc.nextInt();
            System.out.print("y = ");
            int y = sc.nextInt();
            double total = Math.pow(x,2)+Math.pow(y,2);
            
            if(total<25){
                System.out.println("berada didalam lingkaran A");
            }else if(total==25){
                System.out.println("berada ditepi lingkaran A");
            }else if(total<144){
                System.out.println("berada didalam lingkaran B");
            }else if(total==144){
                System.out.println("berada ditepi lingkaran B");
            }else if(total<400 && total >144){
                System.out.println("berada didalam lingkaran C");
            }else if(total==400){
                System.out.println("berada ditepi lingkaran C");
            }
        }
    }