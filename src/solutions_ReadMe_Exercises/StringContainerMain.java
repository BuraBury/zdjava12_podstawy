package solutions_ReadMe_Exercises;

import java.util.Arrays;

public class StringContainerMain {

    public static void main(String[] argt) {
        String[] testData = {"tomek", "paulina", "jakub", "bercik"};
        StringContainer costam = new StringContainer(testData);
        costam.add("Magda", testData);
        costam.add("Bubka", testData);

        System.out.println(costam.toString());





    }
}