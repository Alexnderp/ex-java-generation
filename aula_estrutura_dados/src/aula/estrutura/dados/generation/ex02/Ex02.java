package aula.estrutura.dados.generation.ex02;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {
    public void execute(){
        Scanner sc = new Scanner(System.in);
        Stack<String> booksStack = new Stack<>();
        System.out.printf("""
                --------------------------------------
                Informe a opção desejada:
                
                1 - Adicionar livro na pilha
                2 - Listar todos os livros
                3 - Retirar livro da pilha
                0 - Sair
                --------------------------------------
                """);
        String data = sc.nextLine();

        while (!data.equals("0") ) {
            if (data.equals("1") ) {
                System.out.println("Informe o nome do livro:");
                booksStack.push(sc.nextLine());
                System.out.println("pilha: ");
                booksStack.forEach(System.out::println);
                System.out.println("Livro Adicionado!");
            } else if (data.equals("2")) {

                if (!booksStack.isEmpty()) {
                    System.out.println("Lista de livros na Pilha: ");
                    booksStack.forEach(System.out::println);
                } else {
                    System.out.println("A Pilha está vazia!");
                }
            } else if (data.equals("3")) {
                if (!booksStack.isEmpty()) {
                    booksStack.pop();
                    System.out.println("Pilha: ");
                    booksStack.forEach(System.out::println);
                    System.out.println("O livro foi retirado da pilha!");
                } else {
                    System.out.println("A pilha está vazia!");
                }
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.printf("""
                    --------------------------------------
                    Informe a opção desejada:
                                    
                    1 - Adicionar livro na pilha
                    2 - Listar todos os livros
                    3 - Retirar livro da pilha
                    0 - Sair
                    --------------------------------------
                    """);
            data = sc.nextLine();
        }
        System.out.println("Programa Finalizado!");


    }
}
