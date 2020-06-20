package solutions_by_me;

public class StringContainer {

    //pole klasy
    private String[] data; // = null;

    //konstruktory
    public StringContainer(String[] initialData) {
        this.data = initialData;
    }

    public StringContainer() {
        this.data = new String[0];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        for (int i = 0; i < data.length; i++) {
            result.append("[").append(i).append(" ").append(data[i]).append("]");
        }
        return result + "\n";
    }

    public void set(String newData, int index) {
        if (index < 0 || index >= this.data.length) {
            System.out.println("Błąd");
            System.out.println(this.data.length + " - dlugosc tablicy");

        } else {
            data[index] = newData;
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

//    public String[] remove(int index, String[] oldArray) {
//        //usuwanie elementu z tablicy o znanym indeksie
//
//        if (index < 0 || index >= oldArray.length) {
//            System.out.println("Błąd");
//            return new String[0];
//        } else {
//
//            String[] newArray = new String[oldArray.length - 1];
//
//            for (int i = 0; i < oldArray.length; i++) {
//
//                if (i < index) {
//                    newArray[i] = oldArray[i];
//                } else if (i == index) {
//                    //nic nie robimy
//                } else {
//                    newArray[i - 1] = oldArray[i];
//                }
//            }
//
//            return newArray;
//        }
//
//    }

    public void remove(int index) {

        String[] resultArray = new String[this.data.length - 1];

        if (index < 0 || index >= this.data.length) {
            System.out.println("Błąd");

        } else {

            for (int i = 0; i < this.data.length; i++) {

                if (i < index) {
                    resultArray[i] = this.data[i];
                } else if (i != index) {
                    resultArray[i - 1] = this.data[i];
                }

            }
        }

        this.data = resultArray;

    }
}
