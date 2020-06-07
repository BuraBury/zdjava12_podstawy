package solutions_ReadMe_Exercises;

public class StringContainerMain {

    public static void main(String[] argt) {
        String[] testData = {"tomek", "paulina", "jakub", "bercik"};
        String[] testData1 = {"Ala", "ma", "kota", "a", "kot", "ma"};

        StringContainer stringContainer = new StringContainer(testData);
        StringContainer stringContainer1 = new StringContainer(testData1);

        stringContainer1.add("Alę", testData1);
        stringContainer1.set("Paulina", 0);
        stringContainer1.remove(2);
        stringContainer1.set(", a kot", 3);
        stringContainer1.set("psa", 2);


        System.out.println(stringContainer1.toString());
        System.out.println(stringContainer.toString());


    }
}