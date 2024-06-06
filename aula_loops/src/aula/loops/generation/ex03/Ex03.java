package aula.loops.generation.ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int minorCount = 0, biggerCount = 0;
        System.out.println("Digite uma idade: ");
        age = sc.nextInt();
        while (age > 0) {
            if (age < 21) {
                minorCount++;
            } else if (age > 50) {
                biggerCount++;
            }
            System.out.println("Digite uma idade: ");
            age = sc.nextInt();
        }
        System.out.printf( """
                Total de pessoas menores de 21 anos: %d
                Total de pessoas maiores de 50 anos: %d
                """, minorCount, biggerCount);
    }
}
