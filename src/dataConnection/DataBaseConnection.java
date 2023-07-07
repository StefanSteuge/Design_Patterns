package dataConnection;

public class DataBaseConnection extends DataConnection {

    @Override
    public void connect() {
        System.out.println("Підключаюсь до бази даних...");
    }
}
