package aula.collections.generation;

import aula.collections.generation.ex01.Ex01;
import aula.collections.generation.ex02.Ex02;
import aula.collections.generation.ex03.Ex03;
import aula.collections.generation.ex04.Ex04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex01 ex01 = new Ex01();
        Ex02 ex02 = new Ex02();
        Ex03 ex03 = new Ex03();
        Ex04 ex04 = new Ex04();
        ArrayList<String> colors = new ArrayList<>();
        Set<Integer> numbers = new HashSet<Integer>();

        for(int i = 0; i < 5; i++){
            System.out.println("Informe a cor desejada: ");
            colors.add(sc.nextLine());
        }
        ex01.execute(colors);

        System.out.println("Digite o numero que deseja encontrar: ");
        int number = sc.nextInt();
        ex02.execute(number);

        for (int i = 0; i < 10; i++){
            System.out.println("Informe o valor desejado: ");
            numbers.add(sc.nextInt());
        }
        ex03.execute(numbers);

        System.out.println("Digite o numero que deseja encontrar: ");
        number = sc.nextInt();
        ex04.execute(number);

    }
}