package aula.collections.generation.ex01;

import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {
    public void execute(ArrayList<String> colors){
        System.out.println("Listar todas as cores:");
        colors.forEach(System.out::println);
        Collections.sort(colors);
        System.out.println("Ordenar as cores:");
        colors.forEach(System.out::println);
    }
}
