package dataConnection;

public class Main {

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();

        DataConnection dbConnection = factory.createConnection("database");
        dbConnection.connect();

        DataConnection webservice = factory.createConnection("webservice");
        webservice.connect();
    }

}
