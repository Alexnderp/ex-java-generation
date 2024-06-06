package aula.condicionais.generation;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int code;
        double salary;

        System.out.println("Informe seu nome: ");
        name = sc.nextLine();
        System.out.println("Informe o codigo do cargo: ");
        code = sc.nextInt();
        System.out.println("Informe seu salario: ");
        salary = sc.nextDouble();


        switch (code) {
            case 1: {
                salary = salary + (0.1 * salary);
                System.out.printf("""
                        Nome do colaborador: %s
                        Cargo: Gerente
                        Salário: %.2f
                        """, name,salary);
                break;
            }
            case 2: {
                salary = salary + (0.07 * salary);
                System.out.printf("""
                        Nome do colaborador: %s
                        Cargo: Vendedor
                        Salário: %.2f
                        """, name,salary);
                break;
            }
            case 3: {
                salary = salary + (0.09 * salary);
                System.out.printf("""
                        Nome do colaborador: %s
                        Cargo: Supervisor
                        Salário: %.2f
                        """, name,salary);
                break;
            }
            case 4: {
                salary = salary + (0.06 * salary);
                System.out.printf("""
                        Nome do colaborador: %s
                        Cargo: Motorista
                        Salário: %.2f
                        """, name,salary);;
                break;
            }
            case 5: {
                salary = salary + (0.05 * salary);
                System.out.printf("""
                        Nome do colaborador: %s
                        Cargo: Estoquista
                        Salário: %.2f
                        """, name,salary);
                break;
            }
            case 6: {
                salary = salary + (0.08 * salary);
                System.out.printf("""
                        Nome do colaborador: %s
                        Cargo: Técnico de TI
                        Salário: %.2f
                        """, name,salary);
                break;
            }
            default:
                System.out.println("Opção inválida.");
        }
    }
}
