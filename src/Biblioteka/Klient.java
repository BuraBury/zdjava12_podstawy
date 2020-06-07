package Biblioteka;

public class Klient {

    private String clientName;
    private int clientID;

    private static int freeID = 0;

    public Klient() {
        this.clientID = freeID;
        freeID++;
    }

    public Klient(String clientName) {
        this.clientName = clientName;
        this.clientID = freeID;
        freeID++;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "clientName='" + clientName + '\'' +
                ", clientID=" + clientID +
                '}';
    }

    public static int getFreeID() {
        return freeID;
    }

    public static void setFreeID(int freeID) {
        Klient.freeID = freeID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
