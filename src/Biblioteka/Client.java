package Biblioteka;

public class Client {

    private String clientName;
    private int clientID;

    private static int freeID = 0;

    public Client() {
        this.clientID = freeID;
        freeID++;
    }

    public Client(String clientName) {
        this.clientName = clientName;
        this.clientID = freeID;
        freeID++;
    }

    @Override
    public String toString() {
        return
                "\nImie: " + getClientName() +
                "\nID: " + getClientID();
    }

    public static int getFreeID() {
        return freeID;
    }

    public static void setFreeID(int freeID) {
        Client.freeID = freeID;
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
