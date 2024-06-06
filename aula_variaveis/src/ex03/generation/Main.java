package ex03.generation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary,nighttimeSupplement, extraHour, discount, netSalary;
        System.out.println("Informe seu salário:");
        salary = sc.nextDouble();
        System.out.println("Informe o adicional noturno:");
        nighttimeSupplement = sc.nextDouble();
        System.out.println("Informe o valor das horas extras:");
        extraHour = sc.nextDouble();
        System.out.println("Informe o total de descontos:");
        discount = sc.nextDouble();
        sc.close();
        netSalary = salary+nighttimeSupplement+(extraHour*5)- discount;
        System.out.println(netSalary);
    }
}
