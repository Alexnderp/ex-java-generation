package aula.vetores.generation.ex01;

public class Ex01 {
    public String execute(int[] numbers, int value){
        String response;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == value){
                response = "O número %d está localizado na posição: %d";
                return String.format(response,value,i);
            }
        }
        response = "O número %d não foi encontrado!";
        return String.format(response,value);
    }
}
