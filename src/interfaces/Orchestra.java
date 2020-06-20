package interfaces;

public class Orchestra {
    public static void main(String[] args) {
        Singable human = new Human("Paulina");
        Singable human1 = new Human("Janusz");
        Singable bird = new Bird("ptaszek");
        Singable bird1 = new Bird("ćwirek");
        Singable cos = new Bird("malutki");

        Singable[] orchestra = new Singable[2];

        orchestra[0] = human;
        orchestra[1] = bird;

        for (Singable member : orchestra) {

            member.sing("lala");
        }
    }
}
