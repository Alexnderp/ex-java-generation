package aula.condicionais.generation;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int operation;
        double balance = 1000.00;
        double value;

        System.out.println("Escolha a operação: ");
        operation = sc.nextInt();

        switch (operation){
            case 1:
                System.out.printf("Saldo: %.2f", balance);
                break;
            case 2:
                System.out.println("Insira o valor do saque:");
                value = sc.nextDouble();
                if(balance < value){
                    System.out.println("Saldo Insuficiente!");
                }else {
                    balance = balance - value;
                    System.out.printf("Saldo: %.2f", balance);
                }
                break;
            case 3:
                System.out.println("Insira o valor do saque:");
                balance += sc.nextDouble();
                System.out.printf("Saldo: %.2f", balance);
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }

}
