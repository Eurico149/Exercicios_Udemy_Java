package Exercicios_Udemy_Java.EstruturaSequencial;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double resultado = pi * (raio * raio);

        System.out.printf("A=%.4f", resultado);
        sc.close();
    }
}