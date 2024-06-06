package aula.loops.generation.ex01;

public class Ex01 {

    public void execute(int init, int limit){
        if (init > limit) {
            System.out.println("Intervalo inválido!");
        }else {
            for (int i = init; i < limit; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.printf("%d é múltiplo de 3 e 5\n", i);
                }
            }
        }

    }
}
