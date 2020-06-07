package solutions_ReadMe_Exercises;

public class StringContainerMain {

    public static void main(String[] argt) {
        String[] testData = {"tomek", "paulina", "jakub", "bercik"};

        StringContainer costam = new StringContainer(testData);
        StringContainer poem = new StringContainer();


        costam.add("Magda", testData);
        costam.add("Bubka", testData);
        costam.remove(2, testData);

        System.out.println(costam.toString());






    }
}