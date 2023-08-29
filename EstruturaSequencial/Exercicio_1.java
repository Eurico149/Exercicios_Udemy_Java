package Exercicios_Udemy_Java.EstruturaSequencial;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        System.out.print("SOMA = "+ (numero1 + numero2));
        sc.close();
    }
}