import aula.loops.generation.ex01.Ex01;
import aula.loops.generation.ex02.Ex02;
import aula.loops.generation.poo.Ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex01 ex01 = new Ex01();
        Ex02 ex02 = new Ex02();
        Ex03 ex03 = new Ex03();

        System.out.println("Digite sua idade");
        int age = sc.nextInt();
        while (age > 0){
            ex03.execute(age);
            System.out.println("Digite sua idade");
            age = sc.nextInt();
        }
        System.out.printf("""
                Total de pessoas menores de 21 anos: %d
                Total de pessoas maiores de 50 anos: %d
                """, ex03.getMinorCount(), ex03.getBiggerCount());



    }
}