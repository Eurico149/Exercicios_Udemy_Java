package Exercicios_Udemy_Java.EstrutuaSequencial;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total;
        String[] mercadoria1 = sc.nextLine().split(" ");
        total = Integer.parseInt(mercadoria1[1]) * Double.parseDouble(mercadoria1[2]);
        String[] mercadoria2 = sc.nextLine().split(" ");
        total += Integer.parseInt(mercadoria2[1]) * Double.parseDouble(mercadoria2[2]);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        sc.close();
    }
}
