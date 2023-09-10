package Exercicios_Udemy_Java.EstruturaCondicional;
import java.util.Scanner;
// divisao por 0 resolver dps!
public class Exercicio_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] numeros = sc.nextLine().split(" ");
        if ((Integer.parseInt(numeros[0]) % Integer.parseInt(numeros[1])) == 0){
            System.out.print("Sao Multiplos");
        } else if((Integer.parseInt(numeros[1]) % Integer.parseInt(numeros[0])) == 0){
            System.out.print("Sao Multiplos");
        } else{
            System.out.print("Nao sao Multiplos");
        }
        sc.close();
    }
}
