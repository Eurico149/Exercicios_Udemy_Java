package Exercicios_Udemy_Java.EstruturaSequencial;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();

        System.out.print("DIFERENCA = " + ((num1 * num2) - (num3 * num4)));
        sc.close();
    }
}