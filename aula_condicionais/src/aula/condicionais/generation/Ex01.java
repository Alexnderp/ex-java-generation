package aula.condicionais.generation;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Informe o valor de a");
        sum += sc.nextInt();
        System.out.println("Informe o valor de b");
        sum += sc.nextInt();
        System.out.println("Informe o valor de c");
        number = sc.nextInt();

        if(sum > number){
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (sum < number) {
            System.out.println("A Soma de A + B é Menor do que C");
        }else {
            System.out.println("A Soma de A + B é Igual a C");
        }
    }
}