package dataConnection;

public class ConnectionFactory {   //Фабричний метод

    public DataConnection createConnection(String type) {
        if (type.equalsIgnoreCase("database")) {
            return new DataBaseConnection();
        } else if (type.equalsIgnoreCase("webservice")) {
            return new WebServiceConnection();
        }
        return null;
    }

}
