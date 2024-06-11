package aula.estrutura.dados.generation.ex01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {
    public void execute(){
        Scanner sc = new Scanner(System.in);
        Queue<String> clientsQueue = new LinkedList<>();
        System.out.printf("""
                --------------------------------------
                Informe a opção desejada:
                
                1 - Adicionar clientes na fila
                2 - Listar todos os clientes
                3 - Retirar cliente da fila
                0 - Sair
                --------------------------------------
                """);
        String data = sc.nextLine();

        while (!data.equals("0")) {
            if (data.equals("1")) {
                System.out.println("Informe o nome do cliente:");
                clientsQueue.add(sc.next());
                System.out.println("Fila: ");
                clientsQueue.forEach(System.out::println);
                System.out.println("Cliente Adicionado!");
            } else if (data.equals("2")) {

                if (!clientsQueue.isEmpty()) {
                    System.out.println("Lista de Clientes na Fila: ");
                    clientsQueue.forEach(System.out::println);
                } else {
                    System.out.println("A Fila está vazia!");
                }
            } else if (data.equals("3")) {
                if (!clientsQueue.isEmpty()) {
                    clientsQueue.remove();
                    System.out.println("Fila: ");
                    clientsQueue.forEach(System.out::println);
                    System.out.println("O Cliente foi Chamado!");
                } else {
                    System.out.println("A Fila está vazia!");
                }
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.printf("""
                    --------------------------------------
                    Informe a opção desejada:
                                    
                    1 - Adicionar clientes na fila
                    2 - Listar todos os clientes
                    3 - Retirar cliente da fila
                    0 - Sair
                    --------------------------------------
                    """);
            data = sc.nextLine();
        }
        System.out.println("Programa Finalizado!");

    }
}
