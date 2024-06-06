package aula.loops.generation.ex02;

public class Ex02 {
    public void execute(int[] numbers){
        int pairNumbers = 0, oddNumbers = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                pairNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.printf("""
                Total de números pares: %d
                Total de números ímpares: %d
                """,pairNumbers, oddNumbers);
    }

}
