package dataConnection;

public class WebServiceConnection extends DataConnection{
    @Override
    public void connect() {
        System.out.println("Підключаюсь до веб сервісу...");
    }
}
