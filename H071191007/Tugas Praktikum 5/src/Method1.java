import java.util.Scanner;
class Method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("FPB dari " + a + " dan " + b + " = " + FPB(a, b));
    }
    public static int FPB(int a,int b){
        do 
        {
            int c = b;
            b = a % b;
            a = c;
        } while(b != 0);
        return a;
    }
}