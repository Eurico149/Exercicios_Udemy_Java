package Exercicios_Udemy_Java.EstruturaCondicional;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] horarios = sc.nextLine().split(" ");
        int inicio = Integer.parseInt(horarios[0]);
        int fim = Integer.parseInt(horarios[1]);

        if(inicio >= fim){
            fim += 24;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)", fim-inicio);
        sc.close();
    }
}
