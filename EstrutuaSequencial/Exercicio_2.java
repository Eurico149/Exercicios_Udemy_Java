package Exercicios_Udemy_Java.EstrutuaSequencial;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble(), pi = 3.14159;
        double resultado = pi * (raio * raio);

        System.out.printf("A=%.4f", resultado);
    }
}
