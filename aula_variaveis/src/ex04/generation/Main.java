package ex04.generation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[4];
        double diff;

        for (int i = 0; i < numbers.length; i++){
            System.out.printf("Digite o valor %d\n", (i+1));
            numbers[i] = sc.nextDouble();
        }
        sc.close();
        diff = (numbers[0] * numbers[1]) - (numbers[2]*numbers[3]);
        System.out.println(diff);
    }
}
