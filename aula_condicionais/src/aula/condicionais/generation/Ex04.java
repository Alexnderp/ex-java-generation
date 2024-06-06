package aula.condicionais.generation;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String feature;

        System.out.println("Informe se é vertebrado ou invertebrado:");
        feature = sc.nextLine();

        if (feature.equalsIgnoreCase("vertebrado")) {
            System.out.println("Informe se é ave ou mamifero:");
            feature = sc.nextLine();
            if (feature.equalsIgnoreCase("ave")) {
                System.out.println("Informe se é carnivoro ou onivoro:");
                feature = sc.nextLine();
                if (feature.equalsIgnoreCase("carnivoro")) {
                    System.out.println("Aguia");
                } else if (feature.equalsIgnoreCase("onivoro")) {
                    System.out.println("Pomba");
                } else {
                    System.out.println("Ocorreu um erro aqui");
                }

            } else if (feature.equalsIgnoreCase("mamifero")) {
                System.out.println("Informe se é onivoro ou herbivoro:");
                feature = sc.nextLine();
                if (feature.equalsIgnoreCase("onivoro")) {
                    System.out.println("Homem");
                } else if (feature.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Vaca");
                }else {
                    System.out.println("Ocorreu um erro aqui");
                }

            }

        } else if (feature.equalsIgnoreCase("invertebrado")) {
            System.out.println("Informe se é inseto ou anelidio:");
            feature = sc.nextLine();
            if (feature.equalsIgnoreCase("inseto")) {
                System.out.println("Informe se é hematofago ou herbivoro:");
                feature = sc.nextLine();
                if (feature.equalsIgnoreCase("hematofago")) {
                    System.out.println("Pulga");
                } else if (feature.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Lagarta");
                }

            } else if (feature.equalsIgnoreCase("anelidio")) {
                System.out.println("Informe se é hematofago ou onivoro:");
                feature = sc.nextLine();
                if (feature.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                } else if (feature.equalsIgnoreCase("hematofago")) {
                    System.out.println("Sanguessuga");
                }else {
                    System.out.println("Ocorreu um erro aqui");
                }
            }
        }
    }
}
