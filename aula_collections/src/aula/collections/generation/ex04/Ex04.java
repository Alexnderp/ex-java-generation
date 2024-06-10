package aula.collections.generation.ex04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex04 {
    public void execute(int number){
        Set<Integer> numbers = new HashSet<>();

        numbers.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
        if (numbers.contains(number)){
            System.out.printf("O número %d foi encontrado! \n", number);
        } else {
            System.out.printf("O número %d não foi encontrado! \n", number);
        }

    }
}
