package aula.loops.generation.ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, genderCode, developCode;
        int backend = 0, womans = 0, mans = 0, nonBinary = 0,peoples = 0, averageAge = 0;
        String answer = "s";

        while (!answer.equalsIgnoreCase("n")){
            System.out.println("Informe sua idade: ");
            age = sc.nextInt();
            averageAge+=age;
            System.out.println("Escolha a opção da sua identidade de genero: ");
            genderCode = sc.nextInt();
            switch (genderCode){
                case 1:
                    peoples++;
                    break;
                case 2:
                    peoples++;
                    break;
                case 3:
                    peoples++;
                    break;
                case 4:
                    peoples++;
                case 5:
                    peoples++;
                case 6:
                    peoples++;
                default:
                    System.out.println("Opção invalida");
            }

            System.out.println("Informe sua stack: ");
            developCode = sc.nextInt();

            switch (developCode){
                case 1:
                    backend++;
                case 2:
                    if (genderCode == 1 || genderCode==4){
                        womans++;
                    }
                case 3:
                    if (genderCode == 2 || genderCode == 5 && age > 40){
                        mans++;
                    }
                case 4:
                    if (genderCode == 3 && age < 30){
                        nonBinary++;
                    }

                    System.out.println("deseja continuar a leitura dos dados de um novo colaborador ou não (S/N).");
                    answer = sc.nextLine();
            }
        }

        System.out.printf("""
                Total de pessoas desenvolvedoras Backend: %d
                Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d
                Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d
                Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d
                O número total de pessoas que responderam à pesquisa: %d
                A média de idade das pessoas que responderam à pesquisa: %.2f
                """, backend, womans, mans, nonBinary, peoples, (double)averageAge/peoples);

        
    }
}
