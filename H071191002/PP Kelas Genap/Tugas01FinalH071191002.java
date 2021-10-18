import java.util.Scanner;
public class Tugas01FinalH071191002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data [] = new int[10];
        int sum = 0;
        for(int i=0; i<data.length; i++)
        {
            data[i] = sc.nextInt();
            sum += data[i]; 
        }
        System.out.println("No. \t Data. \t Error");
        for (int i=0; i<data.length;i++)
        {
            System.out.println((i+1)+". \t "+ data[i]+ " \t "+(Math.sqrt(Math.pow((((sum)/data.length)-data[i]),2))));
        }
    }
}