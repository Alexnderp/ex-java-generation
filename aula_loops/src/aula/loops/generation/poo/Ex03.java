package aula.loops.generation.poo;

public class Ex03 {
    int minorCount = 0;
    int biggerCount = 0;

    public int getMinorCount() {
        return minorCount;
    }

    public int getBiggerCount() {
        return biggerCount;
    }

    public void execute(int age){
            if (age < 21){
                this.minorCount++;
            }else if(age > 50){
                this.biggerCount++;
            }

    }
}
