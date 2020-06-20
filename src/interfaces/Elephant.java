package interfaces;

import java.util.Arrays;
import java.util.Objects;

public class Elephant {
    static String speciesName = "Słoń pospolity";
    //1. statyczne pole jest "wpolne" dla wszystkich obiektow klasy, a "nie statyczne" sa osobne dla kazdego obiektu
    //2. do pol statycznych nie powinnismy sie odwolywac przez obiekty tylko przez nazwe klasy

    int weight;
    String name;

    public Elephant(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elephant " + name + "{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elephant elephant = (Elephant) o;
        return weight == elephant.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    public static void main(String[] args) {
        //wypisywanie opiektu w konsoli oraz porównywanie obiektów metodą equals():
        Elephant elephant = new Elephant(204, "Marek");
        Elephant elephant1 = new Elephant(204, "Szymon");
        System.out.println(elephant.toString());
        System.out.println(elephant1.toString());
        System.out.println(elephant.equals(elephant1));

        System.out.println(speciesName);
        speciesName = "Nie pospolity Słoń";
        System.out.println(speciesName);



    }
}
