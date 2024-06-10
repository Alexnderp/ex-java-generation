package aula.collections.generation.ex03;

import java.util.Iterator;
import java.util.Set;

public class Ex03 {
    public void execute(Set<Integer> numbers){
        Iterator<Integer> inumbers = numbers.iterator();
        System.out.println("Listar dados do Set:");

        while(inumbers.hasNext()){
            System.out.println(inumbers.next());
        }
    }
}
