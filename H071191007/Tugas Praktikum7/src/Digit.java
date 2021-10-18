// import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

class Digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input starting number : ");
        int start = sc.nextInt();
        System.out.print("Input end number : ");
        int end = sc.nextInt();
        System.out.print("Bilangan yang dapat dibagi dgn digitnya : ");
        ArrayList <Integer> result = new ArrayList<>();

        int startPoint = end > start ? start : end;
        int endPoint = end > start ? end : start;

        int digits;
        for (int i = startPoint; i <= endPoint ; i++ ) {
            HashMap<Integer, Integer> numbers = new HashMap<>();

            int a = i;
            int b = 0;
            while (Math.abs(a)>0) {
                digits = Math.abs(a) % 10;
                a = Math.abs(a) / 10;
                numbers.put(b, digits);
                b++;
            }
            a = i;
            int correctDigits = 0;

            for (int k = 0; k < numbers.size() ; k++) {
                if (numbers.get(k) != 0 && a % Math.abs (numbers.get(k)) == 0) {
                    correctDigits++;
                }
            }
            if (correctDigits == b) {
                result.add(a);
            }
        }
        if (start > end) {
            Collections.reverse(result);
            
            System.out.print(result);
        } else {
            System.out.print(result);
        }
    }
}