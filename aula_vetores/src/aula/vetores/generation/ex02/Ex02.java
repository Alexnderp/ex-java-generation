package aula.vetores.generation.ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02 {
    int sum;
    ArrayList<Integer> pairNumbers= new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    public void execute(int[] numbers){
        sum = Arrays.stream(numbers).sum();

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                pairNumbers.add(numbers[i]);
            }
            if (i % 2 != 0){
                oddNumbers.add(numbers[i]);
            }
        }

        System.out.println("Elementos nos índices ímpares: " + oddNumbers);
        System.out.println("Elementos pares: " + pairNumbers);
        System.out.println("Soma: " + sum);
        System.out.printf("Média: %.2f" , (double) sum / numbers.length);
    }
}
