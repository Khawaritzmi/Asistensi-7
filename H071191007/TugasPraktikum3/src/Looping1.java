import java.util.Scanner;
class Looping1 {
    public static void main(String[] args) {
        Scanner ra = new Scanner(System.in);
        System.out.print("Masukkan bilangan prima = ");
        int n = ra.nextInt();
        int factor = 0;

        for(int i = 2; i <= n ; i++){
            for(int j = 1;j<=i;j++){
               if(i % j == 0){
                  factor++;
                }
            }
           if(factor == 2){
                System.out.print(i+",");
           }
          factor=0;
            
       }
      
       }
        
    }
