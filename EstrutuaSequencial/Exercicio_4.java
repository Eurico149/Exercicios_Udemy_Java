package Exercicios_Udemy_Java.EstrutuaSequencial;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number, hours;
        double salaryPerHour;
        number = sc.nextInt();
        hours = sc.nextInt();
        salaryPerHour = sc.nextDouble();

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", number, salaryPerHour * hours);
        sc.close();
    }
}
