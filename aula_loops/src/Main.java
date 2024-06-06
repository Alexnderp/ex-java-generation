import aula.loops.generation.ex01.Ex01;
import aula.loops.generation.ex02.Ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex01 ex01 = new Ex01();
        Ex02 ex02 = new Ex02();

        System.out.println("Digite o valor inicial: ");
        int init = sc.nextInt();
        System.out.println("Digite o valor final: ");
        int limit = sc.nextInt();
        ex01.execute(init,limit);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            System.out.printf("Digite o %d valor: \n", i);
            numbers[i] = sc.nextInt();
        }

        ex02.execute(numbers);


    }
}