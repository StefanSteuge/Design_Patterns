package dataBase;


public class PostgresConnection extends Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Postgres database");
    }
}
