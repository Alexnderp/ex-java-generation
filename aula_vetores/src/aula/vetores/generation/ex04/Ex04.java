package aula.vetores.generation.ex04;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

public class Ex04 {
    public void execute(double[][] numbers){
        double[] average = new double[numbers.length];
        DecimalFormatSymbols dot = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##",dot);

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < 4; j++){
                average[i] += numbers[i][j];
            }
            average[i] = Double.parseDouble(decimalFormat.format(average[i]/4));;
        }

        System.out.println(Arrays.toString(average));
    }
}
