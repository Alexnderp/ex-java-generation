package ex01.generation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary, allowance, newSalary;

        System.out.println("Informe seu salário:");
        salary = sc.nextDouble();
        System.out.println("informe o abono:");
        allowance = sc.nextDouble();
        sc.close();

        newSalary = salary + allowance;
        System.out.println(newSalary);

    }
}