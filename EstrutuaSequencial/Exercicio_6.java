package Exercicios_Udemy_Java.EstrutuaSequencial;
import java.util.Scanner;
/*
* a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
* */
public class Exercicio_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] lados = sc.nextLine().split(" ");
        double a, b, c;
        a = Double.parseDouble(lados[0]);
        b = Double.parseDouble(lados[1]);
        c = Double.parseDouble(lados[2]);

        System.out.println(a * c / 2);
        System.out.println(3.14159 * Math.pow(c, 2));
        System.out.println((a + b) * c / 2);
        System.out.println(Math.pow(b, 2));
        System.out.println(a * b);
    }
}
