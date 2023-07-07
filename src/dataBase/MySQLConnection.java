package dataBase;

public class MySQLConnection extends Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database");
    }
}
