package aula.loops.generation.ex06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, number, average = 0;


        do {
            System.out.println("Digite o numero desejado:");
            number = sc.nextInt();
            if (number % 3 == 0){
                count++;
                average+=number;
            }
        } while (number != 0);

        System.out.println("A média de todos os números múltiplos de 3 é: " + (double)average/count);

    }
}
