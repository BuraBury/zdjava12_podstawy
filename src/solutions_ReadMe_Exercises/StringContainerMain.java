package solutions_ReadMe_Exercises;

public class StringContainerMain {

    public static void main(String[] argt) {
        String[] testData = {"tomek", "paulina", "jakub", "bercik"};

        StringContainer costam = new StringContainer(testData);
        StringContainer poem = new StringContainer();

        costam.remove(1);

        System.out.println(costam.toString());






    }
}