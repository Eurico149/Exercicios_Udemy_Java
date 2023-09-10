package Exercicios_Udemy_Java.EstruturaCondicional;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Exercicio_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Double> cardapio = new HashMap<>();
        cardapio.put(1, 4.00);
        cardapio.put(2, 4.50);
        cardapio.put(3, 5.00);
        cardapio.put(4, 2.00);
        cardapio.put(5, 1.50);
        String[] pedido = sc.nextLine().split(" ");

        int quantidade = Integer.parseInt(pedido[1]);
        double valor = cardapio.get(Integer.parseInt(pedido[0]));
        System.out.printf("Total: R$%.2f", quantidade*valor);
        sc.close();
    }
}
