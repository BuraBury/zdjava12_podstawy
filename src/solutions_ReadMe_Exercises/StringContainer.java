package solutions_ReadMe_Exercises;
public class StringContainer {

    private String[] data;

    public StringContainer(String[] initialData) {
        this.data = initialData;
    }

    @Override
    public String toString() {
        String result = " ";
        for (int i = 0; i < data.length; i++) {
            result += "[" + i + " " + data[i] + "]";
        }
        return result + "\n";
    }

    public void set(String newData, int index) {
        if (index < data.length) {
            data[index] = newData;
        } else {
            System.out.println("Błąd");
        }
    }

    //dodawanie na koncu tablicy nowej wartości
    public void add(String newData, String[] array) {
        //1. stowrzyc nowa tablice, dłuższą
        //2. przepisać stare dane do nowej tablicy
        //3. dodac nowe dane na koncu

        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = newData;

        this.data = newArray;

    }

}
