package Exercicios_Udemy_Java.EstruturaCondicional;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero < 0){
            System.out.print("NEGATIVO");
        } else {
            System.out.print("NAO NEGATIVO");
        }
        sc.close();
    }
}
