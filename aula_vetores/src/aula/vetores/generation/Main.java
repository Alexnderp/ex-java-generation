package aula.vetores.generation;

import aula.vetores.generation.ex01.Ex01;
import aula.vetores.generation.ex02.Ex02;
import aula.vetores.generation.ex03.Ex03;
import aula.vetores.generation.ex04.Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex01 ex01 = new Ex01();
        Ex02 ex02 = new Ex02();
        Ex03 ex03 = new Ex03();
        Ex04 ex04 = new Ex04();
        int[] numbers = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.println("Digite o valor que deseja encontrar: ");
        int value = sc.nextInt();
        System.out.println(ex01.execute(numbers,value));

        ex02.execute(numbers);

        int[][] matrix = new int[3][3];
        for (int i= 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("\nInsira o valor desejado: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        ex03.execute(matrix);


        double[][] notes = new double[10][4];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite a nota [%d] para o participante [%d]: ", j, i);
                notes[i][j] = sc.nextDouble();
            }
        }

        ex04.execute(notes);

    }
}