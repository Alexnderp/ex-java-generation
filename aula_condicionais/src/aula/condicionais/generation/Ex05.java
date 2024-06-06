package aula.condicionais.generation;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product, amount;
        double total = 0;

        System.out.println("Informe o codigo do produto: ");
        product = sc.nextInt();

        System.out.println("Informe a quantidade: ");
        amount = sc.nextInt();



        switch (product) {
            case 1: {
                System.out.println("Produto: Cachorro-quente");
                total = amount * 10;
                break;
            }
            case 2: {
                System.out.println("Produto: X-Salada");
                total = amount * 15;
                break;
            }
            case 3: {
                System.out.println("Produto: X-Bacon");
                total = amount * 18;
                break;
            }
            case 4: {
                System.out.println("Produto: Bauru");
                total = amount * 12;
                break;
            }
            case 5: {
                System.out.println("Produto: Refrigerante");
                total = amount * 8;
                break;
            }
            case 6: {
                System.out.println("Produto: Suco de laranja");
                total = amount * 13;
                break;
            }
            default:
                System.out.println("Opção inválida.");
        }

        if(total > 0) System.out.printf("Valor total: R$ %.2f", total);
    }
}
