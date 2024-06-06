package aula.condicionais.generation;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Digite o numero desejado: ");
        number = sc.nextInt();

        if (number >= 0 && number % 2 == 0){
            System.out.printf("O Número %d é par e positivo!", number);
        } else if (number < 0 && number % 2 == 0) {
            System.out.printf("O Número %d é par e negativo!", number);
        } else if (number >= 0 && number % 2 != 0) {
            System.out.printf("O Número %d é ímpar e positivo!", number);
        } else {
            System.out.printf("O Número %d é ímpar e negativo!", number);
        }
    }
}
