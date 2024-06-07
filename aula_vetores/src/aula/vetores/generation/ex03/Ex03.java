package aula.vetores.generation.ex03;

import java.util.Arrays;

public class Ex03 {
    public void execute(int[][] numbers){
        int[] mainDiagonal = {numbers[0][0], numbers[1][1], numbers[2][2]};
        int[] secondaryDiagonal = {numbers[0][2], numbers[1][1], numbers[2][0]};
        int mainSum = 0, secondarySum = 0;

        for (int number:mainDiagonal){
            mainSum+=number;
        }
        for (int number:secondaryDiagonal){
            secondarySum+=number;
        }

        System.out.println("Elementos da Diagonal Principal: " + Arrays.toString(mainDiagonal));
        System.out.println("Elementos da Diagonal Secundária: " + Arrays.toString(secondaryDiagonal));
        System.out.println("Soma dos Elementos da Diagonal Principal: " + mainSum);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + secondarySum);
    }
}
