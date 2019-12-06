package Tugas;
import java.util.*;
public class Praktikum2{
    public static void main(String[] args) {
    String  pokemon1, element1, pokemon2, element2;
        Scanner element = new Scanner(System.in);
        System.out.println("masukan pokemon");
        pokemon1 = element.next(); element1 = element.next();
        pokemon2 = element.next(); element2 = element.next();

        if (element1.equals("fire")){
            if (element2.equals("water")){
                System.out.println("element = water");
            }else if (element2.equals("ice")){
                System.out.println("element = fire");
            }else if (element2.equals("eletric")){
                System.out.println("element = fire");
            }else if (element2.equals("ground")){
                System.out.println("element = ground");
            }else if (element2.equals("fire")){
                System.out.println("sama-sama atau draw");
            }

        }else if (element1.equals("ground")){
            if (element2.equals("fire")){
                System.out.println("element = ground");
            }else if (element2.equals("eletric")){
                System.out.println("element = ground");
            }else if (element2.equals("water")){
                System.out.println("element = water");
            }else if (element2.equals("ice")){
                System.out.println("element = ice");
            }else if (element2.equals("ground")){
                System.out.println("sama-sama atau draw");
            }

        }else if (element1.equals("water")){
            if (element2.equals("eletric")){
                System.out.println("element = eletric");
            }else if (element2.equals("ice")){
                System.out.println("element = ice");
            }else if (element2.equals("ground")){
                System.out.println("element = water");
            }else if (element2.equals("fire")){
                System.out.println("element = water");
            }else if (element2.equals("water")){
                System.out.println("sama-sama atau draw");
            }

        }else if (element1.equals("ice")){
            if (element2.equals("ground")){
                System.out.println("element = ice");
            }else if (element2.equals("water")){
                System.out.println("element = ice");
            }else if (element2.equals("fire")){
                System.out.println("element = fire");
            }else if (element2.equals("eletric")){
                System.out.println("element = eletric");
            }else if (element2.equals("ice")){
                System.out.println("sama-sama atau draw");
            }
            
        }else if (element1.equals("eletric")){
            if (element2.equals("water")){
                System.out.println("element = eletric");
            }else if (element2.equals("ice")){
                System.out.println("element = eletric");
            }else if (element2.equals("fire")){
                System.out.println("element = fire");
            }else if (element2.equals("ground")){
                System.out.println("element = ground");
            }else if (element2.equals("eletric")){
                System.out.println("sama-sama atau draw");
            }
        }
    }
}