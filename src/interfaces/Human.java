package interfaces;

public class Human implements Singable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sing(String song) {
        System.out.printf("Lalala, śpiewam %s%n", String.format("%s nazywam się %s", song, getName()));
    }

}
