package aula.collections.generation.ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02 {
    public void execute(int number){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

        int index = numbers.indexOf(number);

        if (index != -1){
            System.out.printf("O número %d está localizado na posição: %d \n", number, index);
        }else {
            System.out.printf("O número %d não foi encontrado! \n", number);
        }

    }
}
