package aula.condicionais.generation;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String name;
         int age;
         boolean firstBloodDonation;

        System.out.println("Informe seu nome: ");
        name = sc.nextLine();
        System.out.println("Informe sua idade: ");
        age = sc.nextInt();
        System.out.println("Primeira doação? ");
        firstBloodDonation = sc.nextBoolean();

        if(age >= 18 && age <= 59){
            System.out.printf("%s está apto para doar sangue!",name);
        } else if (age >= 60 && age <= 69 && !firstBloodDonation) {
            System.out.printf("%s está apto para doar sangue!",name);
        }else {
            System.out.printf("%s não está apto para doar sangue!", name);
        }
    }
}
