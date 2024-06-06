package aula.loops.generation.ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers, sum = 0;


        do {
            System.out.println("Digite o numero desejado:");
            numbers = sc.nextInt();
            sum+=numbers;
        } while (numbers != 0);

        System.out.println("A soma dos números positivos é: " + sum);
    }
}
