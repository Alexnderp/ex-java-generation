package ex02.generation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;

        for (int i = 0; i < 4; i++){
            System.out.println("Informe a nota " + i+1);
            media+=sc.nextDouble();
        }
        sc.close();
        System.out.println("Média final: " + media/4);
    }
}
