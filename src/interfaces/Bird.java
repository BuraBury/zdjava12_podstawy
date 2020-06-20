package interfaces;

public class Bird implements Singable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sing(String song) {
        System.out.printf("ćwir ćwir, śpiewam %s%n", String.format("%s nazywam się %s", song, getName()));
    }

}
